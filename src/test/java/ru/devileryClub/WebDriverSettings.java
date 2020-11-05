package ru.devileryClub;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver;

    @Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/info/Desktop/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("test start");
    }

    @After
    public void Close() {
        System.out.println("test close");
        driver. quit();
    }

}
