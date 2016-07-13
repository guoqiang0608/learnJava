/*
环境变量配置
CLASSPATH= .;%JAVA_HOME%/lib/dt.jar;%JAVA_HOME%/lib/tools.jar

JAVA_HOME = C:/Program Files/Java/jdk1.5.0

PATH  = %JAVA_HOME%/bin;%JAVA_HOME%/jre/bin

注意：JAVA_HOME，PATH均设置为系统变量
*/


public class helloworld{
	public static void main(String[] args)
	{
		int a = 9;
		int b = 6;
		int c = ~a;//((~a)^b);
		System.out.println("helloworld  "+c);
	}
}