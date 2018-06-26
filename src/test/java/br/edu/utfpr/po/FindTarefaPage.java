/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author Luciano Rovanni <luciano at luciano.rovanni>
 */
public class FindTarefaPage extends BasePage {
//
//    @FindBy(xpath = "/html/body/div/div/div[1]/div[3]/div[2]/h2")
//    WebElement title;
//
//    @FindBy(xpath = "//*[@id=\"errorExplanation\"]/ul/li[1]")
//    WebElement erroEmail;
//
//    @FindBy(xpath = "//*[@id=\"errorExplanation\"]/ul/li[2]")
//    WebElement erroLogin;
//
//    @FindBy(xpath = "//*[@id=\"errorExplanation\"]/ul/li[3]")
//    WebElement erroFirstName;
//
//    @FindBy(xpath = "//*[@id=\"errorExplanation\"]/ul/li[4]")
//    WebElement erroLastName;
//
//    @FindBy(xpath = "//*[@id=\"errorExplanation\"]/ul/li[5]")
//    WebElement erroPasssword;
//

    WebDriver dr;

    public FindTarefaPage(WebDriver driver) {
        super(driver);
        dr = driver;
    }

//    public AddLoginPage goToAddCadastro() {
//        //btnEnviar.click();
//
//        return new AddLoginPage(driver);
//    }
//
//    public WebElement getTitle() {
//        return title;
//    }
//
//    public boolean validCadastro() {
//        if (erroEmail != null) {
//            return false;
//        }
//        if (erroFirstName != null) {
//            return false;
//        }
//        if (erroLastName != null) {
//            return false;
//        }
//        if (erroLogin != null) {
//            return false;
//        }
//        if (erroPasssword != null) {
//            return false;
//        }
//        return true;
//    }
    public boolean cadastroSucesso() {
        return dr.getCurrentUrl().contains("https://www.redmine.org/issues/");
    }

    public String getUrl() {
        return driver.getCurrentUrl();

    }
}
