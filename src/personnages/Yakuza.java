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
		reputation++;
		super.parler("J'ai piqué les " + gain + " sous de " + victime.getNom() 
						+ ", ce qui me fait " + super.getArgent() + " sous dans ma poche. Hi ! Hi!");
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + getClan() + " ? Je l'ai dépuoillé de ses "
		+ gain + " sous");
	}
	
	public int perdre() {
		int perte = getArgent();
		perdreArgent(perte);
		reputation--;
		parler("J'ai perdu mon duel et mes "+ perte + " sous, snif... J'ai déshonoré le clan de " + getClan());
		return perte;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + getClan());
	}

	
	
	
	
}
