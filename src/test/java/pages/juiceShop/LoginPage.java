package pages.juiceShop;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox emailTxtbox = new TextBox(By.id("email"),"Email textbox");
    public TextBox pwdTxtbox = new TextBox(By.id("password"),"Pwd textbox");
    public Button submitLoginBtn = new Button(By.id("loginButton"),"Submit Login Button");
    public Button registerBtn = new Button(By.id("newCustomerLink"),"Register Button");
}
