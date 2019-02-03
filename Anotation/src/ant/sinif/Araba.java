package ant.sinif;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Araba {//Kendimize bir anatation tanýmladýk.
	
	public String adi();
	public int  model();
	
}
