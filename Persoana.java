public class Persoana {

	private static int contor= 0;
	
	private String nume;
	public int varsta;
	
	public static final String SPECIA= "Homo sapiens";
	
	public Persoana(String nume, int varsta) {
		this.nume = nume;
		this.varsta = varsta;
		contor++;
	}
	
	public Persoana (String nume) {
		this.nume=nume;
		this.varsta=0;
		contor++;
	}
	
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public String getNume() {
		return nume;
	}
	
	public void afisareInformatiiPersoana() {
		System.out.println("Ma numesc " +nume+ " si am varsta de " +varsta+ " ani, si sunt a "+ contor + "-persoana aparuta");
	}
	@Override
	public String toString() {
		return "Ma numesc " +nume+ " si am varsta de " +varsta+ " ani, si sunt a "+ contor + "-persoana aparuta";
	}
	public boolean equals(Persoana p) {
		if(this.nume == p.nume  && this.varsta == p.varsta)
			return true;
		else 
			return false;
	}

	public void setDatePersonale(String nume, int varsta) {
		this.nume=nume;
		this.varsta=varsta;
		System.out.println("setDatePersonale(String , int ) ");
	} 
	
	public void setDatePersonale(int varsta,String nume) {
		this.nume=nume;
		this.varsta=varsta;
		System.out.println("setDatePersonale(int, String ) ");
		}
	
	public void afisareNumar (float nr) {
		System.out.println("Am primmit parametru de tip float: "+ nr);
		nr=100;
	}
	
	public void afisareNumar (double nr) {
		System.out.println("Am primmit parametru de tip double: "+ nr);
	}
	public void reseteazaVarstaPersoanei(Persoana p) {
		p = new Persoana("Radu" , 25);
		p.setVarsta(0);
	}
	

}