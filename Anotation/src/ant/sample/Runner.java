package ant.sample;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	@SuppressWarnings("deprecation")//sar� yapmaz ama �st�n� �izer
	public static void main(String[] args) {
		Araba a= new Araba();
		a.getir();//deprecated oldu�u i�in �st�n� �izerek getirir ama getir methodu da kullan�labilir.
		//@SuppressWarnings("rawtypes") yaz�l�rsa sar� olmaz.
		List liste =new ArrayList<>();//typevermedenlisteyi tan�mlad�n diye uyar�yor.Bu uyar�y� kapatmak i�in anatation yap�yoruz.
		liste.add(1);

	}

}
