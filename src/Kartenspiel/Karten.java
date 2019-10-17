package Kartenspiel;

public class Karten {

	final static int anzahl = 51;
	final static int kartenZahlen = 13;
	private static int b;
	private static int a;
	private static String[] Farbe = new String[5];
	private static int[] deck = new int[anzahl + 1];
	private static String[] Karte = new String[5];
	protected static int[] pair= new int[5];

	public static void kartenZiehen() {

		for (int i = 0; i < 5; i++) {

			a = (int) (Math.random() * (anzahl - i));
			b = deck[anzahl - i];
			deck[51 - i] = deck[a];
			deck[a] = b;
			pair[i]=deck[anzahl-i];

			//Farbe zuweisen
			if (deck[anzahl - i] / kartenZahlen == 0) {
				getFarbe()[i] = "Herz";
			}
			if (deck[anzahl - i] / kartenZahlen == 1) {
				getFarbe()[i] = "Kreuz";
			}
			if (deck[anzahl - i] / kartenZahlen == 2) {
				getFarbe()[i] = "Pik";
			}
			if (deck[anzahl - i] / kartenZahlen == 3) {
				getFarbe()[i] = "Karo";
			}
			
			//Zahl zuweisen
			for (int j = 0; j <= 12; j++) {
				if (deck[anzahl - i] % kartenZahlen == j) {
					if (j >= 9) {
						if (j == 9) {
							getKarte()[i] = "Junge";
						}
						if (j == 10) {
							getKarte()[i] = "Dame";
						}
						if (j == 11) {
							getKarte()[i] = "König";
						}
						if (j == 12) {
							getKarte()[i] = "Ass";
						}
					} else {
						getKarte()[i] = Integer.toString(j + 2);
					}
				}
			}
		}
		//System.out.println("Deine Karten sind: \n" + getFarbe()[0] + " " + getKarte()[0] + "\n" + getFarbe()[1] + " " + getKarte()[1] + "\n"
		//		+ getFarbe()[2] + " " + getKarte()[2] + "\n" + getFarbe()[3] + " " + getKarte()[3] + "\n" + getFarbe()[4] + " " + getKarte()[4]);
	}
	public static void befuellen() {
		for (int i = 0; i < 52; i++) {
			deck[i] = i;
		}
	}
	public static String[] getFarbe() {
		return Farbe;
	}
	public static void setFarbe(String[] farbe) {
		Farbe = farbe;
	}
	public static String[] getKarte() {
		return Karte;
	}
	public static void setKarte(String[] karte) {
		Karte = karte;
	}
}