package cn.com.objectlearning;

public class Test {
	public static void main(String[] args){
		Student s1=new Student();
		Student s2=new Student();
		Student s3=s1;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		
	}

}
