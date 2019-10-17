package Kartenspiel.Kombinationen;

import Kartenspiel.Karten;

public class FourOfAKind extends Karten{
	
public static boolean four() {
		
	int zahler=0;
		for (int i = 0; i < pair.length-1; i++) {
			for(int j=i+1; j<pair.length;j++) {
						if((pair[i]%13)==(pair[j]%13)){
							zahler++;
				}
			}
		}
		if(zahler==6) {
			return true;
		}
		
		return false;
	}
	

}
