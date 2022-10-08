package com.simplilearn.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kaja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		
		
		WebElement name= driver.findElement(By.id("id_name"));
		name.sendKeys("mohamed");
				
		
		
		//email
		WebElement email= driver.findElement(By.id("id_email"));
		email.sendKeys("mr.mohamed06@gmail.com");
		
		//mobile
		WebElement mobile= driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("9976756438");
		
		
		//password
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Mohamed@06");
		
		//button
		WebElement register= driver.findElement(By.cssSelector("#registerButton"));
		register.click();
}
}

