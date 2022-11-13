package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	
	public String getClan() {
		return this.clan;
	}
	
	public int getReputation() {
		return this.reputation;
	}
	
	public void extorquer(Commercant victime) {
		super.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		super.parler(victime.getNom() + " si tu tiens à ta vie, donne moi ta bourse !!!");
		int gain = victime.seFaireExtorquer();
		super.gagnerArgent(gain);
		this.reputation++;
		super.parler("J'ai piqué les " + gain + " sous de " + victime.getNom() 
						+ ", ce qui me fait " + super.getArgent() + " sous dans ma poche. Hi ! Hi!");
	}
	
	public void gagner(int gain) {
		this.gagnerArgent(gain);
		this.reputation++;
		this.parler("Ce ronin pensait vraiment battre " + this.getNom() + " du clan de " + this.getClan() + " ? Je l'ai dépuoillé de ses "
		+ gain + " sous");
	}
	
	public int perdre() {
		int perte = this.getArgent();
		this.perdreArgent(perte);
		this.reputation--;
		this.parler("J'ai perdu mon duel et mes "+ perte + " sous, snif... J'ai déshonoré le clan de " + this.getClan());
		return perte;
	}

	
	
	
	
}
