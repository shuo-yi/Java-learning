package cn.com.oop2;

public class Animal{
    public int health=100;
    static String name="noName";
    
    Animal(int health,String name1){
    	this.health=health;
    	name=name1;
    }
    public void print(){
    	System.out.println("�ҵ����ֽУ�"+name+"����ֵ�ǣ�"+this.health);
    }
    public void sameName(){
    	System.out.println("�����еĺ���");
    }
    
    public void setHealth(int health){
    	if(health<0||health>100){
    		System.out.print("�������������0��100֮�������");
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