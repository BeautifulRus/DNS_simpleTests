package core;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;
import java.util.Map;




abstract public class Driver {


    protected static WebDriver driver;
    protected static WebDriverWait wait;


    public void initDriver() throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("application.properties"));
            initLocalDriver();
    }



    private void initLocalDriver() {

        if ("chrome".equalsIgnoreCase(System.getProperty("type.browser"))){
          driver = new ChromeDriver();
        }
        if ("edge".equalsIgnoreCase(System.getProperty("type.browser"))){
            driver = new EdgeDriver();
        }else Assertions.fail("I don't work with that browser. Please change the variable |type.browser| from file |application.properties| to the prescribed option in the code");

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(500));



    }




}