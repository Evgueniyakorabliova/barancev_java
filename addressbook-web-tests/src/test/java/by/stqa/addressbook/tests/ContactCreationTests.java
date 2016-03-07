package by.stqa.addressbook.tests;

import by.stqa.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {

        app.getNavigationHelper().gotoContactCreationPage();
        final ContactData contactData = new ContactData("Test", "User", "Company", "Address", "test.user@company.com", "Notes");
        app.getContactHelper().fillContactForm(contactData.getFirstname(), contactData.getLastname(), contactData.getCompany(), contactData.getAddress(), contactData.getEmail(), contactData.getNotes());
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returntoHomePage();
    }


}
