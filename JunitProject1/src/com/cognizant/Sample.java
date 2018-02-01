package com.cognizant;
public class Sample{
	int a,b,c;
//constructor
	public Sample(int p, int q,int r) {
		// TODO Auto-generated constructor stub
		this.a = p;
		this.b = q;
		this.c = r;
	}

	public int addition(){
		return a+b+c;
	}
	public int multiplication(){
		return a*b*c;
	}
	public int division(){
		return (a+b+c)/10;
	}
	public static void main(String arg[]){
		Sample obj = new Sample(5,7,6);
		Sample obj1 = new Sample(5,7,6);
		Sample obj2 = new Sample(5,7,6);
		System.out.println("Addition value is "+obj.addition());
		System.out.println("Multiplication value is "+obj1.multiplication());
		System.out.println("Divide by 10 value is "+obj2.division());
		System.out.println("END");

	}
}

