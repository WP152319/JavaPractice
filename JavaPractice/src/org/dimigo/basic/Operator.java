/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 *
 * @author :  tjrgh
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int m = 1700000, s = 3, j = 1500;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.printf("월 평균 급여 : "+String.format("%,d", m)+"원\n");
		System.out.printf("점포 내 직원 수 : "+s+"명\n");
		System.out.printf("점포 수 : "+String.format("%,d", j)+"개\n\n");
		System.out.printf("연간 인건비 : "+String.format("%,d", (long)m*s*j*12)+"원");
		

	}

}
