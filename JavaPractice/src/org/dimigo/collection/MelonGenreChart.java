/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ MusicGenreChart
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 *
 * @author :  tjrgh
 * @version : 1.0
 */
public class MusicGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		Map<String , List<Music>> map = new HashMap<>();  
		List<Music> danceArrayList = new ArrayList<Music>();
		List<Music> balladArrayList = new ArrayList<Music>();
		danceArrayList.add(new Music("I LUV IT","PSY"));
		danceArrayList.add(new Music("맞지?","언니쓰"));
		balladArrayList.add(new Music("팔레트","아이유"));
		map.put("댄스", danceArrayList);
		map.put("발라드", balladArrayList);
	 
		System.out.println("-- <<멜론 챠트>> --");
		printMap(map);

		 
		 
		danceArrayList.set(1, new Music("SIGNAL","트와이스"));
		map.put("댄스", danceArrayList);
		System.out.println("-- <<댄스 2위 곡 변경>> --");
		printMap(map);

		 
		danceArrayList.remove(0);
		map.put("댄스", danceArrayList);
		System.out.println("-- <<댄스 1위 곡 삭제>> --");
		printMap(map);

		 
		map.clear();
		System.out.println("-- << 전체 리스트 삭제 >> --");
		 

	}
	
	public static void printMap(Map<String, List<Music>> map) {
		for( String key : map.keySet()) {
			System.out.println("[" + key + "]");
			int i = 1;
			for (Music s : map.get(key)) {
				System.out.printf("%d. ",i++);
				System.out.println(s);
			}
		}
		System.out.println();
	}
}
