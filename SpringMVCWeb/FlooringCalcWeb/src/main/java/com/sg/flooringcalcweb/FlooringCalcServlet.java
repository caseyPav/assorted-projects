/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringcalcweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apprentice
 */
@WebServlet(name = "FlooringCalcServlet", urlPatterns = {"/FlooringCalcServlet"})
public class FlooringCalcServlet extends HttpServlet {


protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        String userCostPsfStr=request.getParameter("userCostPsf");
        String userWidthStr = request.getParameter("userWidth");
        String userLengthStr = request.getParameter("userLength");









}
}