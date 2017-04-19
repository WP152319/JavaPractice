/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ PiggyBankTest
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 19.
 * </pre>
 *
 * @author :  tjrgh
 * @version : 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FamilyMember[] members ={
				new FamilyMember("아빠"),
				new FamilyMember("엄마"),
				new FamilyMember("나"),
				new FamilyMember("남동생"),				
		};
		FamilyMember.printMemberCnt();
		
		int[] money ={10000,5000,2000,1000};
		int i=0;
		for(FamilyMember member : members){
			PiggyBank.putMoney(member,money[i]);
			i++;
		}
		PiggyBank.printBalance();
		PiggyBank.putMoney(members[2],money[3]);
		PiggyBank.printBalance();
	}

}
