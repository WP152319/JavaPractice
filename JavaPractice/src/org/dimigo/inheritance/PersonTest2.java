/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ PersonTest2
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 10.
 * </pre>
 *
 * @author :  tjrgh
 * @version : 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person person[] = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};
		for(Person p : person){
			System.out.println(p);
			p.sayHello();
			p.sayBye();
			System.out.println();
		}
		
/*		greeting(new Person("Tom"));
		System.out.println();
		greeting(new Korean("홍길동"));
		System.out.println();
		greeting(new Japanese("다나카"));
		System.out.println();
		greeting(new Chinese("왕밍"));
*/
	}
	
/*	private static void greeting(Person p){
		System.out.println(p);
		p.sayHello();
		p.sayBye();
	}
*/
}
