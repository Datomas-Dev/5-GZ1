/*	Filename: RandomGuess2.java
	Date: 8/2/19
	Author: David T.
	
	description...
*/

import javax.swing.JOptionPane;

public class RandomGuess2
{
    public static void main(String[] args)
    {
    	int guess;
    	int randNum = (1+(int)(Math.random()*10));
    	
        guess = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a number between 1 and 10.","Guess a Number",JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null, "The number is "+randNum+". Your guess ("+guess+") was "+ ((randNum > guess)?"too low!":((randNum < guess)?"too high!":"on the nose!")));
    }
}