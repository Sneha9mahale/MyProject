package com.Poly;

public class OnlineShoping {
	
	public void doOnlineTransaction(CreditCard c)
	{
		c.useCards();
	}
	public void doOnlineTransaction(DebitCard d)
	{
		d.useCards(9876);
	}

	public static void main(String[] args) {
		OnlineShoping o=new OnlineShoping();
		CreditCard c=new CreditCard();
		o.doOnlineTransaction(c);
		
		o.doOnlineTransaction(new DebitCard());
	}

}
