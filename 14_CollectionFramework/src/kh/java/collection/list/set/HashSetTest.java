package kh.java.collection.list.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * collection -Set - HashSet
 * 중복을 허용하지않는다. 저장된 순서를 보장하지 않는다.
 * 
 * LinkedHashSet :중복을 허용하지않는다. 저장된 순서 유지
 * TreeSet :중복을 허용하지않는다. 오름차순 정렬 지원
 * 
 *
 */
public class HashSetTest {

	public static void main(String[] args) {
		HashSetTest h = new HashSetTest();
//		h.test1();
//		h.test2();
//		h.test3();
//		h.test4();
		h.test5();
	}
	/**
	 * @실습문제
	 * 로또 숫자 출력하기
	 * 1~45사이의 중복없는 난수 6개를 오름차순 정렬해서 출력하세요.
	 */
	public void test5() {
	 Set<Integer> lotto = new TreeSet<>();
	 while(lotto.size() < 6)
		 lotto.add((int)(Math.random() * 45) + 1);
	 System.out.println(lotto);
	}
		
//	 Set lottoset = new HashSet<>();
//		// 로또 번호 6개 랜덤으로 받는 set 설정
//		
//		int Num;
//		//1~45받는 변수
//		
//		while(lottoset.size() != 6) {
//			//set은 중복없다
//			//lottoset의 크기가 6일때까지 랜덤
//			Num =(int)(Math.random()*45+1);
//			//lottoset 랜덤수 저장
//			lottoset.add(Num);
//			
//		}
		
		
//		ArrayList<Integer> lottoArr = new ArrayList<Integer>(lottoset);
//		 
//		Collections.sort(lottoArr);
//		//ArrayList 오름차순 정렬
//		System.out.println("금주의 로또번호는 : ");
//		
//		//로또 출력
//		for(Object list : lottoArr)
//			System.out.println(list + " ");
//		
//	}


		

	/**
	 * LinkedHashSet :저장순서 유지
	 * TreeSet : 오름차순 정렬
	 */
	public void test4() {
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(34);
		set1.add(25);
		set1.add(100);
		set1.add(1);
		System.out.println(set1);
		
		//오름차순 정렬 지원
		Set<Integer> set2 = new TreeSet<>(set1);
		System.out.println(set2);
	}
	/**
	 * 커스텀 클래스 중복처리
	 */
	public void test3() {
		Set<Person> set = new HashSet<>();
		set.add(new Person("홍길동"));
		set.add(new Person("신사임당"));
		
		set.add(new Person("홍길동"));
		
		System.out.println(set);
	}
	/**
	 * List -> Set : 중복제거
	 * 
	 * Set -> List : 순서필요(정렬)
	 */
	public void test2() {
	
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(3);
		list.add(2);
		System.out.println(list);
		
		//set변환
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);
		
		//list변환 :  내림차순 정렬
		
		list = new ArrayList<Integer>(set); 
		list.sort(Collections.reverseOrder());
		System.out.println(list); 
				
				
	}

	public void test1() {
		HashSet<Integer> set1 = new HashSet();
		Set<String> set2 = new HashSet();
		Collection<Double> set3 = new HashSet();
		
		//요소 추가
		set2.add("안녕");
//		set2.add(123); // 제네릭 덕분에 다르 타입의 요소는 추가가 불가능하다.
		set2.add("hello world");
		set2.add("ㅋㅋㅋ");
		set2.add("ㅋㅋㅋ");
		
		//저장된 요소 갯수확인
		System.out.println(set2.size());
		
		//인덱스를 통한 요소 가져오기는 지원하지 않는다.
//		set2.get(2)
		
		//반복문을 통해서 전체열람만 가능
		//일반 for문은 사용할 수 없다.
		//1.foreach문 가능
		for(String s : set2)
			System.out.println(s);
		
		//2.iterator객제 
		Iterator<String> iter = set2.iterator();
		   while(iter.hasNext()) {
		      String s = iter.next();
					System.out.println(s);
				}
		   
		   //삭제 : 동등한 객체를 찾아 삭제(equals & hashcode overriding 필수)
		   set2.remove("ㅋㅋㅋ");
		
		   //전체삭제
		   set2.clear();
		   
		   //요소가 비어있는지 검사
		   System.out.println(set2.isEmpty());//비어있으면 true
		
		   
		   System.out.println(set2);
	}
	
	

}
