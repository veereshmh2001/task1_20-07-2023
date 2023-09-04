package com.xworkz.crud.app.runnre;

import com.xworkz.crud.app.impl.ArtistImpl;
import com.xworkz.crud.app.reopsitory.Artist;

public class ArtistRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in ArtistRunner");
		
		Artist artistRepo=new ArtistImpl();
		artistRepo.save("Raja Ravi Varma");
        artistRepo.save("Amrita Sher-Gil");
        artistRepo.save("M.F. Husain");
        artistRepo.save("Tyeb Mehta");
        artistRepo.save("S.H. Raza");
        artistRepo.save("F.N. Souza");
        artistRepo.save("Jamini Roy");
        artistRepo.save("Nandalal Bose");
        artistRepo.save("Rabindranath Tagore");
        artistRepo.save("Anjolie Ela Menon");
        
        

	}

}
