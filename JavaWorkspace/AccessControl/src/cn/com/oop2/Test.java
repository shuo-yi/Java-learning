package cn.com.oop2;
import java.util.Scanner;
public class Test {
	public static void main(String[] args){
		
		Dog2 dog=new Dog2(100, "aa","a dog");//����
		dog.sayHello();
		
		Scanner input =new Scanner(System.in);
		System.out.print("health:");
		dog.health = input.nextInt();//��ü������������
		System.out.print("name:");
		dog.name = input.next();
		
		dog.print();
		dog.print(7);
		dog.sameName();
		dog.superTest();
		
		
		
	}

}
