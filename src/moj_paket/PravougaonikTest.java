package moj_paket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PravougaonikTest 
{
	@Test
	void testToString() 
	{
		Pravougaonik p = new Pravougaonik(2.2, 4.6);
		String izlaz = p.toString();
		String ocekivani_izlaz = "pravougaonik: 2.2 x 4.6";
		
		assertEquals(ocekivani_izlaz, izlaz);
	}

	@Test
	void testPovrsina() 
	{
		Pravougaonik p = new Pravougaonik(4.1,4);
		assertEquals(16.4, p.Povrsina(),1.0e-8);
	}

	@Test
	void testObim() 
	{
		Pravougaonik p = new Pravougaonik(4.1,4);
		assertEquals(16.2, p.Obim(),1.0e-8);
	}

	@Test
	void testCheck() 
	{
		Pravougaonik p1,p2;
		
		p1 = new Pravougaonik(2.1,3);
		p2 = new Pravougaonik(2.1,3);
		assertTrue(p1.Check(p2));

		p1 = new Pravougaonik(2.1,3);
		p2 = new Pravougaonik(3,2.1);
		assertTrue(p1.Check(p2));
		
		p1 = new Pravougaonik(2.1,3);
		p2 = new Pravougaonik(2.1,2.9);
		assertFalse(p1.Check(p2));

		p1 = new Pravougaonik(2.1,3);
		p2 = new Pravougaonik(2.22,3);
		assertFalse(p1.Check(p2));
}

}
