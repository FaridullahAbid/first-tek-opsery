package NewProject.Base;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Base {

    private static ChromeDriver driver;

    public void OpeingingBrowser (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public ChromeDriver getdriver(){
        return driver;
    }
}
