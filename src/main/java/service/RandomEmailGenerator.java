package service;

import org.springframework.stereotype.Service;

/**
 * Created by peng on 9/26/16.
 */
@Service
public class RandomEmailGenerator implements EmailGenerator
{
    public String generate()
    {
        return "test@test.com";
    }
}
