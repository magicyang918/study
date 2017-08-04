/**
 * Project Name:study
 * Date:2017年7月29日下午11:03:12
 * Copyright (c) 2017, All Rights Reserved.
 *
 */

package test;

/**
 * 
 * @author zhenyang13<br/>
 * @date: 2017年7月29日 下午11:03:12
 */
public class StringTest {
	
	private static String as = "ab";   

	public static void main(String[] args) {
		//初步认为new出来的对象会在常量池中生成“abc”，然后复制一份到堆中。即s1是指向堆中的”abc“，而s2是指向常量池中的abc。s1.intern()函数是指向s1在字符串常量区生成的“abc”
		String s1 = new String("abc");
		String s2 = "abc";
		String s3 = s1.intern();
		System.out.println(s1 == s3);
		System.out.println(s1 == s2);
		System.out.println(s3 == s2);
		String a = "a";  
		String b = "b";  
		String s = a + b; 
		String d = "a" + "b";
		String c = "ab";
		System.out.println(s == as);//false  
		System.out.println(s.intern() == as);//true 
		System.out.println(c == as);
		
		System.out.println(c == s);
		
		System.out.println(d == c);
		System.out.println(d == as);
	}

}
