package Transmitters;

public class Person {
	private String name;
	private Transmitter transmitter;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Transmitter getTransmitter() {
		return transmitter;
	}
	public void setTransmitter(Transmitter transmitter) {
		this.transmitter = transmitter;
	}
		public void send(Person receiver, String name) {
			System.out.println(name + " send to "+ receiver.getName() + " ("+ transmitter.getType() + ") :\"" + message + "\"" );
		}
		
}
