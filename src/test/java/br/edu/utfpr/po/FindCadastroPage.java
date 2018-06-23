/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Mussi
 */
public class FindCadastroPage {
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
}
