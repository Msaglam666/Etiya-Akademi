package introo;

import java.util.Random;

public class deneme6 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] sayidizi = new int[25];
		System.out.println("Dizi");
		for (int i = 0; i < sayidizi.length; i++) {
			sayidizi[i] = rnd.nextInt(100) + 1;
			System.out.println(+sayidizi[i] + " ");
		}
		System.out.println("\nTersten Sýralý");
		for (int x = 1; x < sayidizi.length; x++) {
			int hersey;
			for (int z = 0; z < 25 - x; z++) {
				if (sayidizi[z] < sayidizi[z + 1]) {
					hersey = sayidizi[z];
					sayidizi[z] = sayidizi[z + 1];
					sayidizi[z + 1] = hersey;
				}
			}
		}
		System.out.println("");
		for (int i = 0; i < sayidizi.length; i++)
			System.out.println(+sayidizi[i] + " ");

	}

}

//Sayýlarý tersten sýralayarak yeni dizi oluþturma
