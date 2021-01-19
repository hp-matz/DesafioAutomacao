package suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Web {
	public static WebDriver createDriver() {
		
		//abrindo navegador
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SempreIT\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//abrir o site
		driver.get("http:\\www.amazon.com.br");

		return driver;
	}
}
