package by.stqa.addressbook.tests;

import by.stqa.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {

        app.gotoContactCreationPage();
        app.fillContactForm(new ContactData("Test", "User", "Company", "Address", "test.user@company.com", "Notes"));
        app.submitContactCreation();
        app.returntoHomePage();
    }


}
