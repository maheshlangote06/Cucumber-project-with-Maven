package TestNg;

import org.testng.annotations.Test;


public class TestNg {

    @Test(priority = 1)
    public void dashboardTest() {
        System.out.println("Priority 1");
    }

    @Test(priority = -1)
    public void initializeEnvironmentTest() {
        System.out.println("Priority 2");
    }

    @Test(priority = 0)
    public void loginTest() {
        System.out.println("Priority 3");
    }

    @Test
    public void logoutTest() { // Default priority 0
        System.out.println("Logout Test executed (alphabetical order tie-break with loginTest)");
    }
}
