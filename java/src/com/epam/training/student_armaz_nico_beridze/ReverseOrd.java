package com.epam.training.student_armaz_nico_beridze;

import java.util.Scanner;

public class ReverseOrd {

	public static void main(String[] args) {
		
		 
	        System.out.print("Enter argument and press <Enter>:");
	        Scanner inputString = new Scanner(System.in);
	        String name = inputString.next();
	        String reversedString = new StringBuffer(name).reverse().toString();
	        System.out.println(reversedString);
	        inputString.close();
	    }
	
	}


