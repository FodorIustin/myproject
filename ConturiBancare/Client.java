package ConturiBancare;

import java.util.HashSet;
import java.util.Random;

public class Client {
		private String nume,adresa;
		private HashSet<ContBancar> conturi;
		
		
		public Client(String nume, String adresa, HashSet<ContBancar> conturi) {
			super();
			this.nume = nume;
			this.adresa = adresa;
			conturi = new HashSet<ContBancar>(5);
			if(conturi.size() > 5) {
				System.out.println("Nu se pot retine decat primele 5 conturi");
				int index = 5;
				for(ContBancar c : conturi) {
					this.conturi.add(c);
					index--;
					if(index == 0)
						break;
				}
			}
			else if(conturi.size() == 0) {
				Random myRandom = new Random();
				int contIndex = myRandom.nextInt(5);
				ContLei c = new ContLei(nume +contIndex);
				conturi.add(c);
				
			}else
			this.conturi = conturi;
		}
		public void String toString(){
			String afisare = nume + " " + adresa + "\n";
			for(ContBancar c : conturi )
				afisare += c.toString() + "\n";
				return afisare;
				
		}
		public boolean equals(Client c) {
			if(this.nume.equals(c.nume))
				return true;
			else
				return false;
		}
		
		
}
