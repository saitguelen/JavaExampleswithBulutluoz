package day03_KullanicidanBilgiAlma_scanner;
import java.util.Scanner;
public class C04_DiktorgeninAlaniniYazdirma {

	public static void main(String[] args) {
		// Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanini yazdirin.

        Scanner scanner= new Scanner(System.in);

        System.out.println("L�tfen Dikd�rtgenin Kenar �l��lerini Girin..");
        double uzunkenar= scanner.nextDouble();
        double kisakenar= scanner.nextDouble();

        System.out.println("Dikd�rtgenin Alan �l��s� = " + (kisakenar*uzunkenar));

	}

}
