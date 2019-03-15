package kurs;

import moj_paket.Pravougaonik;

public class Test 
{
	public static void main(String[] args) 
	{
		// Testiranje toString
		System.out.println("Testiranje toString i konstruktora:");
		Pravougaonik p = new Pravougaonik();
		String izlaz = p.toString();
		String zeljeni_izlaz = "pravougaonik: 0.0 x 0.0";
		if(izlaz.equals(zeljeni_izlaz))
			System.out.println("Prvi test TRUE");
		else
			System.out.println("Prvi test FALSE");
		
		p = new Pravougaonik(4.5,6);
		izlaz = p.toString();
		zeljeni_izlaz = "pravougaonik: 4.5 x 6.0";
		if(izlaz.equals(zeljeni_izlaz))
			System.out.println("Drugi test TRUE");
		else
			System.out.println("Drugi test FALSE");
		
		System.out.println("--------------------------------------------------\n");
		
		System.out.println("Testiranje povrsine:");
		p = new Pravougaonik(2.2, 3);
		double pov = p.Povrsina();
		if(Math.abs(pov - 6.6) < 1.0e-8)
			System.out.println("Treci test TRUE (povrsina)");
		else
			System.out.println("Treci test FALSE (povrsina)");			
		System.out.println("--------------------------------------------------\n");
		
		System.out.println("Testiranje obima:");
		double obim = p.Obim();
		if(Math.abs(obim - 10.4) < 1.0e-8)
			System.out.println("Cetvrti test TRUE (obim)");
		else
			System.out.println("Cetvrti test FALSE (obim)");			
		
		System.out.println("--------------------------------------------------\n");
		
		System.out.println("Testiranje uporedjivanja:");
		Pravougaonik p1, p2;
		
		p1 = new Pravougaonik(4,6);
		p2 = new Pravougaonik(4,6);
		if(p1.Check(p2))
			System.out.println("Peti test TRUE (jednakost)");
		else
			System.out.println("Peti test FALSE (jednakost)");			

		p1 = new Pravougaonik(4,6);
		p2 = new Pravougaonik(6,4);
		if(p1.Check(p2))
			System.out.println("Sesti test TRUE (jednakost)");
		else
			System.out.println("Sesti test FALSE (jednakost)");			
			
		p1 = new Pravougaonik(4,6);
		p2 = new Pravougaonik(3.8,6);
		if(!p1.Check(p2))
			System.out.println("Sedmi test TRUE (jednakost)");
		else
			System.out.println("Sedmi test FALSE (jednakost)");			
		
		p1 = new Pravougaonik(4,6);
		p2 = new Pravougaonik(4,6.2);
		if(!p1.Check(p2))
			System.out.println("Osmi test TRUE (jednakost)");
		else
			System.out.println("Osmi test FALSE (jednakost)");			
		
		System.out.println("--------------------------------------------------\n");
	}

}
