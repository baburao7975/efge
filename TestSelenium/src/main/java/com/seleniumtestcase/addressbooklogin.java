package com.seleniumtestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class addressbooklogin {

	public static void main(String[] args) {
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\babur\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://18.212.7.83:49153/addressbook/");
		 
		 
		// TODO Auto-generated method stub

	}

}
