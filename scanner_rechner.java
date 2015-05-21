package erstenprojekte;
import java.util.Scanner;

import javax.swing.*;

public class scanner_rechner {

	
	public static void main(String[] args) { 	
		float[] loesungen = new float[3];
		//int x=0;
		boolean w=true;
		float hochzaehlungbisdrei = 0; 
		float anzahlallerberechnungen = 0;
		float rundenzaehler = 0;
		float loesung = 0;
		System.out.println("Hallo, das ist der Rechner" );		
		
		while (w) {
			
			for(int x=0; x<3; x++ ) {	/* Läuft drei mal durch, da es die Array-Speicherplätze reguliert von 0-2, also drei Stellen */
				
				if (hochzaehlungbisdrei == 3) { /*hat fast in jedem einzelnen Programmpunkt den selben Wert wie das x, die Variable wurde nur aufgrund von übersichtlichkeit erstellt */
					hochzaehlungbisdrei = 0;
				} 
				/*if (hochzaehlung %3 != 0) {
					
				}
				else {
					x = 0;
				} */
				Scanner scanner = new Scanner(System.in);				/*Scanner wird erstellt, System.in bedeutet das er auf die Konsole zugreift und da scannt */ 
				 String erstezahl = scanner.next(); 
				 String operator = scanner.next(); 
				 String zweitezahl = scanner.next();
				
			
				 //Integer i1 = new Integer(erstezahl);
				 //Integer i2 = new Integer(zweitezahl);
				 float i1=Float.parseFloat(erstezahl);
				 float i2=Float.parseFloat(zweitezahl);
				 
				 

				 switch (operator) {	/*switch schleife, überprüfung welcher Operator */

					case "/":
						loesung = i1 / i2;
						loesungen[x] = loesung;
						break;

					case "*":
						loesung = i1 * i2;
						loesungen[x] = loesung;
						break;
					
					case "+":
						loesung = i1 + i2;
						loesungen[x] = loesung;
						break;
					
					case "-":
						loesung = i1 - i2;
						loesungen[x] = loesung;
						break;
						
					default:
						System.out.println("Ich kenne " + operator + " nicht!");
						loesung = 0;

					}
				 hochzaehlungbisdrei++;
				 anzahlallerberechnungen++;
				 
				 if(hochzaehlungbisdrei == 1 && anzahlallerberechnungen <3 ) {
				 System.out.println(loesungen[0]+" So lautet die jetztige Lösung ");
				 }
				 else if(hochzaehlungbisdrei == 2 && anzahlallerberechnungen< 3) {
					 System.out.println("So lautet die vorherige Lösung "+loesungen[0]+ " So lautet die neue Lösung " + loesungen[1]);
				 }
				 else if(hochzaehlungbisdrei > 2 && anzahlallerberechnungen <= 3) {
					 String loesungnull = Float.toString(loesungen[0]);
					 String loesungeins = Float.toString(loesungen[1]);
					 String loesungzwei= Float.toString(loesungen[2]);
					 System.out.println("vorletzte lösung " +loesungnull +" die letzte lösung war " + loesungeins+" die aktuelle lösung ist: " + loesungzwei );
				 }
				 
				if (hochzaehlungbisdrei == 3) {
					 rundenzaehler++;
				 }
				if (anzahlallerberechnungen> 3) {
					 String loesungnull = Float.toString(loesungen[0]);
					 String loesungeins = Float.toString(loesungen[1]);
					 String loesungzwei= Float.toString(loesungen[2]);
					 float anzahlvollerrunden = rundenzaehler * 3; // Um auf die Anzahl der Durchgänge bis zum Ende der letzten Runde zu kommen, eine Runde geht bis 3, wegen der Arraylänge
					 float rangfolgeunterscheidung = anzahlallerberechnungen- anzahlvollerrunden;
					 if(rangfolgeunterscheidung == 1) {
						 System.out.println("vorletzte lösung " + loesungeins + " die letzte lösung war " + loesungzwei+" die aktuelle lösung ist: " + loesungnull );
					 }
					 else if(rangfolgeunterscheidung == 2) {
						 System.out.println("vorletzte lösung "+ loesungzwei +" die letzte lösung war " + loesungnull+" die aktuelle lösung ist: " + loesungeins);
					 }
					 else  { 
						 System.out.println("vorletzte lösung "+ loesungnull +" die letzte lösung war " + loesungeins+" die aktuelle lösung ist: " + loesungzwei);
					 }					 	 							
				 }
				System.out.println("Noch eine Berechnung? Schreiben sie \"ja\" oder \"nein\" ");
				if (scanner.next().equals("nein") ){
					w=false;
					break; /*Abbruch der Schleifen */
				}
							
			}
		}
		
	}
}
