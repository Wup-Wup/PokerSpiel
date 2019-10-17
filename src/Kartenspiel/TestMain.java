package Kartenspiel;

import Kartenspiel.Kombinationen.*;
import java.util.Scanner;

public class TestMain extends Karten {

	public static void main(String[] args) {

		double opair = 0;
		double tpair = 0;
		double foak = 0;
		double toak = 0;
		double fhouse = 0;
		double flus = 0;
		double strg = 0;
		double strf = 0;
		double royal = 0;
		int durchlaufe=0;
		
		Scanner durch = new Scanner(System.in);
		System.out.println("Anzahl Versuche:");
		
		while(durchlaufe==0){
			try {
				 durchlaufe=Integer.parseInt(durch.next());
				 
			}catch(Exception e){
				System.out.println("This is not a number");
			}
		}
		
		for (int i = 0; i < durchlaufe; i++) {
			befuellen();
			kartenZiehen();
			if (Pair.onePair()) {
				// System.out.println("Ein Paar");
				opair++;
			}
			if (Pair.twoPair()) {
				// System.out.println("Zwei Paare");
				tpair++;
			}
			if (FourOfAKind.four()) {
				// System.out.println("Ein Vierling");
				foak++;
			}
			if (ThreeOfAKind.three()) {
				// System.out.println("Ein Drilling");
				toak++;
			}
			if (FullHouse.full()) {
				// System.out.println("Ein Fullhouse");
				fhouse++;
			}
			if (Flush.flush()) {
				// System.out.println("Ein Flush");
				flus++;
			}
			if (Straight.straight()) {
				// System.out.println("Eine Straße");
				strg++;
			}
			if (StraightF.straightF()) {
				// System.out.println("Ein straight Flush");
				strf++;
			}
			if (RoyalF.royal()) {
				// System.out.println("Ein royal Flush");
				royal++;
			}
		}
		System.out.println("Versuche: " + durchlaufe);
		System.out.println();
		System.out.println("Paar: " + (opair / durchlaufe) * 100 + "%");
		System.out.println("Zwei Paar: " + (tpair / durchlaufe) * 100 + "%");
		System.out.println("Three of a kind: " + (toak / durchlaufe) * 100 + "%");
		System.out.println("Straight: " + (strg / durchlaufe) * 100 + "%");
		System.out.println("Flush: " + (flus / durchlaufe) * 100 + "%");
		System.out.println("Full House: " + (fhouse / durchlaufe) * 100 + "%");
		System.out.println("Four of a kind: " + (foak / durchlaufe) * 100 + "%");
		System.out.println("Straight Flush: " + (strf / durchlaufe) * 100 + "%");
		System.out.println("Royal Flush: " + (royal / durchlaufe) * 100 + "%");
	}
}