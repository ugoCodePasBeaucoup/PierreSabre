package personnages;

public class Ronin extends Humain {
	private int honneur;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.honneur = 1;
	}
	
	public int getHonneur() {
		return this.honneur;
	}
	
	public void donner(Commercant beneficiaire) {
		int don = this.getArgent() / 10;
		this.perdreArgent(don);
		this.parler(beneficiaire.getNom() + "prend ces " + don + " sous");
		beneficiaire.recevoir(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (adversaire.getReputation() < 2*this.honneur) {
			this.parler("Je t'ai eu petit yakusa");
			int gain = adversaire.perdre();
			this.gagnerArgent(gain);
			this.honneur++;
		} else {
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			int perte = this.getArgent();
			this.perdreArgent(perte);
			this.honneur--;
			adversaire.gagner(perte);
		}
	}
	
	

}
