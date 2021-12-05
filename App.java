package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App
{
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

        WebElement webElement3 = driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[3]/ul/li[4]/a/span"));
        webElement3.click();

        WebElement webElement4 = driver.findElement(By.linkText("Создать проект"));
        webElement4.click();

        WebElement webElement5 = driver.findElement(By.id("crm_project_name-uid-619ae27d69c3e"));
        webElement5.click();
        webElement5.sendKeys("GHDFGSFERERETRT");

        WebElement webElement6 = driver.findElement(By.id("crm_project_businessUnit-uid-619ae27d8e44c"));
        webElement6.click();
        webElement6.sendKeys("Research & Development");

        WebElement webElement7 = driver.findElement(By.id("crm_project_curator-uid-619ae27db5d0f"));
        webElement7.click();
        webElement7.sendKeys("Applanatest1 Applanatest1 Applanatest1");

        WebElement webElement8 = driver.findElement(By.id("crm_project_rp-uid-619ae27dac50a"));
        webElement8.click();
        webElement8.sendKeys("Applanatest1 Applanatest1 Applanatest1");

        WebElement webElement9 = driver.findElement(By.id("crm_project_administrator-uid-619ae27d7f337"));
        webElement9.click();
        webElement9.sendKeys("Applanatest1 Applanatest1 Applanatest1");

        WebElement webElement10 = driver.findElement(By.id("crm_project_manager-uid-619ae27d989ba"));
        webElement10.click();
        webElement10.sendKeys("Applanatest1 Applanatest1 Applanatest1");

        WebElement webElement11 = driver.findElement(By.id("crm_project_configManagement-uid-619ae27d7f720"));
        webElement11.click();
        webElement11.sendKeys("1");

        WebElement webElement12 = driver.findElement(By.id("crm_project_skipSpeedChecks-uid-619ae27d80a64"));
        webElement12.click();

        WebElement webElement13 = driver.findElement(By.xpath("//form[@id='crm_project-uid-619ae27dcc7cf']/div/div/div/div[2]/div/div[4]/button"));
        webElement13.click();

    }
}
