package springproject.com;

public class CricketCoach implements Coaching {

	
	private Fortuneservice fortuneService;
	private String Email;
	private String Team;
	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		System.out.println("Calling Email-set");
		Email = email;
	}


	public String getTeam() {
		return Team;
	}


	public void setTeam(String team) {
		System.out.println("Calling Team-set");
		Team = team;
	}


	public CricketCoach() {
		System.out.println("No -Arg Const");
	}


	public void setFortuneService(Fortuneservice fortuneService) {
		this.fortuneService = fortuneService;
	}




	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "Practice bowling for 20min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
