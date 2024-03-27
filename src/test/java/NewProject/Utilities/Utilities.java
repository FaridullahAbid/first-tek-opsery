package NewProject.Utilities;

import NewProject.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utilities extends Base {
    public String gettext (By locater) {
        WebDriverWait wait = new WebDriverWait(getdriver(), Duration.ofSeconds(10));
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(locater)).getText();
        return text;
    }
    public void clickElement (By locater){
        WebDriverWait wait = new WebDriverWait(getdriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locater)).click();
    }
}
