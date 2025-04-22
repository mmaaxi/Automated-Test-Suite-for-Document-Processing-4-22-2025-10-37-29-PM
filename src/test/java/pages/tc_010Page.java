package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {

    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By processButton = By.id("processButton");
    By generateSlipButton = By.id("generateSlipButton");
    By documentHistorySection = By.id("documentHistory");
    By extractedDataSection = By.id("extractedData");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadDocuments() {
        WebElement uploadBtn = driver.findElement(uploadButton);
        uploadBtn.click();
        // Additional logic for file upload
    }

    public void processDocuments() {
        WebElement processBtn = driver.findElement(processButton);
        processBtn.click();
    }

    public void generateSlipDeSalida() {
        WebElement generateSlipBtn = driver.findElement(generateSlipButton);
        generateSlipBtn.click();
    }

    public boolean isDocumentInHistory() {
        WebElement historySection = driver.findElement(documentHistorySection);
        return historySection.isDisplayed() && historySection.getText().contains("Uploaded Document");
    }

    public boolean isDataExtractedInHistory() {
        WebElement dataSection = driver.findElement(extractedDataSection);
        return dataSection.isDisplayed() && dataSection.getText().contains("Extracted Data");
    }
}