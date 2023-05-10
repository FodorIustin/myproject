package Fotbal;

import java.util.Random;
import java.util.Date;

	public class CoordinateGenerator extends Minge {

	private Random randomGenerator;

	public CoordinateGenerator() {
		Date now = new Date();
		long sec = now.getTime();
		randomGenerator = new Random(sec);
	}


		public int generateX() {

			if (x < 5) {

				int x= randomGenerator.nextInt(101); x = 0;

				x = 100;
						} else if (x > 95) { x=100;
											} else {
							x = randomGenerator.nextInt (99) + 1;
																}
								return x;
														}
			public int generateY() { int y = randomGenerator.nextInt(101); if (y < 5) {y = 0;}}
								  else if (y > 95) {y = 50;
													} else {
								y = randomGenerator.nextInt(49) + 1;}

		return y;
			}
		}