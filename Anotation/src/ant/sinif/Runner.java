package ant.sinif;

@Araba(adi="Tostos", model=2015)
public class Runner {

	public static void main(String[] args) {
		Araba arabaanatation=Runner.class.getAnnotation(Araba.class);
		System.out.println(arabaanatation.adi());
		System.out.println(arabaanatation.model());
		
	}
}
