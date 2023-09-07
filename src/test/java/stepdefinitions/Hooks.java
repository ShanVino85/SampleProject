package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@mobiletest")
	public void beforevalidationmobile() {
		System.out.println("before validationmobile");
		}
	@After("@mobiletest")
	public void Aftervalidationmobile() {
		System.out.println("After validationmobile");
		}
	
	@Before("@webtest")
	public void beforevalidationweb() {
		System.out.println("before validationweb");
		}
	@After("@webtest")
	public void Aftervalidationweb() {
		System.out.println("After validationweb");
		}
}
