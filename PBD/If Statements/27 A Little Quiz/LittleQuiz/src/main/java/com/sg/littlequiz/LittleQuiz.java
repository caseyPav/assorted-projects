/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.littlequiz;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class LittleQuiz {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int correctAnswers = 0;
        
        System.out.println("are you ready for a little quiz?");
        System.out.println("i dont care if you are ");
        
        System.out.println("Question 1: Which of these is the number 7?");
        System.out.println("        (1) 6");
        System.out.println("        (2) 7");
        System.out.println("        (3) 4");
        int answerOne = sc.nextInt();
        
        if (answerOne == 2){
            correctAnswers = (correctAnswers + 1);
            System.out.println("Correct");
        }
        else if (answerOne == 1) {
            System.out.println("wrong dummy");
        }else if (answerOne == 3){
            System.out.println("wrongggg");
        }
                System.out.println("Question 2: Which of these is the number 7?");
        System.out.println("        (1) 6");
        System.out.println("        (2) 7");
        System.out.println("        (3) 4");
        int answerTwo = sc.nextInt();
        
        if (answerTwo == 2){
            correctAnswers = (correctAnswers + 1);
            System.out.println("Correct");
        }
        else if (answerTwo == 1) {
            System.out.println("wrong dummy");
        }else if (answerTwo == 3){
            System.out.println("wrongggg");
        }
                System.out.println("Question 1: Which of these is the number 7?");
        System.out.println("        (1) 6");
        System.out.println("        (2) 7");
        System.out.println("        (3) 4");
        int answerThree = sc.nextInt();
        
        if (answerThree == 2){
            correctAnswers = (correctAnswers + 1);
            System.out.println("Correct");
        }
        else if (answerThree == 1) {
            System.out.println("wrong dummy");
        }else if (answerThree == 3){
            System.out.println("wrongggg");
        }
        System.out.println("you got this many right  " + correctAnswers);
    }
    
}
