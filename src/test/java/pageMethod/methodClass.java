package pageMethod;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import objectRepo.objectRepo;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import testSuits.test;

import java.net.MalformedURLException;
import java.net.URL;

import java.time.Duration;
import java.util.List;



import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.lang.Thread.sleep;
import static java.time.Duration.ofMillis;
import static org.aspectj.bridge.MessageUtil.info;


public class methodClass extends test {
    public methodClass(AndroidDriver driver,WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        new TouchAction(driver);
    }
    @BeforeMethod
    public void beforeSuite() throws MalformedURLException {
        driver = new AndroidDriver<MobileElement>(new URL(this.URL),this.caps);
    }

    public methodClass click(By by){
        driver.findElement(by).click();
        return this;
    }
    public methodClass sendKeys(By by,String value){
        driver.findElement(by).sendKeys(value);
        return this;
    }
    public methodClass info(String value) {
        System.out.println(value);
        return this;
    }
    public methodClass touch(){
        TouchAction swipe = new TouchAction(driver)
                .press(PointOption.point(505,1519))
                .waitAction(waitOptions(ofMillis(800)))
                .moveTo(PointOption.point(558,461))
                .release()
                .perform();

        return this;
    }

    public methodClass moveToElement(MobileElement element) {

        Actions action = new Actions(driver);
        action.moveToElement(element, 10, 10);
        action.perform();
        return this;
    }
    public methodClass dragAndDrop(MobileElement From, int x, int y) {
        Actions act = new Actions(driver);
        act.dragAndDropBy(From, x, y).build().perform();
        return this;
    }
    public methodClass searchMethod (String value){
        sendKeys(objectRepo.searchText,value);
        return this;
    }


    public methodClass hoverMethod (String value) {

        List<MobileElement> elementList = (List<MobileElement>) driver.findElementsByClassName("android.widget.TextView");
        for (int i = 0; i < elementList.size(); i++) {
            if (elementList.get(i).getText().contains(value)) {
                moveToElement(elementList.get(i));
                elementList.get(i).click();

                break;

            }
        }
        return null;
    }

    public methodClass loginMethod(String value, String value2) throws InterruptedException {
        sleep(3000);
        hoverMethod(value);
        sleep(3000);
        searchMethod(value2);
        sleep(3000);
        hoverMethod(value2);

        return this;
    }

    public methodClass loginEmail(String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(objectRepo.loginButton));
        click(objectRepo.loginButton);
        wait.until(ExpectedConditions.visibilityOfElementLocated(objectRepo.emailText));
        sendKeys(objectRepo.emailText,value);
        return this;
    }

    public methodClass loginPass(String value) {
        sendKeys(objectRepo.passText,value);
        click(objectRepo.loginButton);
        wait.until(ExpectedConditions.visibilityOfElementLocated(objectRepo.banabiClose));
        click(objectRepo.banabiClose);
        return this;
    }
    public methodClass timeLineBarDrag(String value, int x, int y) {
        if(value=="1"){
            WebElement element = driver.findElement(By.cssSelector("[class='irs js-irs-" + value + "'] [class='irs-slider to type_last']"));
            moveToElement(element);
            dragAndDrop(element, x, y);
        }else {
            WebElement element = driver.findElement(By.cssSelector("[class='irs js-irs-" + value + "'] [class='irs-slider to']"));
            moveToElement(element);
            dragAndDrop(element, x, y);
        }
        return this;
    }
public methodClass drawLine =function(x1, y1, x2, y2){
        MobileElement line = (new TouchAction(driver))
                .press({x:x1,y:y1})
    .moveTo({x:x2, y:y2})
    .release();
        driver.performTouchAction(line);
    }

    public methodClass lokasyonMethod(String value, String value2) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(objectRepo.another));
        click(objectRepo.another);
         touch();
        click(objectRepo.nextTown);
        sleep(3000);
        searchMethod(value);
        hoverMethod(value);
        sleep(3000);
        searchMethod(value2);
        sleep(3000);
        hoverMethod(value2);


        return this;
    }


    public methodClass addAdress(String value,String value2,String value3) {
        click(objectRepo.another);
        click(objectRepo.adress);
        click(objectRepo.addAdress);
        touch();
        sendKeys(objectRepo.phone,value);
        sendKeys(objectRepo.newAdress,value2);
        click(objectRepo.newAddAdress);
        sendKeys(objectRepo.directAdress,value3);
        click(objectRepo.saveAdress);



        return this;
    }
    public methodClass touch2(){
        TouchAction swipe = new TouchAction(driver)
                .press(PointOption.point(522,1379))
                .waitAction(waitOptions(ofMillis(800)))
                .moveTo(PointOption.point(536,362))
                .release()
                .perform();

        return this;
    }

    public methodClass restaurantList() throws InterruptedException {
        click(objectRepo.restaurantList);
        wait.until(ExpectedConditions.visibilityOfElementLocated(objectRepo.filtre));
        click(objectRepo.filtre);
        sleep(2000);
        touch();
        click(objectRepo.payMethod);
        sleep(2000);
        click(objectRepo.payButton);
        sleep(2000);
        click(objectRepo.payFiliter);

        return this;
    }

    public methodClass restautantPacket(String value) {
        click(objectRepo.restaurantList);
        wait.until(ExpectedConditions.visibilityOfElementLocated(objectRepo.searcFood));
        click(objectRepo.searcFood);
        sendKeys(objectRepo.searcFoodText,value);
        click(objectRepo.food);
        return this;
    }
    public methodClass controlMethod(String value, By elementName){
        AndroidElement element = (AndroidElement) driver.findElement(elementName);
        element.getText();
        Assert.assertEquals(element.getText(),value);
        info("Değer Doğru Dönmüştür  " + element.getText());


        return this;
    }

    public methodClass shoppingCart(String value) {
        click(objectRepo.shoppingCart);
        controlMethod(value,objectRepo.shoppingText);
        return this;
    }
}
