package ant.sample;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	@SuppressWarnings("deprecation")//sarý yapmaz ama üstünü çizer
	public static void main(String[] args) {
		Araba a= new Araba();
		a.getir();//deprecated olduðu için üstünü çizerek getirir ama getir methodu da kullanýlabilir.
		//@SuppressWarnings("rawtypes") yazýlýrsa sarý olmaz.
		List liste =new ArrayList<>();//typevermedenlisteyi tanýmladýn diye uyarýyor.Bu uyarýyý kapatmak için anatation yapýyoruz.
		liste.add(1);

	}

}
