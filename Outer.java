/*
实验static修饰符有什么作用

	静态的能直接访问静态的，不能直接访问非静态的（通过对象可访问）
	
	非静态的能直接访问静态的，也能直接访问非静态的
	
	why？好像是有典故的。。。。

文件名要和类名一致

	疑问：一个文件有多个类怎么办？
	
一个*.java文件中,只能有一个public的类,而且这个public修饰的这类必需要和这个文件名相同.
	
内部类如何实例化？
成员内部类是依附外部类而存在的，也就是说，如果要创建成员内部类的对象，前提是必须存在一个外部类的对象。
*/

class dog
{
	public int a;
}

public class Outer{
	private int a;
	private int b;
	static int c;
	
	//初始化快
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
		
		//非静态内部类不能声明静态变量
		//static int c;
		//static int e;
		
		public void show(){
			//内部类访问外部类成员
			System.out.println(b);
		}
	}
	
	public static void main(String[] args)
	{
		Outer out = new Outer();
		
		//静态成员可直接访问
		System.out.println("helloworld"+out.a+c);
		
		//静态方法不能访问非静态函数
		out.show();
		
		//如
		out.show();
	}
}