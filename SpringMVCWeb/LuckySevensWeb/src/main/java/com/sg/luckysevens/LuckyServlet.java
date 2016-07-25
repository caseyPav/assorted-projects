/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.luckysevens;

import java.io.IOException;
import java.util.Random;
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
@WebServlet(name = "LuckyServlet", urlPatterns = {"/LuckyServlet"})
public class LuckyServlet extends HttpServlet {

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

        String userBet = request.getParameter("userBet");

        int wallet = Integer.valueOf(userBet);
        int maxWallet;
        int maxWalletCount;
        int die1;
        int die2;
        int count;

        count = 0;
        maxWallet = 0;
        maxWalletCount = 0;

        while (wallet > 0) {
            count++;
            Random generator = new Random();

            die1 = generator.nextInt(6) + 1;
            die2 = generator.nextInt(6) + 1;

            if (die1 + die2 == 7) {
                wallet += 4;
            } else {
                wallet -= 1;
            }

            if (maxWallet < wallet) {
                maxWallet = wallet;
                maxWalletCount = count;
            }

        }
        
       String countStr = Integer.toString(count);
       String maxMoneyStr = Integer.toString(maxWalletCount);
       String maxWalletStr = Integer.toString(maxWallet);
        //System.out.println("You went broke after " + count + " rolls");
        //System.out.println("You should have stopped after " + maxWalletCount + " rolls when you had $" + maxWallet);

        request.setAttribute("countStr", countStr);
        request.setAttribute("maxMoneyStr", maxMoneyStr);
        request.setAttribute("maxWalletStr", maxWalletStr);
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
