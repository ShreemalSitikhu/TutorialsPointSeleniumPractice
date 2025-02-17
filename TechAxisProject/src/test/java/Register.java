import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Register {
    WebDriver driver;

    @BeforeClass
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\TechAxisProject\\src\\test\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
    }

    @Test
    public void register(){
        WebElement firstname = driver.findElement(By.id("firstname"));
        firstname.sendKeys("Shreemal");

        WebElement lastname = driver.findElement(By.id("lastname"));
        lastname.sendKeys("Sitikhu");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("cmal");

        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("Shreemal1");

        WebElement register = driver.findElement(By.xpath("//*[@id=\"signupForm\"]/div[5]/input"));
        register.click();
    }

    @Test
    public void BacktoLogin(){
        WebElement backToLogin = driver.findElement(By.xpath("//*[@id=\"signupForm\"]/div[5]/a"));
        backToLogin.click();
    }
}