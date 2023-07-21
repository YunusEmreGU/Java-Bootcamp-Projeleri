public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager =  new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();


        //sadece stack de tutulduğu için çıktı 10 oluyor. Boyutları belli değerler.
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);


        //stack-head da tutulduğu için çıktı 10 oluyor. Değişken değerler
        int[] sayilar1 = new  int[] {1,2,3};
        int[] sayilar2 = new  int[] {4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);

    }
}


