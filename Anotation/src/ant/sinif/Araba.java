package ant.sinif;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Araba {//Kendimize bir anatation tanımladık.
	
	public String adi();
	public int  model();
	
}
