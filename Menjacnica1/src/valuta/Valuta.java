package valuta;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	private double prodajniKurs;
	private double srednjiKurs;
	private double kupovniKurs;
	GregorianCalendar datum;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv == null) {
			throw new RuntimeException("Naziv ne sme biti prazan ");
		}
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv == null) {
			throw new RuntimeException("Skraceni naziv ne sme biti prazan ");
		}
		this.skraceniNaziv = skraceniNaziv;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs==0) {
			throw new RuntimeException("Kurs ne moze biti 0 ");
		}
		this.prodajniKurs = prodajniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs==0) {
			throw new RuntimeException("Kurs ne moze biti 0 ");
		}
		this.srednjiKurs = srednjiKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs==0) {
			throw new RuntimeException("Kurs ne moze biti 0 ");
		}
		this.kupovniKurs = kupovniKurs;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum==null) {
			throw new RuntimeException("Datum ne moze biti null");
		}
		this.datum = datum;
	}
	
}
