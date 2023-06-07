package com.brillio.android;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Demo2 {
    public static void main(String args[]) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","android");
        desiredCapabilities.setCapability("appium:deviceName","redmi");
        desiredCapabilities.setCapability("appium:app","C:\\Users\\Pragnyan.Dalei\\IdeaProjects\\materials\\khan-academy-7-3-2.apk");

        AppiumDriver driver= new AppiumDriver(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Dismiss']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Sign in']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Sign in']")).click();

        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Enter an e-mail address or username']"))
                .sendKeys("john@gmail.com");
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Password']")).sendKeys("welcome123");
        driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Sign in'])[2]")).click();
        String text= driver.findElement(AppiumBy.xpath("//*[contains(@text,'issue')]")).getText();
        System.out.println(text);


        //driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Continue with Google']")).click();
       // driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Continue with Facebook']")).click();
        //driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Sign up with email']")).click();

        driver.quit();
}}

