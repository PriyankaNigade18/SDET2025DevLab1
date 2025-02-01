package com.Week4_OOP.Encapsulation;

class Employee
{
	private int id=201;
	private String name="Geeta";
		
	//public methods-getters() and setters()
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	//business logic
	public void show()
	{
		System.out.println("Employee id: "+id);
		System.out.println("Employee Name is: "+name);
	}


	
	
}





public class EncapsulationDemo 
{

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.show();
		
		e1.setId(67667);
		System.out.println(e1.getId());
		e1.setName("Seema");
		System.out.println(e1.getName());
		
		e1.show();
		
//		e1.id=6554;
//		e1.name="Seema";
		//e1.show();


	}

}
