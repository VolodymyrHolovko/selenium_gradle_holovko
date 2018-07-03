package Workers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkersPageCode {
    WebDriver driver;
    WebDriverWait wait;
    WorkersElementsLocators worker = new WorkersElementsLocators();
    By workersAddMainButton = By.className(worker.addWorkers);
    By workersName = By.xpath(worker.workersFirstName);
    By workersLastName = By.className(worker.workersLastName);
    By workersPosada = By.xpath(worker.workersPosada);
    By workersPhone = By.xpath(worker.workersPhone);
    By workersDescription = By.className(worker.workersDescription);
    By workersAddButton = By.xpath(worker.workersAddButton);

    public WorkersPageCode (WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void pressAddMainButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersAddMainButton)).click();
    }

    public void writeFirstName(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersName)).click();
    }

    public void writelastName(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersLastName)).click();
    }

    public void writePosada(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersPosada)).click();
    }

    public void writePhone(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersPhone)).click();
    }

    public void writeDescription(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersDescription)).click();
    }

    public void addWorkerButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersAddButton)).click();
    }
}
