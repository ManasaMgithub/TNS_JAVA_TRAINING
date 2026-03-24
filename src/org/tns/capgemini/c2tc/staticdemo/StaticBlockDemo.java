package org.tns.capgemini.c2tc.staticdemo;


 class staticBlock{
	public void display()
	{
		System.out.println("instance block-1");
	}
	static
	{
		System.out.println("static block-1");
	}
	static
	{
		System.out.println("static block-2");
	}
}

public class  StaticBlockDemo {

	public static void main(String[] args) {
		staticBlock obj=new staticBlock();
		obj.display();

	}

}