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
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
		
		
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
//		yaku.direBonjour();
//		yaku.extorquer(marco);
		
		Ronin roro = new Ronin ("Roro", "shochu", 60);
//		roro.direBonjour();
//		roro.donner(marco);
//		roro.provoquer(yaku);
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
		
		
		
		
	}
}
