package br.edu.utfpr.login;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author Luciano Rovanni <luciano at luciano.rovanni>
 */
public class FindLoginPage extends BasePage {

    WebDriver dr;

    public FindLoginPage(WebDriver driver) {
        super(driver);
        dr = driver;
    }

    public boolean loginSucesso() {
        switch (dr.getCurrentUrl()) {
            case "http://demo.redmine.org/my/page":
                return dr.getCurrentUrl().equals("http://demo.redmine.org/my/page");
            case "http://www.redmine.org/":
                return dr.getCurrentUrl().equals("http://demo.redmine.org/");
            default:
                return false;
        }
    }

    public String getUrl() {
        return driver.getCurrentUrl();

    }
}
