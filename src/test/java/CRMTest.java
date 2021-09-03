
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CRMTest extends Settings{


    @Test
    public void crm1() {

        {
            WebElement element = driver.findElement(By.xpath("//header/div[@id='main-menu']/ul[1]/li[3]/a[1]/span[1]"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.xpath("//span[contains(.,'Мои проекты')]")).click();
        driver.findElement(By.linkText("Создать проект")).click();
        driver.findElement(By.name("crm_project[name]")).click();
        driver.findElement(By.name("crm_project[name]")).sendKeys("OfisQ");
        driver.findElement(By.xpath("//span[contains(text(),'Укажите организацию')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'1234')]")).click();
        driver.findElement(By.name("crm_project[businessUnit]")).click();

        WebElement businessUnit = driver.findElement(By.name("crm_project[businessUnit]"));
        businessUnit.findElement(By.xpath("//option[. = 'Research & Development']")).click();

        WebElement curator = driver.findElement(By.name("crm_project[curator]"));
        curator.findElement(By.xpath("//option[. = 'Амелин Владимир']")).click();

        WebElement rp = driver.findElement(By.name("crm_project[rp]"));
        rp.findElement(By.xpath("//option[. = 'Авласёнок Денис']")).click();

        WebElement administrator = driver.findElement(By.name("crm_project[administrator]"));
        administrator.findElement(By.xpath("//option[. = 'Исаева Анастасия']")).click();

        WebElement selectElement = driver.findElement(By.name("crm_project[manager]"));
        Select selectObject = new Select(selectElement);
        selectObject.selectByVisibleText("Амелин Владимир");

        WebElement contact = driver.findElement(By.xpath("//select[@name=\"crm_project[contactMain]\"]"));
        Select selectContact = new Select(contact);
        selectContact.selectByVisibleText("Соболев Михаил");
        driver.findElement(By.xpath("//button[contains(text(),'Сохранить и закрыть')]")).click();
    }
    @Test
    public void crm2() {
        WebElement element = driver.findElement(By.xpath("//header/div[@id='main-menu']/ul[1]/li[1]/a[1]"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();

        driver.findElement(By.xpath("//span[contains(text(),'Контактные лица')]")).click();
        driver.findElement(By.linkText("Создать контактное лицо")).click();
        driver.findElement(By.name("crm_contact[lastName]")).sendKeys("Bron");
        driver.findElement(By.name("crm_contact[firstName]")).sendKeys("Anna");
        driver.findElement(By.xpath("//span[contains(text(),'Укажите организацию')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'1234')]")).click();
        driver.findElement(By.name("crm_contact[jobTitle]")).sendKeys("Manager");
        driver.findElement(By.xpath("//button[contains(text(),'Сохранить и закрыть')]")).click();
    }
}
