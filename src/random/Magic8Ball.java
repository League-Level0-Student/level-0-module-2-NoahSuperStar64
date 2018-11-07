//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random gen = new Random();
int Number = gen.nextInt(4);
	// 3. Print out this variable
System.out.println(Number);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Asd akmiitikmg, akme I çal çare nii dkmovvledç:e vvit jou† † †");
	// 5. If the random number is 0
if(Number == 0) {
	// -- tell the user "Yes"
JOptionPane.showMessageDialog(null, "Jes");
}
	// 6. If the random number is 1
else if(Number == 1) {
	// -- tell the user "No"
JOptionPane.showMessageDialog(null, "Kmaux");
}
	// 7. If the random number is 2
else if(Number == 2) {
	// -- tell the user "Maybe you should ask Google?"
JOptionPane.showMessageDialog(null, "NAIIPE JOU ÇOULK ASD GOGLE†");
}
	// 8. If the random number is 3
else {
	// -- write your own answer
JOptionPane.showMessageDialog(null, "VVAT KO JOU NEAKM JOU SAKM-T UKMEERSTAKME NE†");
}
}
}
