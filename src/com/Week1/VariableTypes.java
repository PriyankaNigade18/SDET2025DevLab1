package com.Week1;

public class VariableTypes 
{
	//instance variable
	int id=101;
	String name="Amit";
	static String cname="AISSPMs";
	
	public void show()
	{
		System.out.println("College name is: "+cname);
		int marks=90;//local variable
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
		System.out.println("marks from show(): "+marks );
	}
	
	

	public static void main(String[] args) 
	{
		int marks=100;//local variable to main()
		
		System.out.println("College name is: "+cname);
		System.out.println("College name is: "+VariableTypes.cname);


		System.out.println("marks from main(): "+marks);

		VariableTypes v1=new VariableTypes();
		v1.show();

		System.out.println("id is: "+v1.id);
		System.out.println("name is: "+v1.name);

	}

}
