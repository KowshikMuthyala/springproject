package springproject.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach thecoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		System.out.println(thecoach.getDailyFortune());
		
		System.out.println(thecoach.getDailyworkout());
		
		System.out.println(thecoach.getEmail());
		
		System.out.println(thecoach.getTeam());
		
		context.close();
	}

}
