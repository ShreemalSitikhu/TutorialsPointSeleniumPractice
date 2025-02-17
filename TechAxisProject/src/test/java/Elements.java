import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class Elements {
    WebDriver driver;
    @BeforeClass
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\TechAxisProject\\src\\test\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
    }

    @Test
    public void TextBox() {
        WebElement name = driver.findElement(By.id("fullname"));
        name.sendKeys("Shreemal Sitikhu");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("shreemalsitikhu@gmail.com");

        WebElement address = driver.findElement(By.xpath("//textarea[@placeholder='Currend Address']")); // Correct XPath for address field
        address.sendKeys("Bhaktapur Goldmodi 5");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Shreemal1");

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"TextForm\"]/div[5]/input"));
        submit.click();
    }

    @Test(priority = 1)
    public void CheckBox() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"headingOne\"]/button"));
        element.click();

        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"navMenus\"]/li[2]"));
        checkbox.click();

        WebElement label1 = driver.findElement(By.xpath("//*[@id=\"c_bs_1\"]"));
        label1.click();
    }

    @Test(priority = 2)
    public void RadioButton() {
//        WebElement element = driver.findElement(By.xpath("//*[@id=\"headingOne\"]/button"));
//        element.click();

        WebElement radiobtn = driver.findElement(By.xpath("//*[@id=\"navMenus\"]/li[3]/a"));
        radiobtn.click();

        WebElement yes = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/input"));
        yes.click();
    }

    @Test(priority = 3)
    public  void WebTables() throws InterruptedException {
//        try {
            WebElement webtables = driver.findElement(By.xpath("//*[@id=\"navMenus\"]/li[4]/a"));
            webtables.click();

            WebElement add = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/span[1]/button"));
            add.click();
            sleep(1000);

            WebElement firstname = driver.findElement(By.id("firstname"));
            firstname.sendKeys("Shreemal");

            WebElement lastname = driver.findElement(By.id("lastname"));
            lastname.sendKeys("Sitikhu");

            WebElement email = driver.findElement(By.id("email"));
            email.sendKeys("shreemalsitikhu@gmail.com");

            WebElement age = driver.findElement(By.id("age"));
            age.sendKeys("Four");

            WebElement salary = driver.findElement(By.id("salary"));
            salary.sendKeys("00000000000000050000");

            WebElement department = driver.findElement(By.id("deparment"));
            department.sendKeys("Quality Analyst");

            WebElement Login = driver.findElement(By.xpath("//*[@id=\"RegisterForm\"]/div[2]/input"));
            Login.click();
        }
//        catch (Exception e) {
//            System.out.println(e);
//        }

//    }

    @Test(priority = 4)
    public void Button1(){
//        WebElement element = driver.findElement(By.xpath("//*[@id=\"headingOne\"]/button"));
//        element.click();

        WebElement button1 = driver.findElement(By.xpath("//*[@id=\"navMenus\"]/li[5]/a/text()"));
        button1.click();

        WebElement clickMe = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[1]"));
        clickMe.click();

        WebElement rightClickMe = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[2]"));
        rightClickMe.click();

        WebElement doubleClickMe = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[3]"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickMe).perform();
    }

    @Test(priority = 5)
    public void upload_and_download(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"headingOne\"]/button"));
        element.click();

        WebElement upload_and_download = driver.findElement(By.xpath("//*[@id=\"navMenus\"]/li[8]/a"));
        upload_and_download.click();

        WebElement download = driver.findElement(By.id("downloadButton"));
        download.click();

        driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\user\\IdeaProjects\\TechAxisProject\\src\\images\\SidhiKali-Thimi.jpg");
    }

    @Test(priority = 6)
    public void dynamicProperties(){
        WebElement dynamicProperties = driver.findElement(By.xpath("//*[@id=\"navMenus\"]/li[9]/a"));
        dynamicProperties.click();

        WebElement colorChange = driver.findElement(By.id("colorChange"));
        colorChange.click();
    }
}
