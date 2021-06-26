package meuframe.steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import meuframe.metodos.Metodos;

public class LoginTest {

	Metodos metodo = new Metodos();
	By username = By.name("txtUsername");
	By password = By.name("txtPassword");
	By btnLogin = By.id("btnLogin");

	@Given("que eu esteja na tela de login")
	public void que_eu_esteja_na_tela_de_login() {
		metodo.abrirNavegador("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	}

	@When("preencher os campos de login")
	public void preencher_os_campos_de_login() {
		metodo.escrever(username, "Admin");
		metodo.escrever(password, "admin123");

	}

	@Then("login realizado com sucesso")
	public void login_realizado_com_sucesso() {
		metodo.clicar(btnLogin);

	}

	@When("preencher o usuario")
	public void preencher_o_usuario() {
		metodo.escrever(username, "Admin");
	}

	@When("preencher a senha invalida")
	public void preencher_a_senha_invalida() {
		metodo.escrever(password, "@123");
		metodo.clicar(btnLogin);
		
	}

	@Then("login nao sera realizado")
	public void login_nao_sera_realizado() {
		System.out.println("------ login não realizado ------");
	}

}
