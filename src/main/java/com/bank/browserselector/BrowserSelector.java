package com.bank.browserselector;

import com.bank.basepage.BasePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelector extends BasePage {

    //logging the reports for the Browser into log4j logs.
    private static final Logger log = Logger.getLogger(BrowserSelector.class.getName());

    String projectPath = System.getProperty("user.dir");

    // browser choosing and logging browser launch and the log4j reports
    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
            log.info("Launching Chrome Browser");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");
            log.info("Launching Chrome Browser");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", projectPath + "/drivers/IEDriverServer.exe");
            log.info("Launching Chrome Browser");
            driver = new InternetExplorerDriver();
        } else {
            log.info("Browser Not Launched");
            System.out.println("Wrong browser name");
        } }

}
