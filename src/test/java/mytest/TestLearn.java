package mytest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

public class TestLearn extends BaseTest
{
    @BeforeMethod
    @Override
    public void setup()
    {
        super.setup();
        System.out.println("--------TestLearn.setup");
    }

    @AfterMethod
    @Override
    public void after()
    {
        super.after();
        System.out.println("--------TestLearn.after");
    }

    @Test(groups = { "Sniff123"}, retryAnalyzer = RetryTest.class)
    public void test1()
    {
        System.out.println("UserName: " + System.getProperty("userName"));
        throw new RuntimeException();
    }

    @Test(groups = { "Sniff123"}, retryAnalyzer = RetryTest.class)
    public void test2()
    {
        System.out.println("in test2");
    }
}
