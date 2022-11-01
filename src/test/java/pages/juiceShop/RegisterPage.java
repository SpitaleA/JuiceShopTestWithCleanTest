package pages.juiceShop;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class RegisterPage {
    public TextBox emailTxtbox = new TextBox(By.id("emailControl"),"Email Texbox");
    public TextBox pwdTxtbox = new TextBox(By.id("passwordControl"),"Password Textbox");
    public TextBox repeatPwdTxtbox = new TextBox(By.id("repeatPasswordControl"),"Repeat Pwd Textbox");
    public Button securityQuestionComboBox = new Button(By.xpath("//mat-select"),"Security question Combobox");
    public TextBox answerSecurityQuestionTextbox = new TextBox(By.id("securityAnswerControl"),"Security question answer Combobox");
    public Button registerBtn = new Button(By.id("registerButton"),"Confirm register button");

    public Button setSecurityQuestionComboBox(int positionArray){
        Button securityQuestionComboBoxSelected = new Button(By.xpath("//mat-option[\""+(positionArray)+"\"]"),"Security question selected Combobox");
        return securityQuestionComboBoxSelected;
    }




}
