package introo;

import java.lang.reflect.Array;
import java.util.Random;

public class deneme5 {

	public static void main(String[] args) {
		
		 
			Random sayi = new Random();
			int[] sayidizisi = new int[6];
			System.out.println( "�lk Dizi ");
			for (int i = 0; i < sayidizisi.length; i++) {
				sayidizisi[i] = sayi.nextInt(10) + 1;
				System.out.println( +sayidizisi[i] );
			}
			
			System.out.println( "�kinci Dizi");
			for (int x = 0; x < sayidizisi.length; x++) {
				if (sayidizisi[x] == sayidizisi[x])
				{
					System.out.println( "tekrarlayan sayi "+sayidizisi[x]);
				}
			}
		
	}

}
//dizide tekrar eden say�lar� bulup ayr� bir diziye aktarma
