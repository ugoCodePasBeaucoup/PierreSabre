package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public void extorquer(Commercant victime) {
		super.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?\n"
						+ victime.getNom() + " si tu tiens à ta vie, donne moi ta bourse !!!");
		int gain = victime.seFaireExtorquer();
		super.gagnerArgent(gain);
		super.parler("J'ai piqué les " + gain + " sous de " + victime.getNom() 
						+ ", ce qui me fait " + super.getArgent() + " sous dans ma poche. Hi ! Hi!");
	}
	
	
	
}
