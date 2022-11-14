package personnages;

import java.util.Random;

public class Traitre extends Samourai {
	private int niveauTraitrise = 0;

	public Traitre(String seigneur, String nom, String boisson, int argent) {
		super(seigneur, nom, boisson, argent);
	}
	
	public int getNiveauTraitrise() {
		return niveauTraitrise;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est :" + getNiveauTraitrise() + ". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3) {
		int argentRaconner = commercant.getArgent() * 2 / 10;
		commercant.perdreArgent(argentRaconner);
		gagnerArgent(argentRaconner);
		niveauTraitrise++;
		parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi "+ argentRaconner + " sous ou gare à toi !");
		commercant.parler("Tout de suite grand " + getNom() + ".");
		} else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}

	}
	
	public void faireLeGentil() {
		if (nbConnaisssance < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif");
		} else {
			Random rand = new Random();
			int rangAmi = rand.nextInt(nbConnaisssance);
			Humain ami = memoire[rangAmi];
			int don = getArgent() * 1 / 20;
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + ami.getNom());
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			ami.gagnerArgent(don);
			perdreArgent(don);
			ami.parler("Merci " + getNom() + ". Vous êtes quelqu'un de bien");
			
			if (niveauTraitrise > 0) {
				niveauTraitrise--;
			}
		}

	}

}
