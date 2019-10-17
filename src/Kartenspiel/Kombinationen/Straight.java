package Kartenspiel.Kombinationen;

import java.util.Arrays;

import Kartenspiel.Karten;

public class Straight extends Karten {

	static public boolean straight() {

		int[] modul = new int[5];

		for (int i = 0; i < pair.length; i++) {
			modul[i] = pair[i] % 13;
		}

		Arrays.sort(modul);

		for (int i = 0; i < modul.length - 1; i++) {
			if (modul[i] + 1 == modul[i + 1]) {
				continue;
			}
			return false;
		}
		return true;
	}

}
