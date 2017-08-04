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
		C c = new C();
		B b = new B();
		A a = new A(b);
		
		Thread.sleep(20000);
		c = null;
		Thread.sleep(10000000);
	}

	public static class A {
		// 静态变量不在A的实例对象的占用空间中
		public static int i = 10;

		// s1的引用占8个字节，s1自身存储占64字节
		String s1 = new String("1");

		B b;
		
		A (B b) {
			this.b = b;
		}
	}

	public static class B {
		int i = 0;

		int valueb[] = new int[0];

		C c = new C();
	}

	public static class C {
		int i = 0;

		int valuec[] = { 100, 200, 300 };
	}

}
