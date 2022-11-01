package pages.juiceShop;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class IndexTopBar {

    public Button accountBtn = new Button(By.id("navbarAccount"),"Account Button");
    public Button loginBtn = new Button(By.id("navbarLoginButton"),"Login Button");
    public Button basketBtn = new Button(By.xpath("//button[@routerlink=\"/basket\"]"));


}
