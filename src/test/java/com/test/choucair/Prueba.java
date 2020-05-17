package com.test.choucair;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prueba {
	
	private WebDriver driver;
	private String url = "https://www.choucairtesting.com";

    By linkEmpleos = By.linkText("Empleos");
    By idInputPalabra = By.id("search_keywords");
    By idInputUbicacion = By.id("search_location");
    By botonBuscar = By.className("search_submit");
    By accederElementBuscado = By.xpath("//a/div/div");
//------------------------------------------------------------------
	
	@Before
	public void setUp () {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@After
    public void tearDown() throws Exception{
        driver.quit();
    }
	
	@Test
    public void accederPageEmpleos() throws Exception {
        driver.findElement(linkEmpleos).click();
        Thread.sleep(5000);
        driver.findElement(idInputPalabra).sendKeys("Analista");
        Thread.sleep(2000);
        driver.findElement(idInputUbicacion).sendKeys("Lima");
        Thread.sleep(2000);
        driver.findElement(botonBuscar).click();
        Thread.sleep(2000);
        driver.findElement(accederElementBuscado).click();
        Thread.sleep(2000);
    }
	/*
	public void nuevaPagina() throws Exception{
        driver.findElement(accederElementBuscado).click();
        Thread.sleep(2000);
        driver.findElement(botonIncribirseTrabajo).click();
        Thread.sleep(2000);
        driver.findElement(inputNombreCompleto).sendKeys("asd");
        driver.findElement(inputCorreo).sendKeys("asd");
        driver.findElement(inputCel).sendKeys("0");
        driver.findElement(inputEstudios).sendKeys("asd");
        driver.findElement(inputSalario).sendKeys("123");
        Thread.sleep(2000);
    }
	
	public String selectDrop() {
		Select selectList = new Select(findElement(dropListDisponible));
		selectList.selectByVisibleText("Inmediata");
		return "";
	}

	*/
	

}
