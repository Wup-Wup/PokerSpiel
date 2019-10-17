package Kartenspiel.Kombinationen;

import java.util.Arrays;

import Kartenspiel.Karten;

public class RoyalF extends Karten {

	static public boolean royal() {

		Arrays.sort(pair);
		if (pair[0] % 13 >= 8 && StraightF.straightF()) {
			return true;
		}
		return false;
	}
}