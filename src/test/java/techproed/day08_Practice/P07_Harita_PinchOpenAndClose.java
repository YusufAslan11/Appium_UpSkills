package techproed.day08_Practice;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.basetest.HaritalarBaseTest;
import techproed.utilities.ReusableMethods;

public class P07_Harita_PinchOpenAndClose extends HaritalarBaseTest {
    /*
    Uygulama: Haritalar
Haritalar uygulamasına gir
Harita türü olarak Uydu seçeneğini seç
Arama motorunda Taj Mahal kelimelerini arat
Haritada Taj Mahal bölgesine zoom in ve zoom out işlemlerini yap
     */

    @Test
    public void testPinchOpenAndClose(){

        WebElement layers=driver.findElement(AppiumBy.accessibilityId("Layers"));
        clickGesture(driver,layers);

        WebElement closeMenu= driver.findElement(AppiumBy.id("com.google.android.apps.maps:id/layers_menu_satellite_layer"));
        clickGesture(driver,closeMenu);

    }

}/*
By layers = AppiumBy.accessibilityId("Layers");
By satellite = AppiumBy.id("com.google.android.apps.maps:id/layers_menu_satellite_layer");
By searchFirstResult = AppiumBy.id("com.google.android.apps.maps:id/compass_container");
By allowButton = AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button");
By closeButton = AppiumBy.xpath("//*[@content-desc=\"Close menu\"]");
By searchTextBox = AppiumBy.xpath("//*[@text=\"Search here\"]");
By searchTextBoxWritable = AppiumBy.xpath("//*[@text=\"Search here\"]");
*/
