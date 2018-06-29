package br.edu.utfpr.login;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author Luciano Rovanni <luciano at luciano.rovanni>
 */
public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
        driver.get("http://demo.redmine.org/login");
    }      
}
