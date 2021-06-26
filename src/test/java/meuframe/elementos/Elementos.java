package meuframe.elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By username = By.id("txtUsername");
	private By password = By.id("txtPassword");
	private By btnLogin = By.id("btnLogin");

	public By getUsername() {

		return username;

	}

	public By getPassword() {

		return password;

	}

	public By getBtnLogin() {

		return btnLogin;

	}
}
