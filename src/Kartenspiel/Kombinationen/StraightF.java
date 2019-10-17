package Kartenspiel.Kombinationen;

public class StraightF {

	static public boolean straightF() {
		if (Flush.flush() == true && Straight.straight() == true) {
			return true;
		}
		return false;
	}
}
