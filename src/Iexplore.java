import org.openqa.selenium.ie.InternetExplorerDriver;


public class Iexplore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\loadrunner\\Downloads\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("Http://Facebook.com");

	}

}
