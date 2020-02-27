package pruebas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ecommerceAutomation.testTool.SeleniumFunctions;

import pages.HomePage;




public class prueba {

	SeleniumFunctions selenium = new SeleniumFunctions();
	WebDriver driver;
	
	@Before
	public void setup() {
		selenium.openApp("https://www.abcdin.cl/");
	}
	
	@Test
	public void home() throws InterruptedException {
		
		//Crear Objeto de la clases Page
		HomePage homePage = new HomePage(driver);
			
		Thread.sleep(2000);
			
		//Hacemos click en icono de login	
		homePage.clickLinkLoginHeader();
		
	}
	
}


