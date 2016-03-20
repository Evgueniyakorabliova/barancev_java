package by.stqa.addressbook.tests;

import by.stqa.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {

        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("Test 1", null, null));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returntoGroupPage();
    }

}
