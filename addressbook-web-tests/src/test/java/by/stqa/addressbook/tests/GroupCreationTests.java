package by.stqa.addressbook.tests;

import by.stqa.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {

        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("Test 1", "test 2", "test 3"));
        app.submitGroupCreation();
        app.returntoGroupPage();
    }

}
