package day16_nestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C06_NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*
        kullanicidan satir ve sutun sayisini alip asagidaki sekli yazdirin
        orn satir = 4 , sutun= 5 oldugunda
         1 2 3 4 5
         2 3 4 5 6
         3 4 5 6 7
         4 5 6 7 8

     */

		Scanner scanner = new Scanner(System.in);

		System.out.println("L�tfen satir sayisini giriniz..");
		int satir = scanner.nextInt();
		System.out.println("L�tfen s�tun sayisini giriniz..");
		int sutun= scanner.nextInt();
		
		for(int i=1; i<=satir; i++) {
			for(int j=1;j<=sutun;j++) {

				System.out.print(i+j-1);
			}
			
			System.out.println();
		}
		
	
		
	}

}
