package com.sg.flooringmasteryspring.ui;

import com.sg.flooringmasteryspring.dao.FlooringMasteryDAOProducts;
import com.sg.flooringmasteryspring.dao.FlooringMasteryDAOStates;
import com.sg.flooringmasteryspring.dao.ProductsDAOInterface;
import com.sg.flooringmasteryspring.dao.StatesDAOInterface;
import com.sg.flooringmasteryspring.dto.Product;
import com.sg.flooringmasteryspring.dto.StateTax;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FormattingUtils {

    StatesDAOInterface states;
    ProductsDAOInterface products;

    public FormattingUtils(StatesDAOInterface states, ProductsDAOInterface products) {
        this.products = products;
        this.states = states;
    }
    
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public String nameFormatter(String input) {
        String noSpacesLeft = input.replaceAll("^\\s+", "");
        String noSpacesRight = noSpacesLeft.replaceAll("\\s+$", "");
        String amIaTroll = noSpacesRight.replaceAll("\\\\", "");
        String output = amIaTroll.replaceAll(",", "^%^");
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

            List<StateTax> temp = states.getStateTaxList().stream().filter((a) -> (a.getStateFull()
                    .equalsIgnoreCase(working))).collect(Collectors.toList());
            return temp.get(0).getStateAbv();

        }
        return "They don't think it be like it is, but it do. This is supposed to be unreachable... Please tell me how you did it.";
    }

    public boolean amIaState(String input) {
        String regex = "/^[A-z]+$/";
        Pattern pattern = Pattern.compile(regex);
        Matcher onlyLetters = pattern.matcher(input);
        List<StateTax> full = states.getStateTaxList().stream().filter((a) -> (a.getStateFull()
                .equalsIgnoreCase(input))).collect(Collectors.toList());
        List<StateTax> abv = states.getStateTaxList().stream().filter((a) -> (a.getStateAbv()
                .equalsIgnoreCase(input))).collect(Collectors.toList());
        return !full.isEmpty() || !abv.isEmpty() || onlyLetters.matches();
    }

    public boolean checkProductForInStock(String input) {
        List<Product> isItaProduct = products.getProductList().stream().filter((a) -> (a.getName()
                .equalsIgnoreCase(input))).collect(Collectors.toList());
        return !isItaProduct.isEmpty();
    }

    public boolean dateChecker(String input) {
        String regex = "^(1[0-2]|0[1-9])(3[01]|[12][0-9]|0[1-9])[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher checkDate = pattern.matcher(input);
        return checkDate.matches();
    }

    public boolean orderNumberRangeCheck(String input) {
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

    public String randomAlphaNumeric(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

}
