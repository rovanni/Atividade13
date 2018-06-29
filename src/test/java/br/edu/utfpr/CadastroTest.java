package br.edu.utfpr;

import br.edu.utfpr.po.AddCadastroPage;
import br.edu.utfpr.po.CadastroPage;
import br.edu.utfpr.po.FindCadastroPage;
import br.edu.utfpr.util.CaminhoGeckodriver;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author andreendo
 */
public class CadastroTest {

    private WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        //para mudar o caminho do geckodriverCaminho altere no pacote util no metodo geckodriverCaminho
        br.edu.utfpr.util.CaminhoGeckodriver c = new CaminhoGeckodriver();
        System.setProperty("webdriver.gecko.driver", c.geckodriverCaminho());
    }

    @Before
    public void before() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void after() {
        driver.close();
    }

    @Test
    public void testCadastrarRemovercadastroSucesso() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        br.edu.utfpr.po.CadastroPage cadastroPage = new CadastroPage(driver);

        FindCadastroPage findCadastroPage = new FindCadastroPage(driver);
        AddCadastroPage addCadastroPage = findCadastroPage.goToAddCadastro();
        AddCadastroPage cad = addCadastroPage.setUserFirstName("Joao" + randomInt)
                .setUserLastName("Da Silva")
                .setUserPassword("1234")
                .setUserPasswordConfirma("1234")
                .setUserEmail("joao" + randomInt + "@hotmail.com")
                .setUserLogin("joao" + randomInt);

        addCadastroPage.clickFindButton();

        assertTrue(findCadastroPage.gravadoSucesso());

        //apagando cadastro realizado
        addCadastroPage.clickExcluirConta();
        addCadastroPage.clickConfirma();
        addCadastroPage.clickDeleteMyAcount();

        assertTrue(findCadastroPage.deletadoSucesso());

    }

    @Test
    public void testErroCadastro() {
        br.edu.utfpr.po.CadastroPage cadastroPage = new CadastroPage(driver);

        FindCadastroPage findCadastroPage = new FindCadastroPage(driver);
        AddCadastroPage addCadastroPage = findCadastroPage.goToAddCadastro();
        AddCadastroPage cad = addCadastroPage.setUserFirstName("Ricardo")
                .setUserLastName("Mussi")
                .setUserPassword("1234")
                .setUserPasswordConfirma("1234")
                .setUserEmail("rickmussi@hotmail.com")
                .setUserLogin("rickmussi");

        addCadastroPage.clickFindButton();

        assertFalse(findCadastroPage.gravadoSucesso());
    }

}
