import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\loadrunner\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://Gmail.com");

	}

}
