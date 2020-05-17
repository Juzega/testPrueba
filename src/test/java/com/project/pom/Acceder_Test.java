package com.project.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Acceder_Test {

	private WebDriver driver;
	AccederPageEmpleos APE;
	@Before
	public void setUp() throws Exception {
		APE = new AccederPageEmpleos(driver);
		driver = APE.chromeDriverConnection();
		APE.visit("https://www.choucairtesting.com");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		APE.accederPageEmpleos();
		Thread.sleep(5000);
	}

}
