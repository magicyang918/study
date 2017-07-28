/**
 * Project Name:study
 * Date:2017年7月28日下午3:56:21
 * Copyright (c) 2017, All Rights Reserved.
 *
 */

package sizetest;

import com.zzh.size.MySizeOf;

/**
 * @author zhenyang<br/>
 * @date: 2017年7月28日 下午3:56:21
 */
public class SizeTest {

	public static void main(String[] args) {
		System.out.println("new Integer(1) 占用空间为： " + MySizeOf.sizeOf(new Integer(1)));

		System.out.println("new String(a) 占用空间为： " + MySizeOf.sizeOf(new String("a")));

		System.out.println("new String(aaaa) 占用空间为： " + MySizeOf.sizeOf(new String("aaaa")));

	}

}
