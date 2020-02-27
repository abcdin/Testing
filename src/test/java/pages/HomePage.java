package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private WebDriver driver;
	
	//LOCALIZADORES
	
	//Enlace "Inicia tu sesión"
	@FindBy (how = How.XPATH, using = "//*[@id=\"Header_GlobalLogin_signInQuickLink\"]")
	WebElement linkLoginHeader;
	
	//Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Acción sobre el Icono de Login en el header
	public void clickLinkLoginHeader() {
		linkLoginHeader.click();
	}

}
