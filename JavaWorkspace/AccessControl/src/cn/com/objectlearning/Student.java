//https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html
//Object¿‡πŸ∑ΩŒƒµµ
package cn.com.objectlearning;

public class Student {
	private int sid;
	private String name;
	private int age;
	private int weight;
	
	public Student(){
		
	}
    
	public Student(int sid,String name,int age,int weight){
		this.sid=sid;
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	

}
