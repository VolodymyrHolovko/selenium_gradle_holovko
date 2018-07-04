package Workers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class WorkersPageCode {
    WebDriver driver;
    WebDriverWait wait;
    Random random = new Random();
    WorkersElementsLocators worker = new WorkersElementsLocators();
    By workersAddMainButton = By.className(worker.addWorkers);
    By workersName = By.xpath(worker.workersFirstName);
    By workersNameAfterCreate = By.xpath(worker.workersFirstNameAfterCreate);
    By workersLastName = By.xpath(worker.workersLastName);
    By workersLastNameAfterCreate = By.xpath(worker.workerLastNameAfterCreate);
    By workersPosada = By.xpath(worker.workersPosada);
    By workersPosadaAfterCreate = By.xpath(worker.workersPosadaAfterCreate);
    By workersPhone = By.xpath(worker.workersPhone);
    By workersDescriptionAfterCreate = By.xpath(worker.workersDescriptionAfterCreate);
    By workersDescription = By.xpath(worker.workersDescription);
    By workersAddButton = By.xpath(worker.workersAddButton);
    By workersAddButtonAfterCreate = By.xpath(worker.workersAddButtonAfterCreate);
    By workersDeactivateButton = By.xpath(worker.workersDeactivateButton);
    By workersSuccessCreateMessageLocator = By.xpath(worker.workersSuccessMessage);
    By workersDeleteButton = By.xpath(worker.workersDeleteButton);
    By workersExpandInfo = By.xpath(worker.workersExpandInformation);
    By workersExpandInfoAfterCreate = By.xpath(worker.workersExpandInformationAfterLogin);
    By createBookingButton = By.xpath(worker.createBookingButton);
    By deleteWorkersSubmit = By.xpath(worker.deleteWorkersSubmit);

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
        int num = 364 + random.nextInt(4000 - 3666);
        wait.until(ExpectedConditions.presenceOfElementLocated(workersPhone)).sendKeys("671284"+num);
    }

    public void writeDescription(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersDescription)).sendKeys("Працює краще всіх");
    }

    public void addWorkerButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersAddButton)).click();
    }

    public void addWorkerButtonAfterCreate(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersAddButtonAfterCreate)).click();
    }


    public boolean successMessagePresents(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersSuccessCreateMessageLocator));
        return  driver.findElement(workersSuccessCreateMessageLocator).isDisplayed();
    }

    public void deleteWorker(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersDeleteButton)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(deleteWorkersSubmit)).click();
    }

    public void updateFirstName(){
    wait.until(ExpectedConditions.presenceOfElementLocated(workersNameAfterCreate)).clear();
    driver.findElement(workersNameAfterCreate).sendKeys("Максік");
    }

    public void updateLastName(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersLastNameAfterCreate)).clear();
        driver.findElement(workersLastNameAfterCreate).sendKeys("Литковець");
    }

    public void updatePosade(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersPosadaAfterCreate)).clear();
        driver.findElement(workersPosadaAfterCreate).sendKeys("посада");
    }

    public void updateDescription(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersDescriptionAfterCreate)).clear();
        driver.findElement(workersDescriptionAfterCreate).sendKeys("курча");
    }

    public String getFirstName (){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersNameAfterCreate));
        return  driver.findElement(workersNameAfterCreate).getAttribute("value");
    }

    public String getLastName (){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersLastNameAfterCreate));
        return  driver.findElement(workersLastNameAfterCreate).getAttribute("value");
    }

    public String getPosada (){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersPosadaAfterCreate));
        return  driver.findElement(workersPosadaAfterCreate).getAttribute("value");
    }

    public String getPhone (){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersPhone));
        return  driver.findElement(workersPhone).getText();
    }

    public String getDescription (){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersDescriptionAfterCreate));
        return  driver.findElement(workersDescriptionAfterCreate).getAttribute("value");
    }

    public void expandWorkerInfo(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersExpandInfo)).click();
    }

    public void expandWorkerInfoAfterCreate(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersExpandInfoAfterCreate)).click();
    }

}
