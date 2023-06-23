package examen;

 public class FluturasSalar extends Act {
    private double valoareSalar;
    private Angajat angajat;

    public FluturasSalar(double valoareSalar, Angajat angajat) {
        this.setValoareSalar(valoareSalar);
        this.setAngajat(angajat);
    }

	public double getValoareSalar() {
		return valoareSalar;
	}

	public void setValoareSalar(double valoareSalar) {
		this.valoareSalar = valoareSalar;
	}

	public Angajat getAngajat() {
		return angajat;
	}

	public void setAngajat(Angajat angajat) {
		this.angajat = angajat;
	}

}
