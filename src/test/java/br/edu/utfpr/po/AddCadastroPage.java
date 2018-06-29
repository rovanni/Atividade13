/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Mussi
 */
public class AddCadastroPage extends BasePage {

    @FindBy(id = "user_login")
    WebElement userLogin;

    @FindBy(id = "user_password")
    WebElement userPassword;

    @FindBy(id = "user_password_confirmation")
    WebElement userPasswordConfirma;

    @FindBy(id = "user_firstname")
    WebElement userFirstName;

    @FindBy(id = "user_lastname")
    WebElement userLastName;

    @FindBy(id = "user_mail")
    WebElement userEmail;

    @FindBy(id = "user_language")
    WebElement userLanguage;

    @FindBy(id = "user_custom_field_values_3")
    WebElement userCustom;

    @FindBy(name = "commit")
    WebElement btnEnviar;

    @FindBy(xpath = "/html/body/div/div/div[1]/div[3]/div[1]/p[2]/a")
    WebElement btnExcluirConta;

    @FindBy(id = "confirm")
    WebElement btnConfirma;

    @FindBy(xpath = "/html/body/div/div/div[1]/div[3]/div[2]/div[1]/form/input[3]")
    WebElement btnDeleteMyAcount;

    public AddCadastroPage(WebDriver driver) {
        super(driver);
    }

    public AddCadastroPage setUserLogin(String pUserLogin) {
        userLogin.clear();
        userLogin.sendKeys(pUserLogin);

        return this;
    }

    public AddCadastroPage setUserPassword(String pUserPassword) {
        userPassword.clear();
        userPassword.sendKeys(pUserPassword);

        return this;
    }

    public AddCadastroPage setUserPasswordConfirma(String pUserPasswordConfirma) {
        userPasswordConfirma.clear();
        userPasswordConfirma.sendKeys(pUserPasswordConfirma);

        return this;
    }

    public AddCadastroPage setUserFirstName(String pUserFirstName) {
        userFirstName.clear();
        userFirstName.sendKeys(pUserFirstName);

        return this;
    }

    public AddCadastroPage setUserLastName(String pUserLastName) {
        userLastName.clear();
        userLastName.sendKeys(pUserLastName);

        return this;
    }

    public AddCadastroPage setUserEmail(String pUserEmail) {
        userEmail.clear();
        userEmail.sendKeys(pUserEmail);

        return this;
    }

    public AddCadastroPage setUserLanguage(String pUserLanguage) {
        userLanguage.clear();
        userLanguage.sendKeys(pUserLanguage);

        return this;
    }

    public AddCadastroPage setUserCustom(String pUserCustom) {
        userCustom.clear();
        userCustom.sendKeys(pUserCustom);

        return this;
    }

    public ListCadastroPage clickFindButton() {
        btnEnviar.click();
        return new ListCadastroPage(driver);
    }

    public ListCadastroPage clickExcluirConta() {
        btnExcluirConta.click();
        return new ListCadastroPage(driver);
    }

    public ListCadastroPage clickConfirma() {
        btnConfirma.click();
        return new ListCadastroPage(driver);
    }

    public ListCadastroPage clickDeleteMyAcount() {
        btnDeleteMyAcount.click();
        return new ListCadastroPage(driver);
    }

}
