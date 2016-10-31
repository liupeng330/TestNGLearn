package mytest;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest
{
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("--------BaseTest.beforeClass");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("--------BaseTest.afterClass");
    }

    @BeforeMethod
    public void setup()
    {
        System.out.println("--------BaseTest.setup");
    }

    @AfterMethod
    public void after()
    {
        System.out.println("--------BaseTest.after");
    }
}
