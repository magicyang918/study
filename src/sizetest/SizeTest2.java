/**
 * Project Name:study
 * Date:2017年7月28日下午3:56:21
 * Copyright (c) 2017, All Rights Reserved.
 *
 */

package sizetest;


/**
 * 以下测试都是未压缩情况的测试 -XX:-UseCompressedOops
 * 
 * @author zhenyang<br/>
 * @date: 2017年7月28日 下午3:56:21
 */
public class SizeTest2 {

	public static void main(String[] args) throws IllegalAccessException, InterruptedException {
		A a = new A();
		Thread.sleep(10000000);
	}

	public static class A {
		//静态变量不在A的实例对象的占用空间中
		public static int i = 10;
		
		// s1的引用占8个字节，s1自身存储占64字节
		String s1 = new String("a");
		
		B b = new B();
	}

	public static class B {
		int i = 0;
		
		char value[] = new char[0];
		
		C c = new C();
	}
	
	public static class C {
		int i = 0;
		
		char value[] = {'a', 'b'};
	}

}
