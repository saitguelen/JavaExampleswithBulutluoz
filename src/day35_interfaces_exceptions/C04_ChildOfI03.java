package day35_interfaces_exceptions;

public class C04_ChildOfI03 implements I03_InterfacedeBodysiOlanMethodOlusturma{


    @Override
    public void method1() {

    }

    public static void main(String[] args) {

        /*
            I03'de
            method1 ==> abstract method
            method2 ==> default keyword kullanmis body'si olan method
            method3 ==> static keyword kullanmis body'si olan method

            method2 ve method3'u implement etmek zorunda degiliz

            default ve static keyword kullanmak arasindaki fark
            erisim yontemidir

            static olarak isaretlenen method'a static yontemle ulasiriz--->(klass ismi (.) method adi
            ama default olarak isaretlenen method icin obje olusturmaliyiz

         */


        I03_InterfacedeBodysiOlanMethodOlusturma.method3();//--->static metoda ulasma sekli


        // I03_InterfacedeBodysiOlanMethodOlusturma.method2();---->default metodda direk  ulasamayiz obje olusturmaliyiz.
        // Non-static method 'method2()' cannot be referenced from a static context

        C04_ChildOfI03 obj1 = new C04_ChildOfI03();
        I03_InterfacedeBodysiOlanMethodOlusturma obj2 = new C04_ChildOfI03();

        obj1.method2();
        obj2.method2();

    }


}
