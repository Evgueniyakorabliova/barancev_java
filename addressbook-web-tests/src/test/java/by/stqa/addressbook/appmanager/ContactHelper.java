package by.stqa.addressbook.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void returntoHomePage() {
        click(By.linkText("home page"));
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(String firstname, String lastname, String company, String address, String email, String notes) {
        type(By.name("firstname"), firstname);
        type(By.name("lastname"), lastname);
        type(By.name("company"), company);
        type(By.name("address"), address);
        type(By.name("email"), email);
        type(By.name("notes"), notes);

    }
}
