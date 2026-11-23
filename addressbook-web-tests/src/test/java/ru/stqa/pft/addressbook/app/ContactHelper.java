package ru.stqa.pft.addressbook.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData) {
        typeName(By.name("firstname"), contactData.getFirstname());
        typeName(By.name("middlename"), contactData.getMiddlename());
        typeName(By.name("lastname"), contactData.getLastname());
        typeName(By.name("nickname"), contactData.getNick());
        typeName(By.name("company"), contactData.getCompany());
        typeName(By.name("address"), contactData.getAddress());
        typeName(By.name("home"), contactData.getNumber());
        typeName(By.name("email"), contactData.getEmail());
        click(By.name("new_group"));
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText("test1");
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void typeName(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void goToCreation() {
        click(By.linkText("add new"));
    }

    public void enterContact() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }
}
