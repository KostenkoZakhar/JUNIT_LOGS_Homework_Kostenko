package config;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import utils.WorkWithFile;
import utils.WorkWithLogs;

import java.util.HashMap;
import java.util.Map;

public class BaseClass1 {
    public static WebDriver driver;
    public static Map<String,String> map=new HashMap<>();
    @BeforeClass
    public static void openChrome() {
        driver = DriverConfig.createDriver(Browsers.CHROMELOGS);
    }

    @AfterClass
    public static void closeChrome() throws InterruptedException {
     //   Thread.sleep(5000);
        WorkWithLogs.printLogs(driver);
        WorkWithFile.createFile("UserEmailLogs",WorkWithLogs.getLogEntries(driver));
        WorkWithFile.createFile("Map",map);
        driver.quit();
    }

}
