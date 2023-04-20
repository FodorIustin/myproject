package Greutati;

public class GSimple extends Greutate {

		private int capacitate;

		public GSimple(int capacitate) {
			this.capacitate = capacitate;
		}

		@Override
		public int capacitate() {
			return capacitate;
			
		}
		public String toString() {
			return "GSimple["+capacitate()+ "]";
		}
}
