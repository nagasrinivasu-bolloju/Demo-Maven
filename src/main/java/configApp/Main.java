package configApp;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	private static final Logger logger = LogManager.getLogger(Main.class);
	public static void main(String[] args)
	{
		BasicConfigurator.configure();  
		logger.info("Hello world");  
		logger.info("getting bean for car!!");  
		ApplicationContext context=new ClassPathXmlApplicationContext("springBeans.xml");
		Car obj=(Car)context.getBean("car"); 
		obj.drive();
		obj.example.fun();
	}

}
