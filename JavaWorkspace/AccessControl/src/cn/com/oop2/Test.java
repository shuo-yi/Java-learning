package cn.com.oop2;
import java.util.Scanner;
public class Test {
	public static void main(String[] args){
		
		Dog2 dog=new Dog2(100, "aa","a dog");//构造
		dog.sayHello();
		
		Scanner input =new Scanner(System.in);
		System.out.print("health:");
		dog.health = input.nextInt();//获得键盘输入的数据
		System.out.print("name:");
		dog.name = input.next();
		
		dog.print();
		dog.print(7);
		dog.sameName();
		dog.superTest();
		
		
		
	}

}
