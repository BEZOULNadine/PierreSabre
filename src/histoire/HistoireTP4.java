package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof =new Humain("Prof","Kambucha",54);
		prof.direBonjour();
		prof.acheter("une boisson",12);
		prof.boire();
		prof.acheter("un jeu",2);
		prof.acheter("un kimono", 50);
		
		
		
		
		//scenario partie 2 
		Commercant marco = new Commercant("Marco");
		 marco.direBonjour();  
	        marco.seFaireExtorquer();  
	        marco.recevoir(15);  
	        marco.boire();
	}

}
