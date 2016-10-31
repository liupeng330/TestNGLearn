package mytest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer
{
    private final int MAX_RETRY_TIMES = Integer.parseInt(Environment.INSTANCE.getValueByEnv("retry"));
    private int currentTryTimes = 1;

    @Override
    public boolean retry(ITestResult result)
    {
        if (!result.isSuccess())
        {
            System.out.println(result.getMethod().getMethodName() + " get failed and the reason is \"" + result.getThrowable().getMessage() + "\".");

            if (currentTryTimes <= MAX_RETRY_TIMES)
            {
                System.out.println("Method \""
                        + result.getMethod().getMethodName()
                        + "\" is failed , start to retry, has run " + currentTryTimes + " times");
                currentTryTimes++;
                return true;
            }
        }
        return false;
    }

}
