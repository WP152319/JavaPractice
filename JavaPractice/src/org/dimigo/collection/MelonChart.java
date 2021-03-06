/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ MelonChart
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 12.
 * </pre>
 *
 * @author :  tjrgh
 * @version : 1.0
 */
public class MelonChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 List<Music> list = new ArrayList<Music>();
		 list.add(new Music("I LUV IT","PSY"));
		 list.add(new Music("맞지?","언니쓰"));
		 
		 System.out.println("-- <<멜론 챠트>> --");
		 printList(list);
		 
		 list.add(1,new Music("SIGNAL","트와이스"));
		 System.out.println("-- <<2위 곡 추가>> --");
		 printList(list);
		 
		 list.set(2, new Music("팔레트","아이유"));
		 System.out.println("-- <<3위 곡 변경>> --");
		 printList(list);
		 
		 list.remove(1);
		 System.out.println("-- <<2위 곡 삭제>> --");
		 printList(list);
		 
		 list.clear();
		 System.out.println("-- << 전체 리스트 삭제 >> --");
		 
		 
	}
	
	public static void printList(List<Music> list) {
		int i = 1;
		for (Music s : list) {
			System.out.printf("%d. ",i++);
			System.out.println(s);
		}
		System.out.println();
	}
	
}
