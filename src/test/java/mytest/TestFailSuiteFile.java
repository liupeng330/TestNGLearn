package mytest;

import org.testng.annotations.Test;

public class TestFailSuiteFile extends BaseTest
{
    @Test(groups = { "group1"})
    public void test1()
    {

    }

    @Test(groups = { "group1"})
    public void test2()
    {
        throw new RuntimeException();
    }

    @Test(groups = { "group1"})
    public void test3()
    {
        throw new RuntimeException();
    }

    @Test(groups = { "group2"})
    public void test4()
    {
        throw new RuntimeException();
    }
}
