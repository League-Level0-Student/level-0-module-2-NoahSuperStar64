//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
	
		
		

		// 1. Use each value of randomNumber to give the user a random compliment.
       for(int i = 0; i < 11; i++) {
    	   int randomNumber = randomMaker.nextInt(5);
		if(randomNumber == 0) {
        	JOptionPane.showMessageDialog(null, "You look 20% cooler than ever!");
        }
        else if(randomNumber == 1) {
        	JOptionPane.showMessageDialog(null, "Jou lod 20% koler takm ewer‡");
        }
        else if(randomNumber == 2) {
        	JOptionPane.showMessageDialog(null, "No compliment for you!");
        }
        else if(randomNumber == 3) {
        	JOptionPane.showMessageDialog(null, "You are the very best like no one ever was");
        }
        else {
        	JOptionPane.showMessageDialog(null, "you dj veer goo awg shoutout to djpengun check out his channel the jamming gamer for top notch minecraft story mode gameplay");
        }
       }
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
