package springproject.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext  con = 
				new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");
		
		Coaching thecoach = con.getBean("myCoach",Coaching.class);
		Coaching alpha = con.getBean("myCoach",Coaching.class);
		
		boolean	result = (thecoach == alpha );
		
		System.out.println("If both the obj belong to same :" +result);
		
		System.out.println("Memory of thecoach" +thecoach );
		
		System.out.println("Memory of alpha" +alpha );
		
		con.close();
	}

}
