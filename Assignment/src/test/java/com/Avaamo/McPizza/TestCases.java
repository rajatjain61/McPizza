import com.Avaamo.McPiazza.pages.LoginPage;
import com.Avaamo.McPiazza.pages.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases {
    private WebDriver driver;
    private LoginPage loginPage;
    private WelcomePage welcomePage;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\singh\\IdeaProjects\\Assignment\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://c0.avaamo.com/web_channels/cce5f713-c1f4-4666-8976-b091299cda81/demo.html?banner=true&demo=true&banner_text=%20&banner_title=This%20is%20how%20the%20chat%20agent%20shows%20up");
        loginPage = new LoginPage(driver);
        welcomePage = new WelcomePage(driver);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test(priority = 1)
    public void testLogin() {
        loginPage.login("your_username", "your_password");
    }

    @Test(priority = 2)
    public void testOrderVegPizza() {
        welcomePage.sendMessage("I want to order a pizza");
        welcomePage.orderVegPizza();
    }

    @Test(priority = 3)
    public void testOrderNonVegPizza() {
        welcomePage.sendMessage("I want to order a pizza");
        welcomePage.orderNonVegPizza();
    }

    @Test(priority = 4)
    public void testGiveThumbsUp() {
        welcomePage.giveThumbsUp();
    }

    @Test(priority = 5)
    public void testGiveThumbsDown() {
        welcomePage.giveThumbsDown();
    }
}