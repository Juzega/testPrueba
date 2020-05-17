package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccederPageEmpleos extends Base{

    By linkEmpleos = By.linkText("Empleos");
    By idInputPalabra = By.id("search_keywords");
    By idInputUbicacion = By.id("search_location");
    By botonBuscar = By.className("search_submit");
    By accederElementBuscado = By.xpath("//a/div/div");
    
	public AccederPageEmpleos(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void accederPageEmpleos() throws InterruptedException{
		click(linkEmpleos);
		Thread.sleep(2000);
		Type("Analista", idInputPalabra);
		Thread.sleep(2000);
		Type("Lima",idInputUbicacion);
		Thread.sleep(2000);
		click(botonBuscar);
		click(accederElementBuscado);
	}

}
