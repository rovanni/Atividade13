package br.edu.utfpr.login;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author Luciano Rovanni <luciano at luciano.rovanni>
 */
public class FindTarefaPage extends BasePage {

    WebDriver dr;

    public FindTarefaPage(WebDriver driver) {
        super(driver);
        dr = driver;
    }

    public boolean cadastroSucesso() {
        return dr.getCurrentUrl().contains("demo.redmine.org/issues/");
    }
    
    public boolean exclusaoSucesso() {
        return dr.getCurrentUrl().contains("demo.redmine.org/projects/teste/issues");
    }    

    public String getUrl() {
        return driver.getCurrentUrl();

    }
}
