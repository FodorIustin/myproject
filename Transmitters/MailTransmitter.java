package Transmitters;

import Curs9Tema.Transmitter;

import java.util.ArrayList;

public class MailTransmitter implements Transmitter {

	private ArrayList<Message> buffer;
	
	private int size;
	
	public MailTransmitter(int size) {
		this.size=size;
		buffer = new ArrayList<Message>();
	}
	
	@Override
	public void store(Message message) {
		buffer.add(message);
		if(buffer.size() == size)
		{
			for(Message m: buffer) {
				m.getSender().send(m.getReceiver(), m.getMessage());
			}
			buffer.clear();
		}
	}

	@Override
	public Message retrieve(Person receiver) {
		return null;
	}

	@Override
	public String getType() {
		return "MAIL";
	}

}