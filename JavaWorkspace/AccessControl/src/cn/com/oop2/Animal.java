package cn.com.oop2;

public class Animal{
    public int health=100;
    static String name="noName";
    
    Animal(int health,String name1){
    	this.health=health;
    	name=name1;
    }
    public void print(){
    	System.out.println("我的名字叫："+name+"健康值是："+this.health);
    }
    public void sameName(){
    	System.out.println("父类中的函数");
    }
    
    public void setHealth(int health){
    	if(health<0||health>100){
    		System.out.print("输入错误，请输入0到100之间的整数");
    		this.health=60;
    	}
    	else{
    		this.health=health;
    	}
    }
    public int getHealth(){
    	return this.health;
    }
    public String getName() {
		return name;
	}
	public void setName(String name1) {
		name = name1;
	}
	
}