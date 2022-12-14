package configApp;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString(doNotUseGetters=true)
public class Example2 //implements AutoWiredIf
{
	public void fun()
	{
		System.out.println("Example 2 method!!");
	}
}
