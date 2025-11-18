package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	private Humain[] memoire; // Tab pour sauvegarder les humains deja rencontre
	private int nbConnaisance;

	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
		this.memoire = new Humain[30];
		this.nbConnaisance = 0;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void direBonjour() {

		parler("Bonjour ! Je m'appele " + nom + " et j'aime boire du " + boissonFavorite);
	}

	public void boire() {
		parler("Mmmm," + " un bon verre de " + boissonFavorite + "!GLOUPS!");

	}

	public void acheter(String bien, int prix) {
		int argentancien = argent;
		if (argent >= prix) {
			argent -= prix;
			parler("j'ai " + argentancien + " sous en poche .Je vais pouvoir m'offrir " + bien + " a " + prix
					+ " sous ");
		} else {
			parler("Je n'ai plus que " + argentancien + " sous en poche. Je ne peux mÃªme pas m'offrir " + bien + " a  "
					+ prix + " sous.");
		}

	}

	protected void gagnerArgent(int argentgagne) {
		argent += argentgagne;
	}

	protected void perdreArgent(int argentperdu) {
		argent -= argentperdu;

	}

	protected void parler(String texte) {
		System.out.println("(" + nom + " )-" + texte);

	}

	// TP5
	public void faireConnaissanceAvec(Humain humain2) {
		this.direBonjour();
		humain2.repondre(this);
		this.memoriser(humain2);
	}

	private void memoriser(Humain humain) {
		if (nbConnaisance < 30) {
			memoire[nbConnaisance] = humain;
			nbConnaisance++;
		} 
	}

	public void repondre(Humain humain1) {
		this.direBonjour();
		this.memoriser(humain1);
	}

	public void listerConnaissances() {
		if (nbConnaisance == 0) {
			parler("Je n'ai rencontré personne.");
		} else {
			parler("Je connais beaucoup de monde dont  ");
			for (int i = 0; i < nbConnaisance; i++) {
				System.out.println(memoire[i].getNom());
			}

		}
	}
}
