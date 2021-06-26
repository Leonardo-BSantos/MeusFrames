package meuframe.metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	/**
	 * Abrir o navegador Chrome
	 * 
	 * @author leo_h
	 * @param site
	 */
	public void abrirNavegador(String site) {

		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println("------ error ao abrir navegador ------" + e.getMessage());

		}
	}

	/**
	 * Metodo escrever no elemento
	 * 
	 * @author leo_h
	 * @param escrever o conteudo para consulta
	 */
	public void escrever(By elemento, String texto) {

		try {

			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			System.out.println("----- error ao tentar escrever no elemento -----" + e.getStackTrace());
		}
	}

	/**
	 * Metodo clicar no elemento
	 * 
	 * @author leo_h
	 * @param clicar no elemento
	 */
	public void clicar(By elemento) {
		try {

			driver.findElement(elemento).click();

		} catch (Exception e) {

			System.out.println("----- error ao tentar Clicar no elemento -----" + e.getStackTrace());
		}
	}

}
