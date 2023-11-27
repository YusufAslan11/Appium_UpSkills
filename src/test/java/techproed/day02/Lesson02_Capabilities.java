package techproed.day02;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Lesson02_Capabilities {
    @Test
    public void testUiAutomator2Options() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setApp("C:\\Users\\ttyus\\IdeaProjects\\Appium_UpSkills\\src\\test\\resources\\ApiDemos-debug.apk")
                .setAvd("pixelq") // Kapalı emülatörü açmak için
                .setAvdLaunchTimeout(Duration.ofSeconds(5)); //Emülatörün açılması için süre tanıyoruz
 //              .setUdid("emulator-5554") //2. bir cihaz kullanmayacaksak yazmaya gerek yok
//                .setAppPackage("io.appium.android.apis") //setApp varken gerek yok
//                .setAppActivity("io.appium.android.apis.ApiDemos"); //setApp varken gerek yok

        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver = new AndroidDriver(url, options);
    }


}
