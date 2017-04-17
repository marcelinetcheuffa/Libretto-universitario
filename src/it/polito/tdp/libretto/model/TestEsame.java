package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestEsame {

	public static void main(String[] args) {
		Esame tdp = new Esame("03FYZ" , "Tecniche di Programmaxione",
				"Fulvio Corno");
		System.out.println(tdp);
		
		Esame ami = new Esame ("01QZP","Ambient Intelligent",
				"Fulvio Corno");
		System.out.println(ami);
		System.out.println(ami.equals(tdp));
		
		tdp.supera(30, LocalDate.now());
		System.out.println(tdp);
//		tdp.supera(18, LocalDate.now());
//		System.out.println(tdp);
	
		ami.supera(18,LocalDate.now());
		System.out.println(ami);
		
		

	}

}
