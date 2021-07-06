package springproject.com;

public class Football implements Coaching {
	
	
	private Fortuneservice fortune;
	
	
	public Football(Fortuneservice thefortune) {
		fortune = thefortune;
	}
	
	
	@Override
	public String getDailyworkout()  {
		
	return "Run hard 5k";

}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}
}
