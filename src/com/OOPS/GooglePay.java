package com.OOPS;

public class GooglePay {
	public void transferAmount(int amount,Bank ac)
	{
		System.out.println("Transefer amount is in process!!!");
		//float currentbal=ac.getBalance();
		//ac.setBalance(currentbal-amount);
		ac.setBalance(ac.getBalance()-amount);
		System.out.println("Amount Transferred Succesfully "+"\n Updated Balance of Account No "+ac.getAcno()+" Name is =  "+ac.getName()+" Balnce = "+ac.getBalance());
	}

	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.acceptDetails(23456,"Sneha",50000);
		GooglePay g=new GooglePay();
		g.transferAmount(5000,obj);

	}

}
