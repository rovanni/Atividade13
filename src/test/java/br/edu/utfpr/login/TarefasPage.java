package br.edu.utfpr.login;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author Luciano Rovanni <luciano at luciano.rovanni>
 */
public class TarefasPage extends BasePage{
    public TarefasPage(WebDriver driver) {
        super(driver);
        driver.get("http://demo.redmine.org/projects/teste/issues/new");
    }      
}
