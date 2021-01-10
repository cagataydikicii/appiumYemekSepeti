package testSuits;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageMethod.methodClass;

import java.net.MalformedURLException;
import java.net.URL;

public class test {
    public AndroidDriver driver;
    public WebDriverWait wait;
    public DesiredCapabilities caps = new DesiredCapabilities();
    public String URL = "http://127.0.0.1:4723/wd/hub";

    @BeforeMethod
    public void setup () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 2 API 30");
        caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "10.0");
        caps.setCapability("autoGrantPermissions","true");
        caps.setCapability("appPackage", "com.inovel.app.yemeksepeti");
        caps.setCapability("appActivity","com.inovel.app.yemeksepeti.ui.splash.SplashActivity");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test(description = "Login olup şehir değiştirme")
    public void  test() throws InterruptedException {
        methodClass methodClass = new methodClass(driver,wait);
        String email = "x";
        String pass = "x";
        methodClass
                .loginMethod("x")
                .loginEmail(email)
                .loginPass(pass)
                .lokasyonMethod("x")
                ;
    }
    @Test(description = "Adres ekleme")
    public void test2() throws InterruptedException {
        methodClass methodClass = new methodClass(driver,wait);
        String email = "x";
        String pass = "x";
        String phone = "x";
        String adress = "x";
        String directAdress = "x";
        methodClass
                .loginMethod("x")
                .loginEmail(email)
                .loginPass(pass)
                .addAdress(phone,adress,directAdress)
        ;

    }
    @Test(description = "Restaurant listeleme yapıp filtre uygula")
    public void test3() throws InterruptedException {
        methodClass methodClass = new methodClass(driver,wait);
        String email = "x";
        String pass = "x";
        methodClass
                .loginMethod("x")
                .loginEmail(email)
                .loginPass(pass)
                .restaurantList()
                ;
    }
    @Test(description = "Sepete ürün ekle çıkart")
        public void test4 () throws InterruptedException {
            methodClass methodClass = new methodClass(driver, wait);
            String email = "x";
            String pass = "x";
            String food = "x";
            methodClass
                    .loginMethod("x")
                    .loginEmail(email)
                    .loginPass(pass)
                    .restautantPacket(food)
                    ;


    }
    @Test(description = "Sepette ürün var mı kontrol")
    public void test5 () throws InterruptedException {
        methodClass methodClass = new methodClass(driver, wait);
        String email = "x";
        String pass = "x";
        methodClass
                .loginMethod("x")
                .loginEmail(email)
                .loginPass(pass)
                .shoppingCart("x")

        ;
    }

}
