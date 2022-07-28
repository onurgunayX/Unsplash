package com.UnsplashTask.stepDefinitions;

import com.UnsplashTask.pages.ExplorePage;
import com.UnsplashTask.utilities.BrowserUtils;
import com.UnsplashTask.utilities.ConfigurationReader;
import com.UnsplashTask.utilities.Driver;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class downloadPicStepDefs {



    @Given("the user goes to main page")
    public void the_user_goes_to_main_page() {
        Driver.get().get(ConfigurationReader.get("url")); // goes to main page
    }



    @Given("the user clicks on {string} from dashboard and download valid 20th image")
    public void the_user_clicks_on_from_dashboard_and_download_valid_20th_image(String string) {

        ExplorePage explorePage=new ExplorePage();
        BrowserUtils.waitFor(2);

        System.out.println("explorePage.picTabs.size() = " + explorePage.picTabs.size());
        for (int i = 0; i < explorePage.picTabs.size(); i++) {
            (explorePage.picTabs.get(i)).click();  // create page object to reach web element


            BrowserUtils.waitFor(2);

            explorePage.images.get(19).click(); // goes to 20 th image



            System.out.println("Image Height = " + explorePage.images.get(19).getSize().getHeight()); // writes sizes of images
            System.out.println("Image Width = " + explorePage.images.get(19).getSize().getWidth());

        /* //I tried to find the src  from outer html and also i tried js executer Unfortunately   ı can not reach original size of pics
            System.out.println("outerHTML"+" = " + explorePage.images.get(19).getAttribute("src"));


          try {
              URLConnection urlConnection =new URL(explorePage.images.get(19).getAttribute("outerHTML")).openConnection();
               int size = urlConnection.getContentLength();
               System.out.println("size = " + size);
            } catch (IOException e) {
                e.printStackTrace();
            }


            */

            if (explorePage.images.get(19).getSize().getHeight() >=0 && explorePage.images.get(19).getSize().getWidth()>=0){
                explorePage.downloadIcon.click();
                BrowserUtils.waitFor(5);
            }
            Driver.get().get(ConfigurationReader.get("url"));
        }


    }




}
