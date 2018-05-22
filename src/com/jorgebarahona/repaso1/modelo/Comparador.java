package com.jorgebarahona.repaso1.modelo;

import java.util.Comparator;

public class Comparador implements Comparator<Facturas>{

	@Override
	public int compare(Facturas o1, Facturas o2) {
		if(o1.getId()>o2.getId()) {
			return 1;
		} else if(o1.getId()<o2.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
}
