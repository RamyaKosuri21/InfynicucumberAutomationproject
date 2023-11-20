package Infynicucumberautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage extends Infynicucumberautomation.base.Base1{

//Maintains web Elements of login page 
//How to store this objects is important
// One stop page to change the locator , if there is any changes made in xml code of webpage.
	public static By emailInputBox = By.id("user_email");//action sendkeys

	public static By passwordInputBox = By.id("user_password");//action sendkeys

	public static By signinButton = By.name("commit");//action click
	
	public static By allProjectsText= By.id("ember57");//verification of text
	
	public static By errorMessageText=By.xpath("//p[text()='Invalid email or password.']");
//Now we will create methods to perform actions on this methods, Its good practice to surround the method code in Try-Catch Block
	
	public static void enterEmailid(String emailAddress)
	{
		try {
			driver.findElement(emailInputBox).clear();
			driver.findElement(emailInputBox).sendKeys(emailAddress);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void enterPassword(String password)
	{
		try {
			driver.findElement(passwordInputBox).clear();
			driver.findElement(passwordInputBox).sendKeys(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void signIn()
	{
		try {
			driver.findElement(signinButton).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static boolean allProjectsTextPresence() {
		boolean result = false;
		try {
			result=driver.findElement(allProjectsText).isDisplayed();//returns boolean value true or false
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	
	}
	
	public static String allProjectsText()
	{
	String value="";
	
		try {
			value=driver.findElement(allProjectsText).getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return value;
	}
	public static boolean errorMessagePresence()
	{
		boolean result = false;
	try {
		result=driver.findElement(errorMessageText).isDisplayed();//returns boolean value true or false
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result;
		
	}
	
	
	
}
	

