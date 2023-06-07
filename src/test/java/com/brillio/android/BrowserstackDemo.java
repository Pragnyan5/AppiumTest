package com.brillio.android;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class BrowserstackDemo {
    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "android");
        cap.setCapability("platformVersion", "9.0");
        cap.setCapability("deviceName", "Google Pixel 3");
        cap.setCapability("app", "bs://d98fb3dce14fd79dfd7c9ad96ad2af55766373dd");

        HashMap<String, String> bstackDetails = new HashMap<String, String>();
        bstackDetails.put("projectName", "BrillioAppiumSessionProject");
        bstackDetails.put("buildName", "BrillioAppiumSessionBuild");
        bstackDetails.put("sessionName", "BrillioAppiumSession");
        bstackDetails.put("userName", "pragnyandalei_msB79a");
        bstackDetails.put("accessKey", "DNKxtuxrLvnKJYzyu5ye");

        cap.setCapability("bstack:options", bstackDetails);

        AppiumDriver driver = new AppiumDriver(new URL("http://hub.browserstack.com/wd/hub"), cap);

        System.out.println(driver.getPageSource());

        driver.quit();
    }


}
