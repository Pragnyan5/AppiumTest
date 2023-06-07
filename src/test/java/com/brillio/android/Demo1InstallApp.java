package com.brillio.android;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Demo1InstallApp {
    public static void main(String args[]) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","android");
        desiredCapabilities.setCapability("appium:deviceName","redmi");
        desiredCapabilities.setCapability("appium:app","C:\\Users\\Pragnyan.Dalei\\IdeaProjects\\materials\\khan-academy-7-3-2.apk");

        //
        AppiumDriver driver= new AppiumDriver(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
    }
}
