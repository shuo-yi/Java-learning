
package cn.com.oop2;

public class Dog2 extends Animal{
	private String dog="I am a dog!";
	Dog2(int health,String name1,String dog){
		super(health,name1);//访问父类的构造函数
		this.dog=dog;
	}
	public void print(int a){
		System.out.println("与父类中的函数同名不同参数"+a);
	}
	public void sameName(){
    	System.out.println("子类中的函数，将父类中的同名函数覆盖");
    }
	public void setDog(String dog){
		this.dog=dog;
	}
	public String getDog(){
		return this.dog;
	}
	public void sayHello(){
		System.out.println("hello!"+"health:"+this.health+"name:"+name);
	}
	
	public void superTest(){
		System.out.println("用super访问父类中的属性"+super.health+super.name);
		super.print();
		super.sameName();
	}
}
