import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Cricketer;

public class TraditionalDLooklupTest {

	public static void main(String[] args) {

//		creating IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");

//		creating Target bean class object
		Cricketer cricket = ctx.getBean("cricket", Cricketer.class);
		System.out.println("..................................................");

//		invoking method of target class
		cricket.bowling();
		System.out.println("....................................................");
		cricket.fielding();
		System.out.println("....................................................");
		cricket.batting();

//         closing ApplicationContext container
		((AbstractApplicationContext) ctx).close();

	}

}
