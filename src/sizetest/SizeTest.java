/**
 * Project Name:study
 * Date:2017年7月28日下午3:56:21
 * Copyright (c) 2017, All Rights Reserved.
 *
 */

package sizetest;

import java.util.ArrayList;
import java.util.List;

import com.zzh.size.MySizeOf;

/**
 * @author zhenyang<br/>
 * @date: 2017年7月28日 下午3:56:21
 */
public class SizeTest {

	public static void main(String[] args) throws IllegalAccessException {
		
		char c = 'c';
		int i = 10;
		//MySizeOf.sizeOf 只能测对象？？？
		System.out.println("char 自身占用空间为： " + MySizeOf.sizeOf(c));
		
		System.out.println("int 自身占用空间为： " + MySizeOf.sizeOf(i));
		System.out.println("a 自身占用空间为： " + "a".getBytes().length);
		
		System.out.println("new Integer(1) 自身占用空间为： " + MySizeOf.sizeOf(new Integer(1)));
		
		String str = "a";
		System.out.println("a 自身占用空间为： " + MySizeOf.sizeOf(str));
		
		System.out.println("new String() 自身占用空间为： " + MySizeOf.sizeOf(new String("")));

		System.out.println("new String(a) 自身占用空间为： " + MySizeOf.sizeOf(new String("a")));

		System.out.println("new String(aaaa) 自身占用空间为： " + MySizeOf.sizeOf(new String("aaaa")));

		System.out.println("new String(aaaaaaaaaa) 自身占用空间为： " + MySizeOf.sizeOf(new String("aaaaaaaaaa")));

		System.out.println("new Integer(1) 全部占用空间为： " + MySizeOf.fullSizeOf(new Integer(1)));
		
		System.out.println("a 全部占用空间为： " + MySizeOf.fullSizeOf(str));

		System.out.println("new String(a) 全部占用空间为： " + MySizeOf.fullSizeOf(new String("a")));
		System.out.println("new String() 全部占用空间为： " + MySizeOf.fullSizeOf(new String("")));

		System.out.println("new String(aaaa) 全部占用空间为： " + MySizeOf.fullSizeOf(new String("aaaa")));

		System.out.println("new String(aaaaaaaaaa) 全部占用空间为： " + MySizeOf.fullSizeOf(new String("aaaaaaaaaa")));

		A a = new A();
		System.out.println("new A() 自身占用空间为： " + MySizeOf.sizeOf(a));
		System.out.println("new A() 全部占用空间为： " + MySizeOf.fullSizeOf(a));

	}

	public static class A {
		//2个字节
//		char c = 'c';
//		//1个字节
//		boolean i1 = false;
//		//8个字节
//		long j;
		//s的引用占8个字节，s自身存储占24字节
//		String s = "";
		//s1的引用占8个字节，s1自身存储占56字节
//		String s1 = new String("");
		
		List<Integer> list = new ArrayList<>();
//
//		B b;
//
		A() {
//			b = new B();
//
			list.add(1);
			
			list.add(2);
		}

	}

	public static class B {
		int i = 0;
		long j;
		String s = "a";
	}

}
