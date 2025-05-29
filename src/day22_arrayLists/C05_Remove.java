package day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Remove {

	
		// TODO Auto-generated method stub
		
		public static void main(String[] args) {

	        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,6,1,9,3));

	        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Ayse","Fatma","Hatice"));

	        System.out.println(isimler); // [Ali, Veli, Cemil, Ayse, Fatma, Hatice]

	        // listeden Ali'yi silin

	        isimler.remove("Ali"); //yada  isimler.remove(0); yani index numarasini yazabiliriz

	        System.out.println(isimler); // [Veli, Cemil, Ayse, Fatma, Hatice]

	        isimler.remove(2);  //Ayse silinir

	        System.out.println(isimler); // [Veli, Cemil, Fatma, Hatice]

	        // Eger list sayilardan olusuyorsa
	        // Java girilen degeri direkt index olarak alir,
	        // Eger sayi olan 4'u silmek isterseniz
	        // bunu once object olarak olusturmalisiniz

	        sayilar.remove(4); //4. indexdeki 3'ü siler 

	        System.out.println(sayilar); // [4, 6, 1, 9]


	        // sayilar listesinden 9'u silin

	        // sayilar.remove(9); // IndexOutOfBoundsException

	        Integer silinecekSayi = 9;

	        sayilar.remove(silinecekSayi);

	        System.out.println(sayilar); // [4, 6, 1]
	        
	    
	    

	}

}
