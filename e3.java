class Motor {
private int capacitate;
public Motor(int c) {
capacitate = c;
}
public void setCapacitate(int c) {
capacitate = c;
}
public void tipareste() {
System.out.println("Motor de capacitate " + capacitate);
}
}

// SE VA AFISA "Motor de capacitate 10"