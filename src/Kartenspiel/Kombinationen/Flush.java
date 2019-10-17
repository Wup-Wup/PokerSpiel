package Kartenspiel.Kombinationen;

import Kartenspiel.Karten;

public class Flush extends Karten {

	static public boolean flush() {

		int zahler = 0;
		for (int i = 0; i < pair.length - 1; i++) {
			for (int j = i + 1; j < pair.length; j++) {
				if ((pair[i] / 13) == (pair[j] / 13)) {
					zahler++;
				}
			}
		}
		if (zahler == 10) {
			return true;
		}
		return false;
	}
}