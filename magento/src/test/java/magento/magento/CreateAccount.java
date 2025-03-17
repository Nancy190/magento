package magento.magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		
		//Identifiers
				String CreateAccountXPath = "/html/body/div[2]/header/div[1]/div/ul/li[3]/a";
				String firstNameID = "firstname";
				String lastNameID = "lastname";
				String emailID = "email_address";
				String passwordID = "password";
				String confirmPasswordID = "password-confirmation";
				String CreateButtonClass = "action submit primary";
				String CreateButtonXpath = "/html/body/div[2]/main/div[3]/div/form/div/div[1]/button";
		//Input Data
				String firstname = "nancy129";
				String lastname = "anbu";
				String email = "Name0@TestFirstName.com";
				String password = "PassqweASDZXC";
				System.out.println("Account Creation Testcase Start");

				WebDriver driver = new ChromeDriver();
				
				driver.get("https://magento.softwaretestingboard.com/");
				driver.findElement(By.xpath(CreateAccountXPath)).click();
				driver.findElement(By.id(firstNameID)).sendKeys(firstname);
				driver.findElement(By.id(lastNameID)).sendKeys(lastname);
				driver.findElement(By.id(emailID)).sendKeys(email);
				driver.findElement(By.id(passwordID)).sendKeys(password);
				driver.findElement(By.id(confirmPasswordID)).sendKeys(password);
				driver.findElement(By.xpath(CreateButtonXpath)).click();
	
				String createTextXpath = "/html/body/div[2]/main/div[1]/div[2]/div/div/div";
				String createdText = driver.findElement(By.xpath(createTextXpath)).getText();

				if(createdText.equals("Thank you for registering with Main Website Store."))

				{
					System.out.println("Account Created. Testcase Pass");
				}
				else
				{
					System.out.println("Account Creation Testcase Fail");
				}
				System.out.println("Account Creation Testcase End");
	
			}

	}


