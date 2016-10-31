package mytest;

import org.testng.annotations.Test;

public class TestAnother extends BaseTest
{
    @Test(groups = { "Sniff22"}, retryAnalyzer = RetryTest.class)
    public void test3()
    {
        System.out.println("in test3");
        throw new RuntimeException("exception in test 3!!");
    }
}
