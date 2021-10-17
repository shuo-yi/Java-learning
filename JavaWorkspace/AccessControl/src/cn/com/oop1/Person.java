package cn.com.oop1;

class Person {
	static String name;
	static int age=10;
	   
	public static void main(String[] args){
    	
    	
    	Student s = new Student();
    	Person p = new Person();
    }
	public static void out(){
		name="ysy,this is a static方法";
		System.out.println(Person.name);
	}
	static{
		age+=2;
		System.out.println("this is a static 代码块"+age);
	}
	static{
		age+=2;
		System.out.println("this is a static 代码块"+age);
	}
	
}
