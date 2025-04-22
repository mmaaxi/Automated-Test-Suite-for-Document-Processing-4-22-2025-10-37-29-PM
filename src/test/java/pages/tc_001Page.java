package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {
    private WebDriver driver;

    private By uploadOptionButton = By.id("uploadOptionButton");
    private By singleFileUploadOption = By.id("singleFileOption");
    private By multipleFilesUploadOption = By.id("multipleFilesOption");
    private By singleFileUploadBox = By.id("singleFileUploadBox");
    private By multipleFileUploadBoxes = By.className("multipleFileUploadBox");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }
    
    public void selectUploadOption() {
        driver.findElement(uploadOptionButton).click();
    }

    public boolean isSingleAndMultipleOptionDisplayed() {
        return driver.findElement(singleFileUploadOption).isDisplayed() 
                && driver.findElement(multipleFilesUploadOption).isDisplayed();
    }

    public void chooseSingleFileUpload() {
        driver.findElement(singleFileUploadOption).click();
    }

    public boolean isSingleFileUploadBoxEnabled() {
        return driver.findElement(singleFileUploadBox).isEnabled();
    }

    public void chooseMultipleFilesUpload() {
        driver.findElement(multipleFilesUploadOption).click();
    }

    public boolean areMultipleFileUploadBoxesDisplayed() {
        return !driver.findElements(multipleFileUploadBoxes).isEmpty();
    }
}