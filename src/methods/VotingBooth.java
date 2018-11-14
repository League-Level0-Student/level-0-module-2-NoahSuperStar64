package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String Age = JOptionPane.showInputDialog("HOVV NAKMII JEARS OLK ARE JOU†");
	int num = Integer.parseInt(Age);
	if(num > 17) {
		JOptionPane.showMessageDialog(null, "VVO KO JOU TIKMD TE KMEXT BRESIKEKMT ÇOULK PE†");
	}
	else {
		JOptionPane.showMessageDialog(null, "Jour obikmiokm koeskm-t nater†");
	}
}
}
