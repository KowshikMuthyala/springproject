package springproject.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springs {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coaching coaching = context.getBean("myCoach", Coaching.class);
		
		System.out.println(coaching.getDailyworkout());
		
		System.out.println(coaching.getDailyFortune());
		
		context.close();
		
	}

}
