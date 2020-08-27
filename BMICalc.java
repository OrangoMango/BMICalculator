package com.orangomango.bmicalculator;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.io.*;

public class BMICalc {

  public static double calcBMI(int height, int weight){
  
    double Mheight = height / 100.0;
    
    double bmi = weight / ((double) Mheight * Mheight);
    return bmi;
  }

  public static void main(String[] args) throws IOException {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter height (cm): ");
     int height = Integer.parseInt(reader.readLine());
     System.out.println("Enter weight (kg): ");
     int weight = Integer.parseInt(reader.readLine());
     
     double bmi = calcBMI(height, weight);
     
     NumberFormat formatter = new DecimalFormat("##.##");
     
     System.out.println("Your BMI is: "+formatter.format(bmi));
     
     if (bmi < 18.5){
       System.out.println("You are underweight");
     } else if (bmi < 25){
       System.out.println("You are normalweight");
     } else if (bmi < 30){
       System.out.println("You are overweight");
     } else {
       System.out.println("You highly overweighted");
     }
  }
}