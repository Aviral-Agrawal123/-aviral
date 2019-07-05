import java.util.HashMap;
import java.util.Scanner;

public class Details extends Player{
	HashMap<String,Player> m;
	Scanner s;
	Details()
	{
		s=new Scanner(System.in);
	}
	@Override
	public void create() {
		m=new HashMap<String,Player>();
		String name;
		String Skill;
		String country;
		System.out.println("Enter the name of player");
		name=s.nextLine();
		this.setPlayerName(name);
		System.out.println("Enter the skill of player");
		Skill=s.nextLine();
		this.setSkill(Skill);
		System.out.println("Enter the name of country");
		country=s.nextLine();
		m.put(country,this);
	}

	@Override
	public void update() 
	{
		String country;
		System.out.println("enter the country name");
		country=s.nextLine();
		for(String s1:m.keySet())
		{
			if(s1.contentEquals(country))
			{
		System.out.println("Want to change name  press 1 or skill  press 2 ");
		int i=s.nextInt();
		if(i==1)
		{
			System.out.println("Enter the name to update");
			String name=s.nextLine();
			m.get(country).setPlayerName(name);
		}
		else if(i==2)
		{
			System.out.println("Enter the skill to update");
			String skill=s.nextLine();
			m.get(country).setSkill(skill);
		}
		else 
		{
			System.out.println("Invalid Input");
		}
	}
			else
			{
				System.out.println("Invaild input");
			}
	}
	}
	@Override
	public void deleting() {
		String country;
		System.out.println("enter the country name of player to remove");
		country=s.nextLine();
		m.remove(country);	
	}

	@Override
	public void fetch() {
		String country;
		System.out.println("enter country name of player to fetch details");
		country=s.nextLine();
		if(m.containsKey(country))
		{
		System.out.println("Details of player");
		System.out.println("Name - "+m.get(country).getPlayerName());
		System.out.println("Skill - "+m.get(country).getSkill());
	}
		else
		{
			System.out.println("Invalid key");
		}

}
	
}
