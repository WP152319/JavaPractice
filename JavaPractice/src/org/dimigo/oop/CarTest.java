/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarTest
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author :  tjrgh
 * @version : 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = new Car();
		Car car1= new Car();
		Car car2= new Car();
		
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : "+car.getCompany());
		System.out.println("모델명 : "+car.getModel());
		System.out.println("색상 : "+car.getColor());
		System.out.println("최대속도 : "+car.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d",car.getPrice())+"원"+"\n");
		
		car1.setCompany("기아자동차");
		car1.setModle("K7");
		car1.setColor("흰색");
		car1.setMaxSpeed(246);
		car1.setPrice(40000000);
		System.out.println("제조사명 : "+car1.getCompany());
		System.out.println("모델명 : "+car1.getModel());
		System.out.println("색상 : "+car1.getColor());
		System.out.println("최대속도 : "+car1.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d",car1.getPrice())+"원"+"\n");
		
		car2.setCompany("삼성자동차");
		car2.setModle("SM7");
		car2.setColor("회색");
		car2.setMaxSpeed(200);
		car2.setPrice(38000000);
		System.out.println("제조사명 : "+car2.getCompany());
		System.out.println("모델명 : "+car2.getModel());
		System.out.println("색상 : "+car2.getColor());
		System.out.println("최대속도 : "+car2.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d",car2.getPrice())+"원");
	}

}
