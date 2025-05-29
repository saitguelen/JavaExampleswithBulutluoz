package day30_encapsulation_inheritance;

public class C03_EncapsuleRapor {

    private int satisTutari = 0 ;

    public void setSatisTutari(int satisTutari) {

        this.satisTutari = satisTutari;

        toplamSatisTutari += satisTutari;
    }
    // baska class'lardan deger ATAMASI YAPILABILSIN  - WRITE yetkisi  OK
    // ama atanmis degerleri kimse GOREMESIN          - READ yetkisi   yasak



    private int toplamSatisTutari=0;

    public int getToplamSatisTutari() {

        return toplamSatisTutari;
    }

    // baska class'lardan deger ATAMASI YAPILAMASIN   - WRITE yetkisi   yasak
    // ama atanmis degeri GOREBILSIN                  - READ yetkisi    OK


}
