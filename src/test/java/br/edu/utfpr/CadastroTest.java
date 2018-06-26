package br.edu.utfpr;

import br.edu.utfpr.po.AddCadastroPage;
import br.edu.utfpr.po.AddLoginPage;
import br.edu.utfpr.po.AddTarefaPage;
import br.edu.utfpr.po.CadastroPage;
import br.edu.utfpr.po.FindCadastroPage;
import br.edu.utfpr.po.FindLoginPage;
import br.edu.utfpr.po.FindTarefaPage;
import br.edu.utfpr.po.LoginPage;
import br.edu.utfpr.po.TarefasPage;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
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
        //System.setProperty("webdriver.gecko.driver", "C:\\wcd\\TestadorAPP\\geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Java\\geckodriver.exe");//PC Luciano
    }

    @Before
    public void before() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void after() {
        //driver.close();
    }

//    @Test
//    public void testSuccessfulCadastro() {
//        br.edu.utfpr.po.CadastroPage cadastroPage = new CadastroPage(driver);
//
//        FindCadastroPage findCadastroPage = new FindCadastroPage(driver);
//        AddCadastroPage addCadastroPage = findCadastroPage.goToAddCadastro();
//        AddCadastroPage cad = addCadastroPage.setUserFirstName("Joao")
//                .setUserLastName("Da Silva")
//                .setUserPassword("1234")
//                .setUserPasswordConfirma("1234")
//                .setUserEmail("joao1@hotmail.com")//mudar sempre o email para conseguir realizar o cadastro
//                .setUserLogin("jao1")//mudar sempre o login para conseguir realizar o cadastro
//                .setUserCustom("Joao");
//
//        addCadastroPage.clickFindButton();
//
//        assertTrue(findCadastroPage.gravadoSucesso());
//    }
//
//    @Test
//    public void testErroCadastro() {
//        br.edu.utfpr.po.CadastroPage cadastroPage = new CadastroPage(driver);
//
//        FindCadastroPage findCadastroPage = new FindCadastroPage(driver);
//        AddCadastroPage addCadastroPage = findCadastroPage.goToAddCadastro();
//        AddCadastroPage cad = addCadastroPage.setUserFirstName("Joao")
//                .setUserLastName("Da Silva")
//                .setUserPassword("1234")
//                .setUserPasswordConfirma("1234")
//                .setUserEmail("joao1@hotmail.com")
//                .setUserLogin("joao1")
//                .setUserCustom("Joao");
//
//        addCadastroPage.clickFindButton();
//
//        assertFalse(findCadastroPage.gravadoSucesso());
//    }
    @Test
    public void testLoginSucesso() {
        br.edu.utfpr.po.LoginPage loginPage = new LoginPage(driver);
        AddLoginPage login = new AddLoginPage(driver);
        FindLoginPage tes = new FindLoginPage(driver);
        login.setUserLogin("rovanni");
        login.setUserPassword("1234");
        login.clickBtnEntrar();

        assertTrue(tes.loginSucesso());
    }

    @Test
    public void testLoginErro() {
        br.edu.utfpr.po.LoginPage loginPage = new LoginPage(driver);
        AddLoginPage login = new AddLoginPage(driver);
        FindLoginPage tes = new FindLoginPage(driver);
        login.setUserLogin("rovanni");
        login.setUserPassword("");
        login.clickBtnEntrar();

        assertFalse(tes.loginSucesso());
    }

    @Test
    public void testCadastrarTarefa() {
        testLoginSucesso();
        br.edu.utfpr.po.TarefasPage tarefaPage = new TarefasPage(driver);
        AddTarefaPage tarefa = new AddTarefaPage(driver);
        FindTarefaPage tes = new FindTarefaPage(driver);
        tarefa.setTarefaTitulo("Teste");
        tarefa.setTarefaDescricao("Testando testes");
        tarefa.clickBtnCriar();
        assertTrue(tes.cadastroSucesso());
    }

    @Ignore
    @Test
    public void testTituloPageCadastro() {
        br.edu.utfpr.po.CadastroPage cadastroPage = new CadastroPage(driver);
        FindCadastroPage findCadastroPage = new FindCadastroPage(driver);
        AddCadastroPage addCadastroPage = findCadastroPage.goToAddCadastro();
        assertEquals("Cadastre-se", findCadastroPage.getTitle());
    }
}
