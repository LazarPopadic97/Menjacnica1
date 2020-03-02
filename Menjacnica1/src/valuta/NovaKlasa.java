package valuta;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import interfejs.SpecifikacijaInterfejs;

public class NovaKlasa implements SpecifikacijaInterfejs{

	List<Valuta> valute=new ArrayList<Valuta>();
	@Override
	public void dodajKurs(double kurs, GregorianCalendar datum) {
<<<<<<< HEAD
		if (datum==null)
			System.out.println("Kurs je uspesno dodat");

=======
		
		System.out.println("Nesto");
>>>>>>> refs/heads/implementacijaInterfejsa
	}

	@Override
	public void obrisiKurs(double kurs, GregorianCalendar datum) {
		System.out.println("Nesto");
		
	}

	@Override
	public double nadjiKurs(GregorianCalendar datum) {
		
		return 0;
	}

}
