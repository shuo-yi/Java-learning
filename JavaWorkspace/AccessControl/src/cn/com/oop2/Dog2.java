
package cn.com.oop2;

public class Dog2 extends Animal{
	private String dog="I am a dog!";
	Dog2(int health,String name1,String dog){
		super(health,name1);//���ʸ���Ĺ��캯��
		this.dog=dog;
	}
	public void print(int a){
		System.out.println("�븸���еĺ���ͬ����ͬ����"+a);
	}
	public void sameName(){
    	System.out.println("�����еĺ������������е�ͬ����������");
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
		System.out.println("��super���ʸ����е�����"+super.health+super.name);
		super.print();
		super.sameName();
	}
}
