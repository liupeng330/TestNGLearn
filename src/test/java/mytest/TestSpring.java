package mytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.SystemProfileValueSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import service.EmailGenerator;

/**
 * Created by peng on 9/26/16.
 */
@Test
@ContextConfiguration(locations = { "classpath:spring-test-config.xml" })
public class TestSpring extends AbstractTestNGSpringContextTests
{
    @Autowired
    EmailGenerator emailGenerator;

    SoftAssert softAssert = new SoftAssert();

    @Test
    void testEmailGenerator()
    {
    	System.out.println("test start...");

        String email = emailGenerator.generate();
        System.out.println(email);

        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@yoursite.com");
    }

    @Test (groups = { "Sniff", "Regression" })
    public void validAuthenticationTest(){
        System.out.println(" Sniff + Regression" + System.getProperty("environment"));
        softAssert.assertSame("aaa", "bbb", "test message 111 222");
        softAssert.assertSame("222", "111", "test messagekjsdkfjsf");
        System.out.println("Test is still running");
        softAssert.assertAll();
    }

    @Test (groups = { "Sniff"}, retryAnalyzer = RetryTest.class)
    public void notValidAuthenticationTest(){
        System.out.println("UserName: " + System.getProperty("userName"));
    }

    @Test (groups = { "Sniff2"})
    public void notValidAuthenticationTest2(){
        System.out.println("UserName2: " + System.getProperty("userName"));
    }
}
