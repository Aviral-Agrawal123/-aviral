public class Starter {
	public static void main(String[] args)
		
	{
		int i=0;
		Details d=new Details();
		System.out.println("Enter 1 for create player\n Enter 2 for update detail \n Enter 3 for remove player \n Enter 4 for fetch details \n Enter 5 for exit");
		while(i>0&&i<6)
		{
			if(i==1)
			{
				d.create();
			}
			if(i==2)
			{
				d.update();
			}
			if(i==3)
			{
				d.deleting();
			}
			if(i==4)
			{
				d.fetch();
			}
		}
	}
}
