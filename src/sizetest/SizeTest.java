/**
 * Project Name:study
 * Date:2017年7月28日下午3:56:21
 * Copyright (c) 2017, All Rights Reserved.
 *
 */

package sizetest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.zzh.size.MySizeOf;

/**
 * 以下测试都是未压缩情况的测试 -XX:-UseCompressedOops
 * 
 * @author zhenyang<br/>
 * @date: 2017年7月28日 下午3:56:21
 */
public class SizeTest {

	public static void main(String[] args) throws IllegalAccessException, InterruptedException {

		char c = 'c';
		int i = 10;
		// MySizeOf.sizeOf 只能测对象？？？
		System.out.println("char 自身占用空间为： " + MySizeOf.sizeOf(c));

		System.out.println("int 自身占用空间为： " + MySizeOf.sizeOf(i));
		System.out.println("a 自身占用空间为： " + "a".getBytes().length);

		System.out.println("new Integer(1) 自身占用空间为： " + MySizeOf.sizeOf(new Integer(1)));
		System.out.println("new Integer(1) 全部占用空间为： " + MySizeOf.fullSizeOf(new Integer(1)));

		String str = "a";
		System.out.println("a 自身占用空间为： " + MySizeOf.sizeOf(str));
		System.out.println("a 全部占用空间为： " + MySizeOf.fullSizeOf(str));

		System.out.println("new String() 自身占用空间为： " + MySizeOf.sizeOf(new String("")));
		System.out.println("new String() 全部占用空间为： " + MySizeOf.fullSizeOf(new String("")));
		
		System.out.println("new String(a) 全部占用空间为： " + MySizeOf.fullSizeOf(new String("a")));
		System.out.println("new String(a) 自身占用空间为： " + MySizeOf.sizeOf(new String("a")));

		System.out.println("new String(aaaa) 自身占用空间为： " + MySizeOf.sizeOf(new String("aaaa")));
		System.out.println("new String(aaaa) 全部占用空间为： " + MySizeOf.fullSizeOf(new String("aaaa")));

		System.out.println("new String(aaaaaaaaaa) 自身占用空间为： " + MySizeOf.sizeOf(new String("aaaaaaaaaa")));
		System.out.println("new String(aaaaaaaaaa) 全部占用空间为： " + MySizeOf.fullSizeOf(new String("aaaaaaaaaa")));
		
		System.out.println("new ArrayList<>() 自身占用空间为： " + MySizeOf.sizeOf(new ArrayList<>()));
		System.out.println("new ArrayList<>() 全部占用空间为： " + MySizeOf.fullSizeOf(new ArrayList<>()));
		
		List<Integer> list11111 = new ArrayList<>();
		list11111.add(1);
		System.out.println("new ArrayList<>().add(1) 自身占用空间为： " + MySizeOf.sizeOf(list11111));
		System.out.println("new ArrayList<>().add(1) 全部占用空间为： " + MySizeOf.fullSizeOf(list11111));
		
		//int size、int threshold、final float loadFactor、int modCount、int hashSeed、
		//Entry<K,V>[] table、Set<Map.Entry<K,V>> entrySet、Set<K> keySet、Collection<V> values
		System.out.println("new HashMap<>() 自身占用空间为： " + MySizeOf.sizeOf(new HashMap<>()));
		System.out.println("new HashMap<>() 全部占用空间为： " + MySizeOf.fullSizeOf(new HashMap<>()));

		A a = new A();
		System.out.println("new A() 自身占用空间为： " + MySizeOf.sizeOf(a));
		System.out.println("new A() 全部占用空间为： " + MySizeOf.fullSizeOf(a));
		
		Thread.sleep(1000000);
		
//		System.out.println("A.class 自身占用空间为： " + MySizeOf.sizeOf(A.class));
//		System.out.println("A.class 全部占用空间为： " + MySizeOf.fullSizeOf(A.class));

	}

	public static class A {
		
		//静态变量不在A的实例对象的占用空间中
//		public static int i = 10;
//
//		public static List<Integer> staticList = new ArrayList<>();
//
//		{
//			staticList.add(10);
//		}

		// 2个字节
		// char c = 'c';
		
		// //1个字节
		// boolean i1 = false;
		
		// //8个字节
		// long j;
		
		// s的引用占8个字节，s自身存储占24字节
		// String s = "";
		
		// s1的引用占8个字节，s1自身存储占56字节
		// String s1 = new String("");

		// list 的引用占8个字节，list的存储占64字节
		 List<Integer> list = new ArrayList<>();
		//
//		 B b;
		//
		A() {
//			 b = new B();
			//
			// list.add(1);
			//
			// list.add(2);
		}

	}

	public static class B {
//		int i = 0;
//		long j;
		String s = "a";
		 List<Integer> list = new ArrayList<>();
	}

}
