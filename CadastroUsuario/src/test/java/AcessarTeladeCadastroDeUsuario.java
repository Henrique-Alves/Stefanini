import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.pt.Dado;

public class AcessarTeladeCadastroDeUsuario {
	
	WebDriver driver;
	
	public void inicializar() {
		driver = new FirefoxDriver();
		driver.get("http://prova.stefanini-jgr.com.br/teste/qa/");
		//driver.quit();
	}
	
	//acessar tela de cadastro;
	@Dado("^que acesso a tela de cadastro do usuário\\.$")
	public void queAcessoATelaDeCadastroDoUsuário() throws Throwable {
		inicializar();
	}
	
	
}