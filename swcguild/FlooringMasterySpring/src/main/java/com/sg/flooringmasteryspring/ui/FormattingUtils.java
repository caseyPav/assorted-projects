/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmasteryspring.ui;

import com.sg.flooringmasteryspring.dao.FlooringMasteryDAOProd;
import com.sg.flooringmasteryspring.dto.StateTax;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class FormattingUtils {

    
    FlooringMasteryDAOProd dao;// = new FlooringMasteryDAOProd();

    public FormattingUtils() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        dao = (FlooringMasteryDAOProd) ctx.getBean("DAOProd");

    }

    
    public String nameFormatter(String input) {
        String noSpacesLeft = input.replaceAll("^\\s+", "");
        String noSpacesRight = noSpacesLeft.replaceAll("\\s+$", "");
        String trollBuster = noSpacesRight.replaceAll("\\\\", "");
        String output = trollBuster.replaceAll(",", "^%^");
        return output;
    }

    
    public String productFormatter(String input) {
        String output = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
        return output;
    }

    
    public String formatState(String input) {
        String working;
        if (input.length() == 2) {
            return working = input.substring(0).toUpperCase();
        } else if (input.length() > 2) {
            working = productFormatter(input);

            List<StateTax> temp = dao.getStateTaxList().stream().filter((a) -> (a.getStateFull()
                    .equalsIgnoreCase(working))).collect(Collectors.toList());
            return temp.get(0).getStateAbv();

        }
        return "They don't think it be like it is, but it do. This is supposed to be unreachable... Please tell me how you did it.";
    }

    
    public boolean amIaState(String input) {
        String regex = "/^[A-z]+$/";
        Pattern pattern = Pattern.compile(regex);
        Matcher onlyLetters = pattern.matcher(input);
        List<StateTax> full = dao.getStateTaxList().stream().filter((a) -> (a.getStateFull()
                .equalsIgnoreCase(input))).collect(Collectors.toList());
        List<StateTax> abv = dao.getStateTaxList().stream().filter((a) -> (a.getStateAbv()
                .equalsIgnoreCase(input))).collect(Collectors.toList());
        //return !full.isEmpty() || !abv.isEmpty() || onlyLetters.matches();
        return true;
    }

    
    public boolean CheckProductForInStock(String input) {
        String regex = "/^[A-z]+$/";
        Pattern pattern = Pattern.compile(regex);
        Matcher onlyLetters = pattern.matcher(input);
        String allTypes = "Wood Tile Laminate Carpet";
        String checkValid = productFormatter(input);
        return allTypes.contains(checkValid) || onlyLetters.matches();
    }

    
    public boolean DateChecker(String input) {
        String regex = "^(1[0-2]|0[1-9])(3[01]|[12][0-9]|0[1-9])[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher checkDate = pattern.matcher(input);
        return checkDate.matches();
    }

    
    public boolean OrderNumberRangeCheck(String input) {
        String regex = "^([1-9][0-9]{0,2}|1000)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher checkDate = pattern.matcher(input);
        return checkDate.matches();
    }

    
    public boolean areaRangeCheck(String input) {
        String regex = "^([1-9][0-9][0-9][0-9]{0,2}|100000)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher checkDate = pattern.matcher(input);
        return checkDate.matches();
    }

}
