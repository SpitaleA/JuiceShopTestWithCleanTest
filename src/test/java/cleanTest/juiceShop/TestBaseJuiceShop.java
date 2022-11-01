package cleanTest.juiceShop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.juiceShop.IndexArticles;
import pages.juiceShop.IndexTopBar;
import pages.juiceShop.LoginPage;
import pages.juiceShop.RegisterPage;
import pages.todoLy.*;
import singletonSession.Session;

public class TestBaseJuiceShop {
    public IndexArticles indexArticles = new IndexArticles();
    public IndexTopBar indexTopBar = new IndexTopBar();
    public LoginPage loginPage = new LoginPage();
    public RegisterPage registerPage = new RegisterPage();

    @BeforeEach
    public void setup(){
        Session.getInstance().getBrowser().get("http://localhost:3000/#/");
    }
    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }
}
