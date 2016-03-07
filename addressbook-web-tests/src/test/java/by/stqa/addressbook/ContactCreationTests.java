package by.stqa.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {

        gotoContactCreationPage();
        fillContactForm(new ContactData("Test", "User", "Company", "Address", "test.user@company.com", "Notes"));
        submitContactCreation();
        returntoHomePage();
    }


}
