package Workers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkersPageCode {
    WebDriver driver;
    WebDriverWait wait;
    WorkersElementsLocators worker = new WorkersElementsLocators();
    By workersAddMainButton = By.className(worker.addWorkers);
    By workersName = By.xpath(worker.workersFirstName);
    By workersLastName = By.xpath(worker.workersLastName);
    By workersPosada = By.xpath(worker.workersPosada);
    By workersPhone = By.xpath(worker.workersPhone);
    By workersDescription = By.xpath(worker.workersDescription);
    By workersAddButton = By.xpath(worker.workersAddButton);
    By workersDeactivateButton = By.xpath(worker.workersDeactivateButton);
    By workersSuccessCreateMessageLocator = By.xpath(worker.workersSuccessMessage);
    By workersSuccessDeleteMessageLocator = By.xpath(worker.workersSuccessDeleteMessage);
    By workersDeleteButton = By.xpath(worker.workersDeleteButton);
    By workersExpandInfo = By.xpath(worker.workersExpandInformation);
    By createBookingButton = By.xpath(worker.createBookingButton);

    public WorkersPageCode (WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void makeHoverAtElement(){
        wait.until(ExpectedConditions.presenceOfElementLocated(createBookingButton));
        WebElement element = driver.findElement(createBookingButton);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }

    public void pressAddMainButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersAddMainButton)).click();
    }

    public void writeFirstName(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersName)).sendKeys("Aтестовий");
    }

    public void writelastName(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersLastName)).sendKeys("целафан");
    }

    public void writePosada(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersPosada)).sendKeys("виносить");
    }

    public void writePhone(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersPhone)).sendKeys("671285351");
    }

    public void writeDescription(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersDescription)).sendKeys("Працює краще всіх");
    }

    public void addWorkerButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersAddButton)).click();
    }

    public boolean successMessagePresents(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersSuccessCreateMessageLocator));
        return  driver.findElement(workersSuccessCreateMessageLocator).isDisplayed();
    }

    public void deleteWorker(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersDeleteButton)).click();
    }

    public String getFirstName (){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersName));
        return  driver.findElement(workersName).getText();
    }

    public String getLastName (){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersLastName));
        return  driver.findElement(workersLastName).getText();
    }

    public String getPosada (){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersPosada));
        return  driver.findElement(workersPosada).getText();
    }

    public String getPhone (){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersPhone));
        return  driver.findElement(workersPhone).getText();
    }

    public String getDescription (){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersDescription));
        return  driver.findElement(workersDescription).getText();
    }

    public void expandWorkerInfo(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersExpandInfo)).click();
    }
}
