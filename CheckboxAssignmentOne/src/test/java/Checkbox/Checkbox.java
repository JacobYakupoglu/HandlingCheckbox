package Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Checkbox
{
    WebDriver driver;

    @BeforeTest
    public void driverFirefox()
    {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }

    @Test(priority = 1)
    public void checkBox()
    {
        driver.findElement(By.cssSelector("input#checkBoxOption1")).click();
        System.out.println(driver.findElement(By.cssSelector("input#checkBoxOption1")).isSelected());
    }

    @Test(priority = 2)
    public void unCheckbox()
    {
        driver.findElement(By.cssSelector("input#checkBoxOption1")).click();
    }

    @Test(priority = 3)
    public void countCheckbox()
    {
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
    }

    @Test(priority = 4)
    public void closeBrowser()
    {
        driver.close();
    }
}
