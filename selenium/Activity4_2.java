package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity4_2 {

    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new ChromeDriver();

        //And now use this to visit the website
        driver.get("https://www.training-support.net/selenium/simple-form");

        //Check the title of the page
        String title = driver.getTitle();
        //Print the title of the page
        System.out.println("Page title is: " + title);

        //Find the "Get Started!" link and click it
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Saravanan");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Uthirapathy");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Saravanan@gmail.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");

        driver.findElement(By.xpath("//input[@value='submit']")).click();
        //Close the browser
        driver.close();

    }

}
