package br.edu.utfpr.po;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author andreendo
 */
public class CadastroInformationPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"flash_notice\"]")
    WebElement cadastroSucesso;

    @FindBy(id = "errorExplanation")
    WebElement erro;

    public CadastroInformationPage(WebDriver driver) {
        super(driver);
    }

    public boolean addValidData() {
        if (erro != null) {
            return false;
        }
        return true;
    }

}
