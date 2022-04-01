package mykayakproject;

import java.util.concurrent.TimeUnit;
import io.testproject.addon.WebExtensions;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.testproject.addon.WebExtensions;
public class ChromeExample {
public static void main(String[] args) throws Exception {

//Setting system properties of ChromeDriver
System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
WebExtensions.AcceptAlert acceptAlert;
//Creating an object of ChromeDriver
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

//Deleting all the cookies
driver.manage().deleteAllCookies();

//Specifiying pageLoadTimeout and Implicit wait
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//launching the specified URL
driver.get("https://www.kayak.ch/");

driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
//GeneratedUtils.sleep(500);
By by;
// 2. Click 'Accetta1'
GeneratedUtils.sleep(500);
by = By.xpath("//div/div[. = 'Accetta']");
driver.findElement(by).click();
driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
// 3. Does 'Benvenuto! Trova un volo flessibile p...' contain 'Benv'?		    
GeneratedUtils.sleep(500);
by = By.xpath("//h2[. = '\nBenvenuto! Trova un volo flessibile per il tuo prossimo viaggio.\n']");
Assertions.assertTrue(driver.findElement(by).getText().contains("Benv"));
driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
//// 4. Click 'path4'
//GeneratedUtils.sleep(500);
//by = By.xpath("//div[2]/div/div/div/div/div[1]/div[2]/div/div[1]/div/div/div[1]/div/div//*[name()='path']");
//driver.findElement(by).click();

// 5. Type '{{LocationFrom}}' in 'Da1'
GeneratedUtils.sleep(500);
by = By.xpath("//input[@placeholder = 'Da']");
driver.findElement(by).sendKeys("Milan");

// 6. Click 'Milano, Lombardia, Italia'
GeneratedUtils.sleep(500);
by = By.xpath("//div[2]/div/span[. = 'Milano, Lombardia, Italia']");
driver.findElement(by).click();
driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
// 7. Click 'A2'
GeneratedUtils.sleep(500);
by = By.xpath("//div[2]/div/div/div/div/div[1]/div[2]//div[2][. = 'A']");
driver.findElement(by).click();

// 8. Type '{{LocationTo}}' in 'A3'
GeneratedUtils.sleep(500);
by = By.xpath("//input[@placeholder = 'A']");
driver.findElement(by).sendKeys("Zurich");
driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
// 9. Click 'Zurigo, Svizzera'
GeneratedUtils.sleep(500);
by = By.xpath("//li[1]//span[. = 'Zurigo, Svizzera']");
driver.findElement(by).click();
driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
// 10. Click 'gio 28.4.1'
GeneratedUtils.sleep(500);
by = By.xpath("//div[2]/div/div/div/div/div[1]/div[2]//span[2][. = 'gio 28.4.']");
driver.findElement(by).click();

// 11. Click '25'
GeneratedUtils.sleep(500);
by = By.xpath("//div[29][. = '25']");
driver.findElement(by).click();
driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
// 12. Click '251'
GeneratedUtils.sleep(500);
by = By.xpath("//div[29][. = '25']");
driver.findElement(by).click();
driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
// 13. Click 'lun 25.4.'
GeneratedUtils.sleep(500);
by = By.xpath("//div[2]/div/div/div/div/div[1]/div[2]/div/div[4]/div/div/div/div[3]//span[2][. = 'lun 25.4.']");
driver.findElement(by).click();
driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
// 14. Click '3'
GeneratedUtils.sleep(500);
by = By.xpath("//div[9][. = '3']");
driver.findElement(by).click();
driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
// 15. Click 'svg4'
GeneratedUtils.sleep(500);
by = By.xpath("//div[2]/div/div/div/div/div[1]/div[2]/div/div[5]//*[name()='svg']");
driver.findElement(by).click();
driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
// 16. Click 'Altre opzioni'
GeneratedUtils.sleep(500);
by = By.cssSelector("#MP98-sorting-display-status");
driver.findElement(by).click();
driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
// 17. Click 'DIV4'
GeneratedUtils.sleep(500);
by = By.xpath("//div/div[2]/div[2]/div/div/div[2]/div/div/div/div");
driver.findElement(by).click();
driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
// 18. Click 'Prezzo più alto'
GeneratedUtils.sleep(500);
by = By.cssSelector("#MP98-sorting-option-9");
driver.findElement(by).click();

// 19. Scroll window by ('0','0')
/* Step is disabled
GeneratedUtils.sleep(500);
((JavascriptExecutor)driver).executeScript("window.scrollBy(0,0)","");
*/
// 20. Click 'c8haW-mainInfo'
/* Step is disabled
GeneratedUtils.sleep(500);
by = By.cssSelector("#c8haW-mainInfo");
driver.findElement(by).click();
*/
// 21. Accept alert
driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
GeneratedUtils.sleep(500);
acceptAlert = WebExtensions.acceptAlert(3000);
//acceptAlert = (WebExtensions.AcceptAlert)((ReportingDriver)driver).addons().execute(acceptAlert);

// 22. Click 'c8haW-mainInfo'
driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
GeneratedUtils.sleep(500);
by = By.cssSelector("#c8haW-mainInfo");
driver.findElement(by).click();

// 23. Accept alert
GeneratedUtils.sleep(500);
driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
acceptAlert = WebExtensions.acceptAlert(2000);
//acceptAlert = (WebExtensions.AcceptAlert)((ReportingDriver)driver).addons().execute(acceptAlert);

//
//driver.findElement(By.cssSelector("#name")).sendKeys("John Smith");
//driver.findElement(By.cssSelector("#password")).sendKeys("12345");
//driver.findElement(By.cssSelector("#login")).click();
//
//boolean passed = driver.findElement(By.cssSelector("#logout")).isDisplayed();
//if (passed) {
//    System.out.println("Test Passed");
//} else {
//    System.out.println("Test Failed");
//}

driver.quit();


////Locating the elements using name locator for the text box
//driver.findElement(By.name("q")).sendKeys("YouTube");
//
////name locator for google search button
//WebElement searchIcon = driver.findElement(By.name("btnK"));
//searchIcon.click();
}
}