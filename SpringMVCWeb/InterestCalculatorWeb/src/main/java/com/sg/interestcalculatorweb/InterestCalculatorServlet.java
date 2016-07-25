/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.interestcalculatorweb;

import com.sg.interestcalculatorweb.model.Year;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apprentice
 */
@WebServlet(name = "InterestCalculatorServlet", urlPatterns = {"/InterestCalculatorServlet"})
public class InterestCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
        String userPrincipalStr=request.getParameter("userPrincipal");
        String userInterestStr = request.getParameter("userInterest");
        String userYearStr = request.getParameter("userYears");
        
        
        double interestRate = Double.parseDouble(userInterestStr);
        double principal = Double.parseDouble(userPrincipalStr);
        int length = Integer.parseInt(userYearStr);
        
        List<Year> listToReturn = new ArrayList <Year>();
        
        
        
        int startYear = 2016;
        int trackYears = 0;
        int loops = length * 4;
        double currentBalanceRoundOff;
        double interestEarnedRoundOff;
        int returnYear;   
        double currentBalance = principal;

        for (int count = 0; count <= loops; count++) {

            currentBalance = currentBalance * (1 + ((interestRate / 4d) / 100d));

            if (count % 4 == 0) {
                double interestEarned = currentBalance - principal;
                principal = currentBalance;
                trackYears = trackYears + 1;
                 currentBalanceRoundOff = Math.round(currentBalance * 100.0) / 100.0;
                interestEarnedRoundOff = Math.round(interestEarned * 100.0) / 100.0;                
                returnYear = (startYear + trackYears);               
                Year newYear = new Year(returnYear,currentBalanceRoundOff,interestEarnedRoundOff);
                    listToReturn.add(newYear);
            }

        }
 
        request.setAttribute("listToReturn", listToReturn);
        RequestDispatcher rd = request.getRequestDispatcher("response.jsp");
        rd.forward(request, response);

    }
        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}