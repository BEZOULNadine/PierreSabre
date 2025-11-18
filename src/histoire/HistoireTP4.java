package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

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
	
	
	
	
	// scenario partie 3 
	        Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
	        yaku.direBonjour();

	        yaku.extorquer(marco);
	        
	        
	     // Partie 4 :
	        Ronin roro = new Ronin("Roro", "shochu", 60);
	        roro.direBonjour();
	        roro.donner(marco); 
	        marco.boire();  

	        // Partie 5 : 
	        roro.provoquer(yaku); 
	    }
	}

