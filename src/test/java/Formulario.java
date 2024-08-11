import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Formulario {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("star-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/");
       //driver.quit();

    }
}
