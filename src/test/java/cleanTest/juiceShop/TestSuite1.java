package cleanTest.juiceShop;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static utilities.RandomUtilities.getAlphaNumericString;

public class TestSuite1 extends TestBaseJuiceShop{

    @Test
    @DisplayName("Verify user can register")
    @Description("This is to verify if a normal user can register with valid date")
    @Owner("Agustin")
    @Link("www.google.com")
    @Issue("www.jira.com/bug0005")
    @Epic("Register")
    @Feature("Authentication")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Story login")
    public void registerAndLogin() throws InterruptedException {
        String randomEmail = getAlphaNumericString(5)+"@gmail.com";
        String pwd = "123456";
        //REGISTER
        indexArticles.skipWelcomeBtn.click();
        indexTopBar.accountBtn.click();
        indexTopBar.loginBtn.click();
        loginPage.registerBtn.click();
        registerPage.emailTxtbox.setText(randomEmail);
        registerPage.pwdTxtbox.setText(pwd);
        registerPage.repeatPwdTxtbox.setText(pwd);
        registerPage.securityQuestionComboBox.waitClickable();
        registerPage.securityQuestionComboBox.click();
        registerPage.setSecurityQuestionComboBox(1).waitPresence();
        registerPage.setSecurityQuestionComboBox(1).click();
        registerPage.answerSecurityQuestionTextbox.setText("12345");
        registerPage.registerBtn.click();

        Assertions.assertTrue(loginPage.submitLoginBtn.isControlDisplayed(),"ERROR user was not logged in");

        loginPage.emailTxtbox.setText(randomEmail);
        loginPage.pwdTxtbox.setText(pwd);
        loginPage.submitLoginBtn.click();

        Assertions.assertTrue(indexTopBar.basketBtn.isControlDisplayed(),"ERROR user was not logged in");
    }
}
