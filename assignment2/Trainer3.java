package assignment2;

public class Trainer3 {
	
	String name;
	String department;
	String email;
	int id;

	public static void main(String[] args) {
		Trainer3 [] trainer=new Trainer3 [3];
		trainer[0]=new Trainer3("Mukesh", "Testing", "mukesh@gmail.com", 1);
		trainer[1]=new Trainer3("Hitesh", "Dev", "Hitest@gmail.com", 2);
		trainer[2]=new Trainer3("Mukesh", "Devops", "mukesh@gmail.com", 3);
			
		trainer[0].Selenium();
		trainer[1].WebDevelpoment();
		trainer[2].DevOps();

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
	
	public Trainer3 (String TName, String TDepartment, String TEmail, int TId)
	{
		name=TName;
		department=TDepartment;
		email=TEmail;
		id=TId;
		
	}
	
}
