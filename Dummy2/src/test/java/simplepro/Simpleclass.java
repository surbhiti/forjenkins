package simplepro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Simpleclass {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("http://localhost:8888");

	}

}
