package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

    public Ronin(String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent);
    }

    
    public void donner(Commercant beneficiaire) {
        int montant = (int) (getArgent() * 0.10); 
        if (montant > 0) {
        	perdreArgent(montant);
            parler("Marco prend ces " + montant + " sous.");  
            beneficiaire.recevoir(montant); 
        }
    }

    
    public void provoquer(Yakuza adversaire) {
        int force = 2 * honneur; 
        parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");

        if (force >= adversaire.getReputation()) {
        
            parler("Je t’ai eu petit yakuza!");
            adversaire.perdre(); 
            honneur++; 
            gagnerArgent(adversaire.getArgent());
            adversaire.perdreArgent(adversaire.getArgent()); 
        } else {
           
            parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
           honneur--; 
            perdreArgent(getArgent()); 
            adversaire.gagnerArgent(getArgent());
        }
    }

}
