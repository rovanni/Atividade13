package br.edu.utfpr;

import br.edu.utfpr.issue.FindIssuesPage;
import br.edu.utfpr.issue.IssuesPage;
import br.edu.utfpr.issue.SetIssuesPage;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author andreendo
 */
public class IssueTest {

    private WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.gecko.driver", "C:\\wcd\\TestadorAPP\\geckodriver.exe");
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
    public void testFiltroIssue() {
        IssuesPage issuePage = new IssuesPage(driver);

        FindIssuesPage findIssuesPage = new FindIssuesPage(driver);
        SetIssuesPage setIssuesPage = findIssuesPage.goToSetIssues();
        SetIssuesPage filtro = setIssuesPage.AddFiltro("Tracker")
                .AddFiltro("Priority")
                .AddFiltro("Author")
                .AddFiltro("Category")
                .AddFiltro("Subject")
                .AddFiltro("Closed")
                .AddFiltro("Blocks");

        assertEquals("Tracker", setIssuesPage.vefificarFiltro_02());
        assertEquals("Priority", setIssuesPage.vefificarFiltro_03());
        assertEquals("Author", setIssuesPage.vefificarFiltro_04());
        assertEquals("Category", setIssuesPage.vefificarFiltro_05());
        assertEquals("Subject", setIssuesPage.vefificarFiltro_06());
        assertEquals("Closed", setIssuesPage.vefificarFiltro_07());
        assertEquals("Blocks", setIssuesPage.vefificarFiltro_08());

    }

    @Test
    public void testCheckFiltros() {
        IssuesPage issuePage = new IssuesPage(driver);

        FindIssuesPage findIssuesPage = new FindIssuesPage(driver);
        SetIssuesPage setIssuesPage = findIssuesPage.goToSetIssues();
        SetIssuesPage filtro = setIssuesPage.AddFiltro("Tracker")
                .AddFiltro("Priority")
                .AddFiltro("Author")
                .AddFiltro("Category")
                .AddFiltro("Subject")
                .AddFiltro("Closed")
                .AddFiltro("Blocks");

        setIssuesPage.filtro_03_demarcarCheck();

        assertTrue(setIssuesPage.vefificarFiltro_02_isCheck());
        assertFalse(setIssuesPage.vefificarFiltro_03_isCheck());

    }
}