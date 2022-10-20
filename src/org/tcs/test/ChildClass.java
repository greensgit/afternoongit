package org.tcs.test;

public class ChildClass extends AbstractClass {

	@Override
	public void communityCerticate() {
		System.out.println("ax");
	}
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.adharCard();
		c.communityCerticate();
		c.voterId();
	}

}
