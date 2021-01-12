package com.test;

class OverloadTest{
	public static void main(String[] argvs) {
		print(1);
		print(1, 2);
		print(2.0, 1);
		print(1, 22.0);
	}
	static void print(int a){
		System.out.println(a);
	}
	static void print(int a, int b){
		System.out.println(a);
		System.out.println(b);
	}
	static void print(double a, int b){
		System.out.println(a);
		System.out.println(b);
	}
	static void print(int a, double b){
		System.out.println(a);
		System.out.println(b);
	}

}
class MethodTest{
	public static void main(String[] argvs) {
		Return();

	}
	static int Return(){
		if(true){
			return 1;
		}
		//不加下面这句会报错，尽管逻辑上方法一定会有返回值
		return 0;
	}

}
class ForTest{
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++)
		{
			if(i == 3)
				break;
			System.out.println(i);
		}
		// while(10 > 3){
		// 	System.out.println("A");
		// }
		//if(false)编译不报错,while(false)却会报错，离谱
		// while(false){
		// 	int b;
		// };
	}
}
class SwitchTest{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		int nu = s.nextInt();
		//case标签不能重复,里面{}可加可不加
		switch(nu){
			case 1:{
				nu++;
				nu++;
				break;
			}

			case 2:
				break;
			default:
				break;
		}
		System.out.println(nu);
	}
}
class InputTest{
	public static void main(String[] args) {
		//建立一个键盘扫描器对象
		java.util.Scanner s = new java.util.Scanner(System.in);
		//等待键盘输入，回车结束
		//接收字符串
		//String userInputContent = s.next();
		//接收数字
		System.out.print("please input weather: ");
		int weather = s.nextInt();
		System.out.print("please input sex: ");
		int sex = s.nextInt();
		if(weather == 1){
			if(sex == 1){
				System.out.println("男生要带一把大黑伞");
			}else if(sex == 0){
				System.out.println("女生要带一把小花伞");
			}
		}else if(weather == 0){
			System.out.println("please input temperature: ");
			int tem = s.nextInt();
			if(tem > 30){
				if(sex == 1){
					System.out.println("带墨镜");
				}else if(sex == 0){
					System.out.println("涂防晒霜");
				}

			}
		}
		//System.out.println("your input is: " + userInputContent);
	}
}
class Operator{
	public static void main(String[] args) {
		byte x = 5;
		//x = x + 5;不可以
		//x += 5;可以，等同于x = (byte)(x + 5)

		int a = 8;
		int b = 9;
		System.out.println(a + " + " + b + " = " + (a + b));
	}
	static void say(){
		System.out.println("Hello Operator!");
	}
}
public class Grammar{
	public static void main(String[] args){
		//Operator.say();
		//char a = '\u0000';

		long k = 2147483648L;
		int e = (int)k;
		System.out.println(e);

		//char a = '男'；字符编码不同，这句话可能对也可能错

		short i = 1;
		byte j = 1;
		short h = (short)(i + j);
		float p = 8L;


		int a = 8;
		int b = 6;
		// System.out.println(a < b & a++ < b);
		// System.out.println(a); //a=9
		System.out.println(a < b && a++ < b);
		System.out.println(a); // a=8

	}
}


