package odev4;

public class main {

	public static void main(String[] args) {
		yeniuye a=new yeniuye(1,"umut", "g�ltekin", "123456789","03,01,323200");
		kay�t kay=new kay�t();
		kay.add(a);
		dogrulama d=new lastnamedogrulama();
		d.a(a);
		Oyuncu o=new Oyuncu(a);
		Sat�s l=new  Sat�s();
		l.arabaal(a);
		kampanyalar kam=new kampanyalar(1,"%20 indirim", "03,06,2021' e kadar");
		kampanyaduzenleme dzl=new kampanyaduzenleme();
		dzl.addkampanya(kam);
		
		
		
		
	}

}
