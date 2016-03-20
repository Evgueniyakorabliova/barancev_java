package by.stqa.addressbook.tests;

import by.stqa.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getNavigationHelper().gotoHomePage();
        if (! app.getContactHelper().isThereAContact()){
            app.getNavigationHelper().gotoContactCreationPage();
            app.getContactHelper().createContact(new ContactData("Test", "User", "Company", "Address", "test.user@company.com", "Notes", "Test 1"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm(new ContactData("Test", "User", "Company", "Address", "test.user@company.com", "Notes", null), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returntoHomePage();

    }
}
