package by.stqa.addressbook.tests;

import by.stqa.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm(new ContactData("Test", "User", "Company", "Address", "test.user@company.com", "Notes", null), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returntoHomePage();

    }
}
