package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		//Java'da değişken isimleri camelCase yazılır.
		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDün = 18.15;
		double dolarBugün = 18.10;
		
		boolean dolarDustuMu = true;
		
		String okYonu = "";
		
		if (dolarBugün<dolarDün) {
			okYonu = "down.swg";
			System.out.println(okYonu);
		} else if(dolarBugün>dolarDün) {
			okYonu = "up.swg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.swg";
			System.out.println(okYonu);
		}
		
		
		String[] krediler = {"hizli kredi", "maasini halkbanktan alan","mutlu emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}

}
