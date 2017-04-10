/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author : tjrgh
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] question = { "가장 좋아하는 가수는? ", "가장 좋아하는 배우는? ", "가장 좋아하는 과목은? " };
		String[] answers = { "강엄", "진현", "점수학" };
		for (int i = 0; i < 3; i++) {
			System.out.println(question[i]);
			String answer = scanner.nextLine();
			if (answers[i].equals(answer)) {
				System.out.println("정답입니다.");
			} else {System.out.println("틀렸습니다.");
			}
		}
		System.out.println("<< 결과출력 >>");
		for(int j=0; j<3;j++){
			StringBuilder sb = new StringBuilder(question[j]);
			sb.append(answers[j]).append("입니다.");
			System.out.println(sb);
		}
	}

}
