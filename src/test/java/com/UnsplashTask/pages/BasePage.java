package com.UnsplashTask.pages;

import com.UnsplashTask.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

  @FindBy(xpath = "//li[@class = \"NGvuW\"]")  // class
  public List<WebElement> picTabs;

    @FindBy(xpath = "//*[@class = \"VQW0y Jl9NH\"]") //class
    public List<WebElement> images;

    @FindBy(xpath = "//span[contains(text(),'Download free')]")
    public WebElement downloadIcon;




}
