//overrides(������д)
package cn.com.oop3;
//����
public class Father {
	int age;
	String name;
	
	public void m1(){
		System.out.println("�����m1����");
	}
	
	public Father m2(){
		return new Father();
	}
	
	public static void m3(){
		System.out.println("����ľ�̬����");
	}
	
	private void m4(){
		System.out.println("�����˽�з���m4");
	}


}
