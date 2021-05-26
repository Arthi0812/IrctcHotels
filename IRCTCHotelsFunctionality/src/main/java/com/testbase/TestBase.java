package com.testbase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


 

public class TestBase {
    
    public static WebDriver driver;
    public static Properties prop;
    
    public TestBase() {
    
        try {
            prop=new Properties();
        FileInputStream file=new FileInputStream("C:\\Users\\Magizhan\\eclipse-workspace\\IRCTCHotelsFunctionality\\src\\test\\resources\\config\\config.properties");
            
                prop.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
                e.printStackTrace();
        
        
        }
}
    public void initialization() {
        String browserName=prop.getProperty("browser");
        
        if(browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Magizhan\\Downloads\\geckodriver-v0.27.0-win64.exe\\geckodriver.exe");
            driver=new FirefoxDriver();
        }
        else if(browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Magizhan\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver=new ChromeDriver();
        }
     
        
        driver.manage().window().maximize();
    //    driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));   
    }
    
    public void failed(String testMethodName){
        File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           try {
            FileUtils.copyFile(srcFile,new File("C:\\Users\\Magizhan\\eclipse-workspace\\IRCTCHotelsFunctionality\\Screenshots\\ "+testMethodName+"_"+".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
           
    }
}