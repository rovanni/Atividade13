package br.edu.utfpr;

import br.edu.utfpr.login.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author andreendo
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest {

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
        driver.close();
    }

    @Test
    public void a_testLoginSucesso() {
        br.edu.utfpr.login.LoginPage loginPage = new LoginPage(driver);
        AddLoginPage login = new AddLoginPage(driver);
        FindLoginPage tes = new FindLoginPage(driver);
        login.setUserLogin("rovanni");
        login.setUserPassword("1234");
        login.clickBtnEntrar();

        assertTrue(tes.loginSucesso());
    }

    @Test
    public void b_testLoginErro() {
        br.edu.utfpr.login.LoginPage loginPage = new LoginPage(driver);
        AddLoginPage login = new AddLoginPage(driver);
        FindLoginPage tes = new FindLoginPage(driver);
        login.setUserLogin("rovanni");
        login.setUserPassword("");
        login.clickBtnEntrar();

        assertFalse(tes.loginSucesso());
    }

    @Test
    public void c_testCadastrarTarefa() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        a_testLoginSucesso();
        br.edu.utfpr.login.TarefasPage tarefaPage = new TarefasPage(driver);
        AddTarefaPage tarefa = new AddTarefaPage(driver);
        FindTarefaPage tes = new FindTarefaPage(driver);
        tarefa.setTarefaTitulo("Teste " + randomInt);
        tarefa.setTarefaDescricao("Realizando teste " + randomInt);
        tarefa.clickBtnCriar();
        assertTrue(tes.cadastroSucesso());
    }

}