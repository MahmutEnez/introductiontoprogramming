package com.medipol.operators;

public class AritmetikOperator2 {

	public static void main(String[] args) {
		
		int x, y, sonu�;
		float fsonu�;
		x = 7;
		y = 5;
		sonu� = x / y;
		System.out.println("x/y = " + sonu�);
		fsonu� = (float) x / y;
		System.out.println("x/y =" + fsonu�);
		fsonu� = x / (float) y;
		System.out.println("x/y =" + fsonu�);
		fsonu� = (float) x / (float) y;
		System.out.println("x/y =" + fsonu�);
		fsonu� = (float) (x / y);
		System.out.println("x/y =" + fsonu�);

	}

}
