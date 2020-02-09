package co.uk.zoopla.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class Browsers extends Driver {


    private WebDriver initChrome() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();

    }

    private WebDriver initHeadlessChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu", "--headless");
        return new ChromeDriver(options);

    }

    private WebDriver initFireFox() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();

    }

    private WebDriver initHeadlessFireFox() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-gpu", "--headless");
        return new FirefoxDriver(options);

    }

    public void launchBrowser(String browser) {
        switch (browser) {
            case "Chrome":
                driver = initChrome();
                break;
            case "FireFox":
                driver = initFireFox();
                break;
            case "HeadlessChrome":
                driver = initHeadlessChrome();
                break;
            case "HeadlessFireFox":
                driver = initHeadlessFireFox();
                break;
            default:
                driver = initHeadlessChrome();
              break;
        }
       driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
    public void closeBrowser()
    {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}