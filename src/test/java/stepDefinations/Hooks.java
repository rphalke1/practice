package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before("@domain5")
	public void beforeHook() {
		System.out.println("before hook for domain5");
	}
	
	@After("@domain5")
	public void afterHook() {
		System.out.println("after hook for damain5");
	}
	
	@After
	public void commonAfter() {
		System.out.println("Common after Hook");
	}
	
	public void newMethod() {
		System.out.println("Common after Hook");
	}
}
