
package cn.com.oop3;
//子类
public class Son extends Father {
	public void m1(){
		System.out.println("子类重写父类的m1方法");
		
	}
//在方法重写时，子类方法返回值类型可以是父类方法返回值类型的子类
//Son是Father的子类
	public Son m2(){
		System.out.println("子类重写父类的m2方法");
		return new Son();
	}
/* 出现报错，父类的静态方法不能被覆盖为非静态方法
 * 在进行方法覆盖时，不能改变方法的静态与否
 * 子类中用静态方法覆盖父类的静态方法时，不构成方法重写，只是定义了一个与父类静态方法同名的静态方法，将父类中的静态方法隐藏了，、
 * 静态方法无法使用super,可以用静态方法的模式调用父类中的静态方法  类名.方法名
 * public void m3(){
		System.out.println("父类的静态方法");
	}
*/
	public static void m3(){
		System.out.println("子类的静态方法");
		Father.m3();
	}
/*父类的私有方法不能被子类覆盖
 * 子类中的m4与父类中的m4没有关系
 */
    void m4(){
		System.out.println("子类的方法m4");
	}
	
}
