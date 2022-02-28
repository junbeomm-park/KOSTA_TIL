package kosta.thread;

public class Donator extends Thread {
	private int amount;
	private Collect c;
	
	public Donator() {

	}
	
	
	public Donator(int amount, Collect c) {
		super();
		this.amount = amount;
		this.c = c;
	}


	@Override
	public void run() {
		c.add(this, amount);
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public Collect getC() {
		return c;
	}


	public void setC(Collect c) {
		this.c = c;
	}
	
	

}
