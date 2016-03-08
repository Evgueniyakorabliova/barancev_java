package by.stqa.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
//This test cannot be run on Safari, as The SafariDriver does not support interacting with modal dialogs.
    @Test
    public void testContactDeletion(){
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().wd.switchTo().alert().accept();


    }
}
