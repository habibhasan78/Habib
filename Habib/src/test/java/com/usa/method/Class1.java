package com.usa.method;
public class Class1 {//parent class or super class 
  //instance variable
String box ="White Box";
//global variable
static String continer="Brown Box";
	//main method
public static void main(String[] args) {
//static void method
     Class1.oldProject();
//static return method
	System.out.println( Class1.futureProject());
	//non-static void method
	Class1 obj = new Class1();
	obj.newProject();
	//non-static return type method
	System.out.println(obj.currentProject());
}
//non-static void method
public void newProject() {
System.out.println(box);
}
  //static void method
public static void oldProject() {
	System.out.println("I am static void method");
}
//non-static return type method
public String currentProject() {
	return continer;
}
//static return type method
public static int futureProject() {
	//local variable
	return 142;
	}
}
