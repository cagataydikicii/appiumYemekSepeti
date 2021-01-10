package objectRepo;

import org.openqa.selenium.By;

public class objectRepo  {

    public static By sehir = By.cssSelector("[resource-id='com.inovel.app.yemeksepeti:id/cityNameTextView']");
    public static By searchText = By.id("com.inovel.app.yemeksepeti:id/search_src_text");
    public static By searchButton = By.id("com.inovel.app.yemeksepeti:id/search_mag_icon");
    public static By loginButton = By.id("com.inovel.app.yemeksepeti:id/loginButton");
    public static By emailText = By.id("com.inovel.app.yemeksepeti:id/userNameEditText");
    public static By passText = By.id("com.inovel.app.yemeksepeti:id/passwordEditText");
    public static By banabiClose = By.id("com.inovel.app.yemeksepeti:id/negativeButton");
    public static By nextTown = By.id("com.inovel.app.yemeksepeti:id/changeCityTextView");
    public static By addAdress = By.id("com.inovel.app.yemeksepeti:id/newAddressButton");
    public static By phone = By.id("com.inovel.app.yemeksepeti:id/phoneNumberEditText");
    public static By another = By.xpath("//android.widget.FrameLayout[@content-desc=\"Diğer\"]/android.view.ViewGroup/android.widget.TextView");
    public static By newAddAdress = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[1]");
    public static By adress = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.TextView");
    public static By newAdress = By.id("com.inovel.app.yemeksepeti:id/addressEditText");
    public static By directAdress = By.id("com.inovel.app.yemeksepeti:id/addressDescriptionEditText");
    public static By saveAdress = By.id("com.inovel.app.yemeksepeti:id/updateButton");
    public static By restaurantList = By.id("com.inovel.app.yemeksepeti:id/listRestaurantsButton");
    public static By filtre = By.id("com.inovel.app.yemeksepeti:id/fabContainer");
    public static By payMethod = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.ViewSwitcher/android.widget.LinearLayout/android.view.ViewGroup[4]");
    public static By payButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.ViewSwitcher/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.RadioButton");
    public static By payFiliter = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup");
    public static By searcFood = By.id("com.inovel.app.yemeksepeti:id/action_search");
    public static By searcFoodText = By.id("com.inovel.app.yemeksepeti:id/search_src_text");
    public static By food = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.view.ViewGroup");
    public static By shoppingCart = By.xpath("//android.widget.FrameLayout[@content-desc=\"Sepetim\"]/android.widget.ImageView");
    public static By shoppingText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.TextView[1]");


}
