package com.Poly;

public class Travel {
	public void bookTicket(Bus b)
	{
		b.booking(2,"sneha,kalpana");
	}
	public void bookTicket(Train tr)
	{
		tr.booking(3,"Dipak,sneha,puja");
	}
	public void bookTicket(Aeroplane a)
	{
		a.booking(1,"Kalyani");
	}
	public static void main(String[] args) {
		Travel t=new Travel();
		Bus bs=new Bus();
		Train tr=new Train();
		Aeroplane ae=new Aeroplane();
		t.bookTicket(bs);
		t.bookTicket(tr);
		t.bookTicket(ae);
	}

}
