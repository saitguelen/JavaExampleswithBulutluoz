package day09_ifElseIfStatements_nestedIfElse;
import java.util.Scanner;
public class C02_VucutKitleEndeksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        //         kilo*10000 / (boy *boy)
        //         vucut kitle endeksi
        //         30�dan buyukse obez,
        //         25-30 arasi ise kilolu,
        //         20-25 arasi ise normal,
        //         20�den kucukse zayif yazdirin.
		Scanner scanner = new Scanner(System.in);
		System.out.print("L�tfen kilonuzu giriniz: ");
		double kilo = scanner.nextDouble();
		System.out.print("L�tfen boyunuzu santimetre olarak giriniz: ");
		double boy = scanner.nextDouble();
		
		double vucKitEnd = kilo*10000/(boy*boy);
		
		if (vucKitEnd>30) {
			System.out.println("Obez");
			
		}else if (vucKitEnd>25) {
			System.out.println("Kilolu");
		}else if(vucKitEnd>20) {
			System.out.println("Normal");
		}else {
			System.out.println("Zayif");
		}

	}

}
