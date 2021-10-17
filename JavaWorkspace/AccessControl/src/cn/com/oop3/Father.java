//overrides(方法重写)
package cn.com.oop3;
//父类
public class Father {
	int age;
	String name;
	
	public void m1(){
		System.out.println("父类的m1方法");
	}
	
	public Father m2(){
		return new Father();
	}
	
	public static void m3(){
		System.out.println("父类的静态方法");
	}
	
	private void m4(){
		System.out.println("父类的私有方法m4");
	}


}
