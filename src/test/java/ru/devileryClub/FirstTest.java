package ru.devileryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSettings {

    @Test
    public void FirstTest() {
        driver.get("https://www.delivery-club.ru/kzn");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Доставка еды из ресторанов Казани от 45 минут! Delivery Club"));
    }

    @Test
    public void FirstTest2() {
        driver.get("https://www.delivery-club.ru/kzn");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Доставка еды из ресторанов Казани от 45 минут! Delivery Club"));
    }
}
