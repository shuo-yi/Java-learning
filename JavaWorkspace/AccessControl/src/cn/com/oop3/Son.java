
package cn.com.oop3;
//����
public class Son extends Father {
	public void m1(){
		System.out.println("������д�����m1����");
		
	}
//�ڷ�����дʱ�����෽������ֵ���Ϳ����Ǹ��෽������ֵ���͵�����
//Son��Father������
	public Son m2(){
		System.out.println("������д�����m2����");
		return new Son();
	}
/* ���ֱ�������ľ�̬�������ܱ�����Ϊ�Ǿ�̬����
 * �ڽ��з�������ʱ�����ܸı䷽���ľ�̬���
 * �������þ�̬�������Ǹ���ľ�̬����ʱ�������ɷ�����д��ֻ�Ƕ�����һ���븸�ྲ̬����ͬ���ľ�̬�������������еľ�̬���������ˣ���
 * ��̬�����޷�ʹ��super,�����þ�̬������ģʽ���ø����еľ�̬����  ����.������
 * public void m3(){
		System.out.println("����ľ�̬����");
	}
*/
	public static void m3(){
		System.out.println("����ľ�̬����");
		Father.m3();
	}
/*�����˽�з������ܱ����า��
 * �����е�m4�븸���е�m4û�й�ϵ
 */
    void m4(){
		System.out.println("����ķ���m4");
	}
	
}
