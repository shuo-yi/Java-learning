package cn.com.oop3;

public class Test {
	public static void main(String[] args){
		Son son=new Son();
		son.m1();//父类方法被覆盖
		son.m2();
		Son.m3();
		son.m4();
		
	}

}
