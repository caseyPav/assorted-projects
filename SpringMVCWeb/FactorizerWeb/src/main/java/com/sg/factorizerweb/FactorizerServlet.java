/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.factorizerweb;

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
@WebServlet(name = "FactorizerServlet", urlPatterns = {"/FactorizerServlet"})
public class FactorizerServlet extends HttpServlet {

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
        
                

        String factorStr=request.getParameter("userNumber");

        
        int factorNumber = 1;

        System.out.print("What number would you like to factor?   ");
        int factor = Integer.valueOf(factorStr);
        List<Integer> factorsList = new ArrayList<Integer>();
        System.out.println("\nThe factors of " + factor + " are");

        //factor the number and display results
        while (factorNumber <= factor) {
            if (factor % factorNumber == 0) {
                factorsList.add(factor);
            }
            factorNumber++;
        }
        StringBuilder sb = new StringBuilder();
for (Integer number : factorsList) {
  sb.append(number != null ? number.toString() : "");
}

String allTheFactors = sb.toString();
        //check for perfect number
        int perfectCheck = 0;
        String perfectResult="";
        for (int n = 1; n <= factor / 2; n++) {
            if (factor % n == 0) {
                perfectCheck += n;
            }
        }
        if (perfectCheck == factor) {
            perfectResult=factor + " is a perfect number";

        } else {
            perfectResult=factor + " is not a perfect number";

        }

        // check for prime
        int primeCheck = 2;
        int primeCheckResult = 0;
        String primeResult;

        while (primeCheck <= factor / 2) {
            if (factor % primeCheck == 0) {
                primeCheckResult = 1;
            }
            primeCheck++;
        }
        if (primeCheckResult == 1) {
            primeResult = factor + " is not a prime number.";
        } else {
            primeResult = factor + " is a prime number.";
        }
    

      
        request.setAttribute("allTheFactors", allTheFactors);
        request.setAttribute("perfectResult", perfectResult);
        request.setAttribute("primeResult", primeResult);
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