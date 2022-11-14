package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	private int tailleMemoire = 3;
	protected Humain[] memoire = new Humain [tailleMemoire];
	protected int nbConnaisssance = 0;
	
	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public int getNbConnaisssance() {
		return nbConnaisssance;
	}
	public Humain[] getMemoire() {
		return memoire;
	}
	
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix > argent) {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un(e) " + bien 
					+ " à " + prix + " sous.");
		} else {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un(e) " + bien 
					+ " à " + prix + " sous.");
			perdreArgent(prix);
		}

	}
	
	protected void gagnerArgent(int gain) {
		argent += gain;
	}
	
	protected void perdreArgent(int perte) {
		argent -= perte;
		if (argent < 0) {
			throw new IllegalArgumentException("Création dete : " + argent);
		}
	}
	
	protected void parler(String texte) {
		System.out.println(nom + " prend la parole : " + " \" " + texte + " \" \n");
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		System.out.println("=== " + getNom() + " rencontre " + autreHumain.getNom() + "\n");
		direBonjour();
		autreHumain.repondre(this);
		memorise(autreHumain);
	}

	private void memorise(Humain autreHumain) {
		if (nbConnaisssance >= tailleMemoire){
			for (int i = 0; i<nbConnaisssance-1; i++) {
				this.memoire[i] = this.memoire[i+1];
			}
		this.memoire[tailleMemoire-1] = autreHumain;
		}else {
			this.memoire[nbConnaisssance] = autreHumain;
			nbConnaisssance++;
		}
		
	}

	private void repondre(Humain humain) {
		this.direBonjour();
		this.memorise(humain);
	}
	
	public void listerConnaissance() {
		StringBuilder texte = new StringBuilder("Je connais beaucoup de monde dont : ");
		for (int i = 0; i < nbConnaisssance; i++) {
			texte.append(memoire[i].getNom() + ", ");
		}
		texte.delete(texte.length()-2, texte.length());
		this.parler(texte.toString());
	}
	
	
	
	
	
}
