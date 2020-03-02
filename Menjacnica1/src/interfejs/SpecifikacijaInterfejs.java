package interfejs;

import java.util.GregorianCalendar;

public interface SpecifikacijaInterfejs {

	void dodajKurs(double kurs,GregorianCalendar datum);
	void obrisiKurs(double kurs,GregorianCalendar datum);
	double nadjiKurs(GregorianCalendar datum);
	
}
