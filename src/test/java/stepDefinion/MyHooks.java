package stepDefinion;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	
	@Before("@Smoke or @Sanity")
	public void s1() {
		
		System.out.println("S1");
		
		
	}
	
	@After("@Smoke or @Sanity")
	public void s2() {
		
		System.out.println("S2");
		
		
	}
	

	// Ordered hooks

	// Default order value for hooks??

	// If we are not giving Order, in what basic hooks are executing?

	/*
	 * @BeforeStep(order = -1) public void one1() {
	 * 
	 * System.out.println("ONE1");
	 * 
	 * }
	 * 
	 * @AfterStep(order = -1000) public void two1() {
	 * 
	 * System.out.println("TWO1");
	 * 
	 * }
	 * 
	 * @BeforeStep(order = 2) public void one2() {
	 * 
	 * System.out.println("ONE2");
	 * 
	 * }
	 * 
	 * @AfterStep(order = 3) public void two2() {
	 * 
	 * System.out.println("TWO2");
	 * 
	 * }
	 * 
	 * @BeforeStep(order = 3) public void one3() {
	 * 
	 * System.out.println("ONE3");
	 * 
	 * }
	 * 
	 * @AfterStep(order = 2) public void two3() {
	 * 
	 * System.out.println("TWO3");
	 * 
	 * }
	 * 
	 * @BeforeStep(order = 4) public void one4() {
	 * 
	 * System.out.println("ONE4");
	 * 
	 * }
	 * 
	 * @AfterStep(order = 1) public void two4() {
	 * 
	 * System.out.println("TWO4");
	 * 
	 * }
	 */
	
	// Junit @Before class --> Static

	/*
	 * @BeforeAll public static void beforeAll() {
	 * 
	 * System.out.println("beforeAll");
	 * 
	 * }
	 * 
	 * @AfterAll public static void afterAll() {
	 * 
	 * System.out.println("afterAll");
	 * 
	 * }
	 */

	/*
	 * @Before public void setup() {
	 * 
	 * System.out.println("Date and Time before every scenario " + new
	 * Date().getTime());
	 * 
	 * }
	 * 
	 * @After public void tearDown() {
	 * 
	 * System.out.println("Date and Time after every scenario " + new
	 * Date().getTime());
	 * 
	 * }
	 */

}
