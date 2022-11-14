package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int perte = getArgent();
		perdreArgent(perte);
		parler("Le monde est trop injuste, j'ai tout perud !!");
		return(perte);
	}
	
	public void recevoir(int argent) {
		super.gagnerArgent(argent);
		super.parler(argent + " sous ! Je te remercie généreux donateur !");
	}
	
}
