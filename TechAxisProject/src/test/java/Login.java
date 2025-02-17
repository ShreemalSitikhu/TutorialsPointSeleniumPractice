import com.google.common.io.ByteProcessor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {
    WebDriver driver;

    @BeforeClass
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\TechAxisProject\\src\\test\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
    }

    @Test
    public void Login(){
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("shreemalsitikhu@gmail.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Shreemal1");

        WebElement Login = driver.findElement(By.xpath("//*[@id=\"signInForm\"]/div[3]/input"));
        Login.click();
    }
    @Test
    public void NewUser(){
        //Register form
        WebElement newUser = driver.findElement(By.xpath("//*[@id=\"signInForm\"]/div[3]/a"));
        newUser.click();
    }
}
