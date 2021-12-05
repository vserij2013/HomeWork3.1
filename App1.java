package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App1 {
    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://crm.geekbrains.space");

        WebElement webElement = driver.findElement(By.id("prependedInput"));
        webElement.click();
        webElement.sendKeys("Applanatest1");

        WebElement webElement1 = driver.findElement(By.id("prependedInput2"));
        webElement1.click();
        webElement1.sendKeys("Student2020!");

        WebElement webElement2 = driver.findElement(By.id("_submit"));
        webElement2.click();

        WebElement webElement3 = driver.findElement(By.xpath("//div[@id='main-menu']/ul/li/ul/li[4]/a/span"));
        webElement3.click();

        WebElement webElement4 = driver.findElement(By.linkText("Создать контактное лицо"));
        webElement4.click();

        WebElement webElement5 = driver.findElement(By.id("crm_contact_lastName-uid-619ae454a9b3e"));
        webElement5.click();
        webElement5.sendKeys("4455233532434343");

        WebElement webElement6 = driver.findElement(By.id("crm_contact_firstName-uid-619ae454a9aa1"));
        webElement6.click();
        webElement6.sendKeys("35446354534324343");

        WebElement webElement7 = driver.findElement(By.id("crm_contact_middleName-uid-619ae454a9bb4"));
        webElement7.click();
        webElement7.sendKeys("456565354546452434");

        WebElement webElement8 = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/select[2]"));
        webElement8.click();

        WebElement webElement9 = driver.findElement(By.linkText("1"));
        webElement9.click();

        WebElement webElement10 = driver.findElement(By.id("crm_contact_birthdayRemindBefore-uid-619ae454afa12"));
        webElement10.click();

        WebElement webElement11 = driver.findElement(By.id("crm_contact_jobTitle-uid-619ae454a9c1f"));
        webElement11.click();
        webElement11.sendKeys("352554543354533");

        WebElement webElement12 = driver.findElement(By.xpath("//form[@id='crm_contact-uid-619ae454b416c']/div/div/div/div[2]/div/div[4]/button"));
        webElement12.click();

    }
}
