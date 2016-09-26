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

        String email = emailGenerator.generate();
        System.out.println(email);

        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@yoursite.com");
    }
}
