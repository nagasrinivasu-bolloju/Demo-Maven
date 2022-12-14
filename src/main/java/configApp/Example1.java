package configApp;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
public class Example1 implements AutoWiredIf
{
	public void fun()
	{
		System.out.println("Example1- implemented method!");
	}
	public void examFun()
	{
		System.out.println("Example1 method!!");
	}
}
