package pages.juiceShop;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class IndexArticles {

    public Button skipWelcomeBtn = new Button(By.xpath("//span[contains(text(),\"Dismiss\")]"),"Skip welcome Button");

    public Button findItemByName(String itemName){
        Button item = new Button(By.xpath("//div[contains(text(),\""+ itemName +"\")]/../../following-sibling::div/button"));
        return item;
    }
}
