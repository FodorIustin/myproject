package Transmitters;

import Curs9Tema.Transmitter;

public class EmailTransmitter implements Transmitter {
			
		private Message message;
		
	@Override
	public void store(Message message) {
		this.message = message;
		retrieve(message.getReceiver());	
	}
	
	@Override
	public Message retrieve(Person receiver) {
		message.getSender().send(receiver, message.getMessage());
		return message;
	}
	public static String getType() {
		return "Email";
	}
}
