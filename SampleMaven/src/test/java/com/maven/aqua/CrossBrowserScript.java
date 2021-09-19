package com.maven.aqua;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class CrossBrowserScript {
 
WebDriver driver;
 
/**
* This function will execute before each Test tag in testng.xml
* @param browser
* @throws Exception
*/
@BeforeTest
@Parameters("browser")
public void setup(String browser) throws Exception{
//Check if parameter passed from TestNG is 'firefox'
//if(browser.equalsIgnoreCase("firefox")){
//create firefox instance
//System.setProperty("webdriver.gecko.driver","C:/Users/hariharasu/eclipse-workspace-seleniu/SeleniumProject/Drivers/geckodriver.exe");
//driver = new FirefoxDriver();
//}
 
//Check if parameter passed as 'chrome'
//else if (browser.equalsIgnoreCase("chrome")){
//set path to chromedriver.exe
System.setProperty("webdriver.chrome.driver","C:/Users/jaisuryas/eclipse-workspace-Picnicselenium/Projectselenium/drivers/chromedriver.exe");
driver = new ChromeDriver();
 
}

//else{
//If no browser passed throw exception
//throw new Exception("Browser is not correct");
//}
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//}
 
@Test
public void testParameterWithXML() throws InterruptedException{
	driver.get("https://opensource-demo.orangehrmlive.com/");   

	WebElement uname = driver.findElement(By.id("txtUsername"));
	
	uname.sendKeys("Admin");
	Thread.sleep(2000);
    WebElement passwd = driver.findElement(By.id("txtPassword"));
	
	passwd.sendKeys("admin123");
	
    WebElement submit = driver.findElement(By.id("btnLogin"));
	
	submit.click();
	driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();

	 

    Thread.sleep(2000);



    WebElement usermanagement = driver.findElement(By.id("menu_admin_UserManagement"));



    usermanagement.click();



    Thread.sleep(2000);



    WebElement adminname = driver.findElement(By.id("searchSystemUser_userName"));



    adminname.sendKeys("ajay@123");



    Thread.sleep(2000);



    driver.findElement(By.name("searchSystemUser[userType]")).click();



    Thread.sleep(2000);



    Select adminuserrole = new Select(driver.findElement(By.name("searchSystemUser[userType]")));



    adminuserrole.selectByValue("1");



    WebElement employeename = driver.findElement(By.cssSelector("#searchSystemUser_employeeName_empName"));



    employeename.sendKeys("ajay");



    Thread.sleep(2000);



    driver.findElement(By.name("searchSystemUser[status]")).click();



    Thread.sleep(2000);



    Select status = new Select(driver.findElement(By.name("searchSystemUser[status]")));
    status.selectByValue("1");



    Thread.sleep(2000);



    driver.findElement(By.name("btnAdd")).click();



    Thread.sleep(2000);



    driver.findElement(By.id("systemUser_userType")).click();



    Thread.sleep(2000);



    Select userrole = new Select(driver.findElement(By.xpath("//select[@id='systemUser_userType']")));
    userrole.selectByVisibleText("ESS");



    Thread.sleep(2000);



    driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("Jadine Jackie");



    Thread.sleep(2000);



    WebElement entername = driver.findElement(By.id("systemUser_userName"));
    entername.sendKeys("ajay@1222");



    Thread.sleep(2000);



    driver.findElement(By.id("systemUser_status")).click();



    Thread.sleep(2000);



    Select status1 = new Select(driver.findElement(By.name("systemUser[status]")));
    status1.selectByValue("1");



    Thread.sleep(2000);



    WebElement password = driver.findElement(By.xpath("//input[@id='systemUser_password']"));



    password.sendKeys("Ajay@123456");



    Thread.sleep(2000);



    WebElement cnfrmpassword = driver.findElement(By.id("systemUser_confirmPassword"));
    cnfrmpassword.sendKeys("Ajay@123456");



    Thread.sleep(2000);



    driver.findElement(By.xpath("//input[@id='btnSave']")).click();



    Thread.sleep(2000);
	
	Thread.sleep(3000);
	if(driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")).isDisplayed()) {
		 System.out.println("Text is present");
		}
		else {
		 System.out.println("Text is absent");
		}
		Thread.sleep(2000);



		WebElement class1 = driver.findElement(By.id("menu_dashboard_index"));
		class1.click();
		Thread.sleep(2000);



		WebElement class2 = driver.findElement(By.cssSelector("div.box:nth-child(3) div.inner div.outerbox.no-border:nth-child(1) div.maincontent.group-wrapper div.panel_wrapper div.panel_draggable.panel-preview fieldset.panel_resizable.panel-preview table.quickLaungeContainer tr:nth-child(1) td:nth-child(3) div.quickLaunge a:nth-child(1) > img:nth-child(1)"));
		class2.click();
		Thread.sleep(2000);



		driver.findElement(By.xpath("//input[@id='employee']")).click();
		Thread.sleep(2000);



		WebElement class3 = driver.findElement(By.id("employee"));
		class3.sendKeys("Garry White");
		Thread.sleep(2000);



		driver.findElement(By.id("btnView")).click();
		Thread.sleep(2000);



		driver.findElement(By.xpath("//select[@id='startDates']")).click();
		Thread.sleep(2000);



		Select drpdate = new Select (driver.findElement(By.xpath("//select[@id='startDates']")));
		drpdate.selectByValue("3");
		Thread.sleep(2000);



		driver.findElement(By.cssSelector("#btnEdit")).click();
		Thread.sleep(2000);



		//click on select
		driver.findElement(By.xpath("//select[@id='initialRows_0_projectActivityName']")).click();
		Thread.sleep(2000);



		Select drpdate1 = new Select (driver.findElement(By.xpath("//select[@id='initialRows_0_projectActivityName']")));
		drpdate1.selectByValue("67");
		Thread.sleep(2000);



		WebElement date1 = driver.findElement(By.xpath("//input[@id='initialRows_0_1']"));
		date1.sendKeys("2:00");
		Thread.sleep(2000);



		driver.findElement(By.xpath("//input[@id='submitSave']")).click();
		Thread.sleep(2000);



		driver.findElement(By.xpath("//b[contains(text(),'Dashboard')]")).click();
		Thread.sleep(2000);
		WebElement class11 = driver.findElement(By.id("menu_pim_viewMyDetails")); 
        class11.click(); 
        driver.findElement(By.xpath("//input[@id='btnSave']")).click(); 
        driver.findElement(By.id("personal_txtLicenNo")).sendKeys("4567"); 
        driver.findElement(By.cssSelector("#personal_txtNICNo")).sendKeys("123456"); 
        driver.findElement(By.xpath("//input[@id='btnSave']")).click(); 
                 
        //Custom fields 
        driver.findElement(By.xpath("//input[@id='btnEditCustom']")).click(); 
        driver.findElement(By.cssSelector("div.box.pimPane:nth-child(1) div.single:nth-child(4) div.inner form:nth-child(1) ol:nth-child(3) li:nth-child(1) > select.editable:nth-child(2)")).sendKeys("B+"); 
        driver.findElement(By.xpath("//input[@id='btnEditCustom']")).click(); 
 
 
        //Add attachments 
        driver.findElement(By.xpath("//input[@id='btnAddAttachment']")).click(); 
        driver.findElement(By.cssSelector("#ufile")).sendKeys("C:\\Users\\jaisuryas\\Pictures\\Screenshots\\Screenshot (2).png"); 
        driver.findElement(By.xpath("//input[@id='btnSaveAttachment']")).click(); 
        Thread.sleep(5000); 
         
         
                //Contact details 
       WebElement contact = driver.findElement(By.partialLinkText("Contact Detai")); 
       contact.click(); 
       driver.findElement(By.id("btnSave")).click(); 
       driver.findElement(By.id("contact_country")).click(); 
     Select drop = new Select (driver.findElement(By.id("contact_country"))); 
     drop.selectByValue("AL"); 
     driver.findElement(By.cssSelector("#contact_city")).sendKeys("chennai"); 
     driver.findElement(By.xpath("//input[@id='contact_emp_zipcode']")).sendKeys("621109"); 
     driver.findElement(By.id("btnSave")).click(); 
      
     //Immigration 
      
     driver.findElement(By.partialLinkText("Immigrati")).click(); 
     driver.findElement(By.xpath("//input[@id='btnAdd']")).click(); 
       driver.findElement(By.cssSelector("#immigration_number")).sendKeys("123456"); 
       driver.findElement(By.id("btnSave")).click(); 



		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(2000);



		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(2000);


	
	
	driver.quit();
}
}

