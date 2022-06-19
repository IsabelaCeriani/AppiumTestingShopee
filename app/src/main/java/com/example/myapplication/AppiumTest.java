package com.example.myapplication;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;

public class AppiumTest {

         AppiumDriver driver;



        public  void startSession() throws MalformedURLException {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("deviceName", "SM G780F");
            capabilities.setCapability("udid", "RF8N92PR4PJ");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "12");
//            capabilities.setCapability("appPackage", "com.android.chrome");
//            capabilities.setCapability("appActivity", "com.google.android.gms.common.api.GoogleApiActivity");
            capabilities.setCapability("appPackage", "com.shopee.ar");
            capabilities.setCapability("appActivity", "com.shopee.app.ui.home.HomeActivity");

            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            System.out.println("Appium driver initialized");

        }

        public void test1(){
//            driver.findElement(By.e)
        }

}
