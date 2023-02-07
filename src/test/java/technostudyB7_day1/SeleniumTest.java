package technostudyB7_day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        //1- browser driver set up
        WebDriverManager.chromedriver().setup();
        //2- create object of ChromeDriver to open the browser
        WebDriver driver = new ChromeDriver();
        //3- go to google page
        driver.get("https://www.google.com");
        System.out.println("title of google.com +"+driver.getTitle());
        System.out.println("url of google.com =" +driver.getCurrentUrl());
        driver.navigate().to("https://www.techno.study");

        String expectTitle = "Join the best coding ";
        String actualTitle = driver.getTitle();

        if (expectTitle.contains(actualTitle)){
            System.out.println("verification is done : PASS");
            System.out.println("actual title = " +actualTitle);
        } else System.out.println("verification is FAILED");
        System.out.println();
    }
}
