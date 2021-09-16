package com.usa.method;

public class Class2 {
//main method
	public static void main(String[] args) {
	
	Class2 obj=new Class2();
	//non- static void one parameterize method
	obj.getTest("Habib");
	obj.getTest("Titu");
	//non-static void two parameterize method
	obj.getInfo("sazzad", 30);
	obj.getName("Babu");
}

//non-static void one parameterize method

public void getTest(String name) {

System.out.println("My name is" + name);

}
//non-static void two parameterize method
public void getInfo(String name,int age) {

System.out.println("My name is" + name+ "age:"+ age);
}
//non-static return type parameterize methot
public String getName(String study) {
	System.out.println(study);
	return study;
}
}

