/*
ʵ��static���η���ʲô����

	��̬����ֱ�ӷ��ʾ�̬�ģ�����ֱ�ӷ��ʷǾ�̬�ģ�ͨ������ɷ��ʣ�
	
	�Ǿ�̬����ֱ�ӷ��ʾ�̬�ģ�Ҳ��ֱ�ӷ��ʷǾ�̬��
	
	why���������е�ʵġ�������

�ļ���Ҫ������һ��

	���ʣ�һ���ļ��ж������ô�죿
	
һ��*.java�ļ���,ֻ����һ��public����,�������public���ε��������Ҫ������ļ�����ͬ.
	
�ڲ������ʵ������
��Ա�ڲ����������ⲿ������ڵģ�Ҳ����˵�����Ҫ������Ա�ڲ���Ķ���ǰ���Ǳ������һ���ⲿ��Ķ���
*/

class dog
{
	public int a;
}

public class Outer{
	private int a;
	private int b;
	static int c;
	
	//��ʼ����
	{
		a=1;
		b=2;
		c=3;
	}
	
	public void set(int a,int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int get(){
		return this.b;
	}
	
	public void show(){
		System.out.println(a+b+c);
		System.out.println(a);
	}
	
	public class Inner{
		private int a;
		private int d;
		
		//�Ǿ�̬�ڲ��಻��������̬����
		//static int c;
		//static int e;
		
		public void show(){
			//�ڲ�������ⲿ���Ա
			System.out.println(b);
		}
	}
	
	public static void main(String[] args)
	{
		Outer out = new Outer();
		
		//��̬��Ա��ֱ�ӷ���
		System.out.println("helloworld"+out.a+c);
		
		//��̬�������ܷ��ʷǾ�̬����
		out.show();
		
		//��
		out.show();
	}
}