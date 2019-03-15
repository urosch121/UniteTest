package moj_paket;

public class Pravougaonik 
{
	private double a;
	private double b;
	
	public Pravougaonik()
	{
		a = 0;
		b = 0;
	}
	
	public Pravougaonik(double a, double b)
	{
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString()
	{
		return "pravougaonik: " + this.a + " x " + this.b;
	}

	public double Povrsina()
	{
		return this.a * this.b;
	}
	
	public double Obim()
	{
		return 2.0*(this.a + this.b);
	}

	public boolean Check(Pravougaonik p)
	{
		if(this.a == p.a && this.b == p.b)
			return true;
		
		if(this.a == p.b && this.b == p.a)
			return true;
		
		return false;
	}
}
