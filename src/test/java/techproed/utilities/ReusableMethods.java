package techproed.utilities;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;
public class ReusableMethods {

    public void clickGesture(AndroidDriver driver, WebElement element){
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));
    }

    public void clickGesture(AndroidDriver driver, int x, int y){
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", x,
                "y", y
        ));
    }


    public void doubleClickGesture(AndroidDriver driver, WebElement element){
        driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));
    }

    public void doubleClickGesture(AndroidDriver driver, int x, int y){
        driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of(
                "x", x,
                "y", y
        ));
    }

    public void longClickGesture(AndroidDriver driver, WebElement element){
        driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));
    }

    public void longClickGesture(AndroidDriver driver, WebElement element, int milisecond){
        driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "duration", milisecond
        ));
    }

    public void longClickGesture(AndroidDriver driver, int x, int y){
        driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
                "x", x,
                "y", y
        ));
    }

    public void longClickGesture(AndroidDriver driver, int x, int y, int milisecond){
        driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
                "x", x,
                "y", y,
                "duration", milisecond
        ));
    }
}
