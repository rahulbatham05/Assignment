package assignment2;

public class Trainer {
	
	String name;
	String department;
	String email;
	int id;

	public static void main(String[] args) {
		Trainer trainer1=new Trainer("Mukesh", "Testing", "mukesh@gmail.com", 1);
		Trainer trainer2=new Trainer("Hitesh", "Dev", "Hitest@gmail.com", 2);
		Trainer trainer3=new Trainer("Mukesh", "Devops", "mukesh@gmail.com", 3);
		
		trainer1.Selenium();
		trainer2.WebDevelpoment();
		trainer3.DevOps();
	}
	
	public void Selenium()
	{
		System.out.println(name+ " Trainer 1 teaches Selenium");
	}
	
	public void WebDevelpoment()
	{
		System.out.println(name+" Trainer 2 teaches Web Develpoment");
	}
	
	public void DevOps()
	{
		System.out.println(name +" Trainer 3 teaches Devops");
	}
	
	public Trainer (String TName, String TDepartment, String TEmail, int TId)
	{
		name=TName;
		department=TDepartment;
		email=TEmail;
		id=TId;
		
	}
	
}
