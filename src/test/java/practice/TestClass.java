package practice;

public class TestClass {
	public static void main(String[] args) {
		String s = "1rererdff2dfdf4rury8";
		s= s.replaceAll("[^\\d]", "");
		s= s.trim();
		//s=s.replaceAll(" ", "");
		System.out.println("digits are "+s);
		System.out.println("new line");
	}
}
