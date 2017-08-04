/**
 * Project Name:study
 * Date:2017年8月7日下午6:27:02
 * Copyright (c) 2017, All Rights Reserved.
 *
 */

package test;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 * @author zhenyang13<br/>
 * @date: 2017年8月7日 下午6:27:02
 */
public class IntegerTest {

	public static void main(String[] args) {
		int i = 40;
		int i0 = 40;
		Integer i1 = 400;
		Integer i2 = 400;
		Integer i3 = 0;
		Integer i4 = new Integer(40);
		Integer i5 = new Integer(40);
		Integer i6 = new Integer(0);
		Double d1 = 1.0;
		Double d2 = 1.0;

		System.out.println("i=i0\t" + (i == i0));
		System.out.println("i1=i2\t" + (i1 == i2));
		System.out.println("i1=i2+i3\t" + (i1 == i2 + i3));
		System.out.println("i4=i5\t" + (i4 == i5));
		System.out.println("i4=i5+i6\t" + (i4 == i5 + i6));
		System.out.println("d1=d2\t" + (d1 == d2));

		System.out.println();
	}

}
