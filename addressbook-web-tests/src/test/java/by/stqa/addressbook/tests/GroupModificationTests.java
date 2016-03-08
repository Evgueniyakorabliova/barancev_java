package by.stqa.addressbook.tests;

import by.stqa.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("Test 1", "test 2", "test 3"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returntoGroupPage();

    }
}
