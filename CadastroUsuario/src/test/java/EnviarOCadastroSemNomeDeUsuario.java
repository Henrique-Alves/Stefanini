import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class EnviarOCadastroSemNomeDeUsuario {

	WebDriver driver;

	public void inicializar() {
		driver = new FirefoxDriver();
		driver.get("http://prova.stefanini-jgr.com.br/teste/qa/");
		// driver.quit();
	}

	// enviar cadastro sem nome;
	@Dado("^que inserir email do usário\\.$")
	public void queInserirEmailDoUsário() throws Throwable {
		inicializar();
		driver.findElement(By.id("email")).sendKeys("joao@gmail.com");
	}

	@E("^senha do usuário\\.$")
	public void senhaDoUsuário() throws Throwable {
		inicializar();
		driver.findElement(By.id("email")).sendKeys("joao@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345678");
	}

	@E("^clicar no botão cadastra\\.$")
	public void clicarNoBotãoCadastra() throws Throwable {
		inicializar();
		driver.findElement(By.id("email")).sendKeys("joao@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.id("register")).click();
	}

	@Então("^O sistema exibe a mensagem: O campo Nome é obrigatório\\.$")
	public void oSistemaExibeAMensagemOCampoNomeÉObrigatório() throws Throwable {
		inicializar();
		driver.findElement(By.id("email")).sendKeys("joao@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.id("register")).click();
		Assert.assertEquals("O campo Nome é obrigatório.",
				driver.findElement(By.xpath("//p[contains(text(),'O campo Nome é obrigatório.')]")).getText());
	}
}
