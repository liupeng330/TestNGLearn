package mytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;
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
    }

    @Test (groups = { "Sniff"})
    public void notValidAuthenticationTest(){
        System.out.println("UserName: " + System.getProperty("userName"));
    }
}
