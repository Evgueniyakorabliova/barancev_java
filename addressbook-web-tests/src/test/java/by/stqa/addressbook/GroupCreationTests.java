package by.stqa.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {

        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("Test 1", "test 2", "test 3"));
        submitGroupCreation();
        returntoGroupPage();
    }

}
