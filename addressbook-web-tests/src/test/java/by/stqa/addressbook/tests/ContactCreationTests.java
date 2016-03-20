package by.stqa.addressbook.tests;

import by.stqa.addressbook.model.ContactData;
import by.stqa.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoContactCreationPage();
        app.getContactHelper().createContact(new ContactData("Test", "User", "Company", "Address", "test.user@company.com", "Notes", "Test 1"));
    }


}
