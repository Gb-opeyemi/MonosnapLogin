package Monosnaplogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MonosnapLoginTests {
    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://monosnap.com/");
        Thread.sleep(5000);

        // maximize the window
        driver.manage().window().maximize();
        // get page title
        System.out.println(driver.getTitle());
        // To make the page wait until the URL fully loads so as to avoid our test from Failing, add a global wait time.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.className("headButton")).click();
        driver.findElement(By.xpath("//input[@class='w-100 textInput in']")).sendKeys("henryt1455@gmail.com");
        driver.findElement(By.xpath("//input[@class='w-100 textInput']")).sendKeys("7FE@fakehenry");
        driver.findElement(By.xpath("//button[@class='login']")).click();
    }
    public static void main(String args[]) throws InterruptedException {
        MonosnapLoginTests test = new  MonosnapLoginTests();
        test.setUp();
    }


}
