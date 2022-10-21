package assignment1;

public class FindArrayString {

	public static void main(String[] args) {
		
		String [] name= {"Java", "Javascript","Selenium","Python","Mukesh"};
		for(int i=0;i<5;i++)
		{
			if(name[i]=="Selenium")
			{
				System.out.println("Selenium is present in the array at index "+i+" Position");
				break;
			}
		}

	}

}
