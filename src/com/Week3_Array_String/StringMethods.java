package com.Week3_Array_String;

public class StringMethods {

	public static void main(String[] args)
	{
		//length()
		String s1="Hello All";
		System.out.println("Length of string is: "+s1.length());//9

		//toUpperCase() toLowerCase()
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//charAt(index)
		System.out.println("Get the character for index 6: "+s1.charAt(6));//A
		
		
		//indexOf(char): first occurrence index
		System.out.println("first occurrence: "+s1.indexOf('l'));//2
		System.out.println("third char index: "+s1.indexOf('l',4));//7
		
		//lastIndexOf(char)
		System.out.println("Last occurrence index of char l: "+s1.lastIndexOf('l'));//8
		
		/*
		 * equality between Strings(data/Object)
		 * ---------------------------
		 * 1.equals(): exact match it is case sensitive
		 * 2.equalsIgnoreCase(): it is not case sensitive
		 */
		
		String act="TestNG is unit testing framework";
		String exp="TestNG is unit testing framework";
		System.out.println("Using equals(): "+act.equals(exp));//true
		System.out.println("Using equalsIgnoreCase(): "+act.equalsIgnoreCase(exp));//true
		exp="TestNG Is Unit Testing Framework";
		System.out.println("Using equals(): "+act.equals(exp));//false
		System.out.println("Using equalsIgnoreCase(): "+act.equalsIgnoreCase(exp));//true
		
		
		//search operation: contains()
		System.out.println("look for Selenium in act string?: "+act.contains("Selenium"));
		System.out.println("look for TestNG in act string?: "+act.contains("TestNG"));

		
		String s2="Selenium WebDriver is an api for webui automation test";
		//startsWith(prefix value)
		System.out.println("look for String starts with Selenium?: "+s2.startsWith("Selenium"));//true
		System.out.println("look for String starts with Sele?: "+s2.startsWith("Sele"));//true

		System.out.println("look for String starts with S?: "+s2.startsWith("S"));//true

		System.out.println("look for String starts with nium?: "+s2.startsWith("nium"));//false

		//endsWith(suffix value)
		System.out.println("look for String ends with test?: "+s2.endsWith("test"));//true
		System.out.println("look for String ends with st?: "+s2.endsWith("st"));//true
		System.out.println("look for String ends with t?: "+s2.endsWith("t"));//true
		System.out.println("look for String ends with te?: "+s2.endsWith("te"));//false
		
		
		//isBlank():empty or white space  and isEmpty(): length should be 0
		String s3="";
		System.out.println("Is string blank?: "+s3.isBlank());//true
		System.out.println("String is Empty?: "+s3.isEmpty());//true
		
		s3=" ";
		System.out.println("Is string blank?: "+s3.isBlank());//true
		System.out.println("String is Empty?: "+s3.isEmpty());//false
		
		s3="a";
		System.out.println("Is string blank?: "+s3.isBlank());//false
		System.out.println("String is Empty?: "+s3.isEmpty());//false
		
		
		//trim():ignore white space before and after the string
		String s4="       Welcome All!        ";
		System.out.println(s4);
		System.out.println(s4.trim());
		
		//substring(beginindex):Returns a string that is a substring of this string. 
		s2="Selenium WebDriver is an api for webui automation api test";
		
		System.out.println(s2.substring(8));
		System.out.println(s2.substring(9,23));//bi=9 li=23-1=22char
		
		//replace()
		System.out.println(s2);
		System.out.println(s2.replace('i','*'));
		System.out.println(s2.replace("api","interface"));
		
		String s5="Total bill is 500 and items are 10";
		String expr="[0-9]+";
		
		System.out.println(s5.replaceAll(expr,"($0)"));
	
		
		//concat() or +
		String ss1="Hello";
		String ss2="All";
		System.out.println(ss1+" "+ss2);
		System.out.println(ss1.concat(" "+ss2));
		
		
		//toCharArray():string convert into array of character
		char arr[]=ss1.toCharArray();
		for(char i:arr)
		{
			System.out.println(i);
		}
		
		//split(regexp):String []
		
		String tools="selenium,Appium,Postman,Cypress,Playwright";
		System.out.println(tools);
		String tool[]=tools.split(",");
		
		for(String i:tool)
		{
			System.out.println(i);
		}
		
		String t1=tools.split(",")[3];
		System.out.println(t1);
		
		
		/*
		 * amount should be less than 10000
		 */
		String bill="Total amount is 5000";
		String data=bill.split(" ")[3];
		//string to integer
		int amount=Integer.parseInt(data);
		if(amount<10000)
		{
			System.out.println("Correct Amount");
		}else
		{
			System.out.println("Wrong Amount");
		}
		
		
		/*
		 * reverse String using with method: StringBuffer and StringBuilder
		 * reverse using without method: String 
		 * 
		 * StringBuilder and StringBuffer are mutable classes
		 * using new keyword
		 */
		
		
		StringBuilder br=new StringBuilder("Selenium java");
		System.out.println(br);
		br.append( 2025);
		System.out.println(br);
		
		System.out.println(br.reverse());
		
		//String class
		String test="Java Selenium";
		String res="";
		
		for(int i=test.length()-1;i>=0;i--) {
			res=res+test.charAt(i);
		}
		
		System.out.println("Reverse of "+test+" is : "+res);
		
		
		
		//compareTo():Comparing based on unicode(Ascii)
		
		String ss3="ABC";//[65,66,67]
		String ss4="ABC";
		System.out.println(ss3.compareTo(ss4));//return 0
		
		String ss5="abc";
		System.out.println(ss3.compareTo(ss5));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
