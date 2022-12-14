package configApp;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@Scope(value="prototype")
public class Car implements Vehicle
{
	@Autowired
	public  AutoWiredIf example;
	private static final Logger logger=LogManager.getLogger(Car.class);
	public void drive()
	{
		// TODO Auto-generated method stub
		System.out.println("Hi I am driving  a Car");
		logger.debug("Debugging the Code!!!");
		example.fun();
		//example.examFun();  --> It will not work since it is Example class method and the reference is of 
		                          // AutoWiredIf interface which includes only fun method signature.
	}
	 
	
}
