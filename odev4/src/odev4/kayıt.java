package odev4;

public class kay�t {
	public void add(yeniuye y) {
		System.out.println("isim: "+y.getName()+"soyisim: "+y.getLastname()+"tc: "+y.getTc()+"dogumy�l� : "+y.getDo�umy�l�());
		System.out.println("ki�i eklendi");
		
	}
	public void delete(yeniuye y) {
		System.out.println("silinecek ki�inin tc numarsa�n� giriniz: "+y.getTc());
	}
	public void update(yeniuye y) {
		System.out.println("g�ncellenecek veriyi girinz:");
	}

}
