package Curs7;

public class Student extends Persoana {

	private String facultate;

	public Student(String nume, String prenume, String facultate) {
		super(nume, prenume);
		this.facultate = facultate;
		
		this.pub = 2;
		this.prot = 3;
		this.pack = 4;
		this.nume = "NUMELE";
	}
	
}
