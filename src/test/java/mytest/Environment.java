package mytest;

import java.io.IOException;
import java.util.Properties;

public class Environment {
	private static final String ENV_FILE_NAME = "environment.properties";
	private Properties properties = null;
	private String env = null;
	private String stack = null;

	private static Environment inner = null;

	private Environment() {
		if (null == properties) {
			try {
				properties = new Properties();
				properties.load(Thread.currentThread().getClass()
						.getResourceAsStream("/" + ENV_FILE_NAME));
				System.out.println("proop" + properties);
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			env = properties.getProperty("env");
			stack = properties.getProperty("stack");
		}
	}
	private static Environment getEnvironment() {
		if (null == inner) {
			inner = new Environment();
		}
		return inner;
	}
	public static Environment INSTANCE = getEnvironment();

	public String getValueByDefault(String key){
		return properties.getProperty(key);
	}
	public String getValueByEnv(String key) {
		return properties.getProperty(key + "." + env);
	}
	public String getValueByStack(String key) {
		return properties.getProperty(key + "." + env + "." + stack);
	}
}
