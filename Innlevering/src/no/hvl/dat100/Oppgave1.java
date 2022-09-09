package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class Oppgave1 {

	public static void main(String[] args) {
		
		double trinn1 = 0.017;
		double trinn2 = 0.04; 
		double trinn3 = 0.134;
		double trinn4 = 0.164;
		double trinn5 = 0.174;
		
		String bruttoInntektTxt = showInputDialog("Bruttoinntekt?");
		
		int bruttoInntekt = Integer.parseInt(bruttoInntektTxt);
		
		if (bruttoInntekt <= 267900) {
			showMessageDialog(null, "Du er på skattetrinn 1, du betaler " + bruttoInntekt* trinn1 + " kr i skatt");
		}
		
		else if (bruttoInntekt >= 267900 && bruttoInntekt < 643800) {
			showMessageDialog(null, "Du er på skattetrinn 2, du betaler " + bruttoInntekt* trinn2 + " kr i skatt");
		}
		
		else if (bruttoInntekt >= 643800 && bruttoInntekt < 969200) {
			showMessageDialog(null, "Du er på skattetrinn 3, du betaler " + bruttoInntekt* trinn3 + " kr i skatt");
		}
		
		else if (bruttoInntekt >= 969200 && bruttoInntekt < 2000000) {
			showMessageDialog(null, "Du er på skattetrinn 4, du betaler " + bruttoInntekt* trinn4 + " kr i skatt");
        }
		
		else if (bruttoInntekt >= 2000000) {
			showMessageDialog(null, "Du er på skattetrinn 5, du betaler " + bruttoInntekt* trinn5 + " kr i skatt");
			
		}
	}
}
