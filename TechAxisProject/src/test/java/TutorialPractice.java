import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialPractice {
    WebDriver driver;

    @BeforeClass
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\user\\IdeaProjects\\TechAxisProject\\src\\test\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
    }

    @Test
    public void PracticeForm(){
        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Shreemal Sitikhu");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("shreemalsitikhu@gmail.com");

        WebElement gender = driver.findElement(By.xpath("//*[@id=\"gender\"]"));
        gender.click();

        WebElement mobile = driver.findElement(By.id("mobile"));
        mobile.sendKeys("9810053627");

        WebElement date = driver.findElement(By.id("dob"));
        date.sendKeys("06-02-2001"); // Example: YYYY-MM-DD format


        WebElement subjects = driver.findElement(By.id("subjects"));
        subjects.sendKeys("Maths");

        WebElement hobbies = driver.findElement(By.xpath("//*[@id=\"hobbies\"]"));
        hobbies.click();

        driver.findElement(By.id("picture")).sendKeys("C:\\Users\\user\\Desktop\\Photos\\pp.jpg");

//        driver.findElement(By.xpath("//textarea[@placeholder='Currend Address']")).sendKeys("Goldmodi Bhaktapur");
// Or this code
        WebElement address = driver.findElement(By.xpath("//textarea[@placeholder='Currend Address']")); // Correct XPath for address field
        address.sendKeys("Goldmodi Bhaktapur");


        WebElement stateDropdown = driver.findElement(By.id("state"));
        Select stateSelect = new Select(stateDropdown);
        stateSelect.selectByVisibleText("Haryana");

        WebElement cityDropdown = driver.findElement(By.id("city"));
        Select citySelect = new Select(cityDropdown);
        citySelect.selectByVisibleText("Agra");
    }

    @AfterClass
    public void closeBrowser(){
        //To quit browser
        driver.quit();
    }
}
