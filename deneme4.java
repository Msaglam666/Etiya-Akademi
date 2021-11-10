package introo;

import java.util.Random;
import java.util.Scanner;

public class deneme4 {

	public static void main(String[] args) {
		Scanner kolonlar = new Scanner(System.in);
		System.out.println("kolon adeti girin");
		int kolon = kolonlar.nextInt();

		for (int x = 1; x <= kolon; x++) {
			Random sayi = new Random();
			int[] sayidizisi = new int[6];
			System.out.println("kolon " +x);
			for (int i = 0; i < sayidizisi.length; i++) {
				sayidizisi[i] = sayi.nextInt(49) + 1;
				System.out.println( " "+sayidizisi[i] );
			}
		}
	}
}
//sayýsal loto