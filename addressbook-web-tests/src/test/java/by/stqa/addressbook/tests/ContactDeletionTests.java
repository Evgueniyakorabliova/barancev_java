package by.stqa.addressbook.tests;

import by.stqa.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
//This test cannot be run on Safari, as The SafariDriver does not support interacting with modal dialogs.
    @Test
    public void testContactDeletion(){
        app.getNavigationHelper().gotoHomePage();
        if (! app.getContactHelper().isThereAContact()){
            app.getNavigationHelper().gotoContactCreationPage();
            app.getContactHelper().createContact(new ContactData("Test2", "User2", "Company2", "Address", "test.user@company.com", "Notes", "Test 1"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().wd.switchTo().alert().accept();
        app.getNavigationHelper().gotoHomePage();

    }
}
