package day09_ifElseIfStatements_nestedIfElse;
import java.util.Scanner;
public class C05_CokluDegisken {

	public static void main(String[] args) {
		 // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin
        // kullanici yas olarak 15'den kucuk veya 80'den buyuk deger girerse
        // ve K veya E disinda cinsiyet girerse hata mesaji yazdirin
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen yasinizi giriniz: ");
		int yas = scanner.nextInt();
		System.out.println("Cinsiyetinizi girin...E:Erkek, K:Kadin..");
		char cinsiyet=scanner.next().toUpperCase().charAt(0);
		
		// kucuk veya buyuk harf girilebilir, kontrol yaparken emin olmak icin
        // kullanicidan alinan cinsiyet bilgisini kucuk veya buyuk harfe cevirebiliriz

		
		if( yas<15 || yas>80 || !(cinsiyet=='E'|| cinsiyet=='K') ) {
			System.out.println("Girdiginiz yas ve cinsiyet uygun degil");
			
		}else if (cinsiyet=='K' && yas>60) {
			System.out.println("kadin ve 60 yasdan buyuk, emekli olabilir");
		}else if (cinsiyet=='K' && yas<60) {
			System.out.println("Kadinlar 60 yasindan sonra emekli olur, daha "+(60-yas)+" yil daha calisacaksiniz.");
		} else if (cinsiyet == 'E' && yas>=65) {
            System.out.println("Erkek ve yas 65'den fazla, emekli olabilir");
		}else if (cinsiyet == 'E' && yas<65) {
            System.out.println("Erkekler 65 yasinda emekli olabilir, daha " + (65-yas) + " yil calısman lazim");
		}

	}

}
