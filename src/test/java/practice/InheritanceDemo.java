package practice;

public class InheritanceDemo {
	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.a);
		a.m1();
	}
}

class A{
	int a = 10;
	
	public void m1() {
		System.out.println("A.m1");
	}
}

class B extends A{
	int a = 20;
	
	public void m1() {
		System.out.println("B.m1");
	}
}