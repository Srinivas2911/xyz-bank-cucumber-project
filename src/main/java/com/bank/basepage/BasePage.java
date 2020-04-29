package com.bank.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public static WebDriver driver;

    // create Constructor and give the path for the log4J properties file
    // and initialising web Elements

public BasePage(){

    PageFactory.initElements(driver, this);

    // configuring for Log4j properties
    PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/test/java/com/bank/resources/properties/file/log4j.properties");
}

}
