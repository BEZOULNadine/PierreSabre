package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;

	}
	
	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler("Marco, si tu tiens à la vie donne moi ta bourse !");
		int argentvole = victime.seFaireExtorquer();
		gagnerArgent(argentvole);
		reputation++;
		parler("J'ai piqué les " + argentvole + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi ! Hi !");

	}

	public String getClan() {
		return clan;
	}

	public void perdre() {
		perdreArgent(getArgent());
		reputation--;
		parler("J’ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
	}

	public void gagner(int gain) {
		super.gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre Yaku Le Noir du clan de " + clan + "? Je l'ai dépouillé de ses " + gain
				+ " sous.");
	}

}
