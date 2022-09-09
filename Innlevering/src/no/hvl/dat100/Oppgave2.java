package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave2 {

	public static void main(String[] args) {
		
final int ANT_ELEVER = 10;

	for(int elevNR = 1; elevNR <= ANT_ELEVER; elevNR++) {
		
		String poengTxt = showInputDialog("Antall poeng?");
		int poeng = Integer.parseInt(poengTxt);
		
		if (poeng >= 0 && poeng <=39) {
			showMessageDialog(null, "Din karakter er F");
		}
		
		else if (poeng >= 40 && poeng <= 49) {
			    showMessageDialog(null, "Din karakter er E");
		}
		
		else if (poeng >= 50 && poeng <= 59) {
			showMessageDialog(null, "Din karakter er D");
		}
		
		else if (poeng >= 60 && poeng <= 79) {
			showMessageDialog(null, "Din karakter er C");
        }
		
		else if (poeng >= 80 && poeng <= 89) {
			showMessageDialog(null, "Din karakter er B");
        }
		
		else if (poeng >= 90 && poeng <= 100) {
			showMessageDialog(null, "Din karakter er A");
		}
		
		else {
			showMessageDialog(null, "ugyldig poengsum");
				elevNR--;
		}
	}
	}	
}
