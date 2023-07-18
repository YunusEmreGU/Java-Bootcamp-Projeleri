public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Yunus";
        String ogrenci2 = "Osman";
        String ogrenci3 = "Esma";
        String ogrenci4 = "Selim";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Yunus";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Selim";
        ogrenciler[3] = "Osman";


        System.out.println("---------------------------");

        for (int i = 0; i<ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("---------------------------");

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}