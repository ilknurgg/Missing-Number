package eksikSayi;

public class eksikSayi {

	public static void main(String[] args) {

		int[] arrTamSayilar = {6,1,5,4,3,7,2,9};

		boolean isFind;

		for (int j = 1; j <= arrTamSayilar.length; j++) {

			isFind = false;
			for (int i = 0; i < arrTamSayilar.length; i++) {
				if (arrTamSayilar[i] == j) {
				isFind = true;
				}
			}

		if (isFind == false) {
			
			System.out.println("Eksik sayi: " + j);
	
			}
		}

	}

}
