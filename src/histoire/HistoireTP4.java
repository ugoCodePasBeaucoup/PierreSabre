package histoire;
import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain ("Prof", "kombucha", 54);
//		prof.direBonjour();
//		prof.acheter("boisson", 12);
//		prof.boire();
//		prof.acheter("jeu", 2);
//		prof.acheter("kimono", 50);
		
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin ("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);
		
		
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
		
		
		
//		yaku.direBonjour();
//		yaku.extorquer(marco);
		
		
//		roro.direBonjour();
//		roro.donner(marco);
//		roro.provoquer(yaku);
		
//		marco.faireConnaissanceAvec(roro);
//		marco.faireConnaissanceAvec(yaku);
//		marco.faireConnaissanceAvec(chonin);
//		marco.faireConnaissanceAvec(kumi);
//		marco.listerConnaissance();
//		roro.listerConnaissance();
//		yaku.listerConnaissance();
		
		
		
//		akimoto.faireConnaissanceAvec(marco);
//		akimoto.listerConnaissance();
		
		
		
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		
		akimoto.faireConnaissanceAvec(masako);
		masako.ranconner(marco);
		masako.faireConnaissanceAvec(yaku);
		masako.faireLeGentil();
		masako.faireConnaissanceAvec(roro);
		
		masako.faireLeGentil();
		masako.faireLeGentil();
		
	}
}
