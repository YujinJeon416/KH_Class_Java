package kh.java.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayListTest a = new ArrayListTest();
//		a.test0();
//		a.test1();
//		a.test2();
//		a.teat3();
//		a.test4();
//		a.test5();
//		a.test6();
		a.test7();
	}
	/**
	 * ConcurrentModificationException
	 */
	public void test7() {
		List<Student> list = new ArrayList();
		list.add(new Student (3,"조승우"));
		list.add(new Student (2,"이현재"));
		list.add(new Student(5,"송강"));
		list.add(new Student(4,"김석진"));
		list.add(new Student (1,"김선호"));
		
		
//		for(Student s : list) {
//			System.out.println(s);
//			if(s.getNo() == 5)
//				list.remove(s);
//		}
		
		//5번 학생 제거
		//1.반복문 외부 변수에 idx저장
//		int idx = -1;
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).getNo() == 5)
//				idx = i;
//		}
//		System.out.println(idx);
//		if(idx != -1)
//		list.remove(idx);
		
		//2.iterator
		Iterator<Student> iter = list.iterator();
		while(iter.hasNext()) {
			Student s = iter.next();
			if(s.getNo() == 5)
				iter.remove();//현재 가리키고 있는 collection요소를 제거
		}
		
		System.out.println(list);
	}
	/**
	 * 커스텀 클래스 정렬하기
	 */
	private void test6() {
		List<Student> list = new ArrayList();
		list.add(new Student (3,"조승우"));
		list.add(new Student (2,"이현재"));
		list.add(new Student(5,"송강"));
		list.add(new Student(4,"김석진"));
		list.add(new Student (1,"김선호"));
		
		//기본정렬 : 학번오름차순
//		Collections.sort(list);  
//		list.sort(null); //기본정렬인 경우에 Comparator객체 필요치않다.
	     
		//학번 내림차순
		Collections.sort(list,Collections.reverseOrder());
		
		//추가적인 정렬기준 생성
		//1. 이름오름차순
//		Comparator<Student> comp = new StudentNameAscending();
//		Collections.sort(list, comp);
		
		//2. 이름내림차순
		Comparator<Student> comp = new StudentNameAscending().reversed();
//		Collections.sort(list, comp);
		list.sort(comp);
	
		System.out.println(list);
		
	}

	/**
	 * 정렬
	 * 1. Comparable 인터페이스 : 
	 *       기본정렬(한가지) 클래스에서 구현. compareTo메소드 오버라이딩
	 * 2. Comparator인터페이스 : 
	 *       기본정렬외에 추가적으로 정렬기준을 제시해야 할때
	 *       별도의 Comparator구현클래스를 작성(개수 제한 없음)
	 *       compare메소드 오버라이딩
	 *       
	 */
	
	private void test5() {
		List<String> list = new ArrayList<>();
		list.add("허허허");
		list.add("가버려");
		list.add("다나가");
		list.add("나나나~");
		
		//정렬메소드호출
//		Collections.sort(list); // 기본정렬기준(사전등재순)에 따라 정렬
		
		
		//사전등재역순
		Comparator<String> comp = Collections.reverseOrder();
		Collections.sort(list, comp);
	    System.out.println(list);
		
		
		
		
		
	}



	private void test4() {
		//객체 할당부의 제네릭타입은 생략이 가능(jdk1.7 이상)
		List<Integer>list = new ArrayList<>();
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(1,100);   // 1번지에 100추가
		
		//삭제메소드
		//1.index로 삭제
//		list.remove(3);
		
		//2. 동등객체로 삭제 : 객체가 가진 값이 동일한 객체 (equals가 동일한 객체)
		list.remove(new Integer(100));
	
		//수정 : 해당인덱스의 객체를 제공된 매개인자로 대체
		list.set(1, 888); //(번지수, 바꿀요소)
		
		//다른 Collection객체 추가
		List<Integer> another = new ArrayList<>();
		another.add(7);
		another.add(8);
		another.add(9);
		list.addAll(another);
		
		//매개인자 요소를 포함하고 있는가(동등객체) :boolean
		System.out.println(list.contains(9));
		
		//매개인자 요소가 몆번지에 있는가 : int
		System.out.println(list.indexOf(9));
		System.out.println(list.indexOf(900)); //-1리턴
		
		//열람: 기존for문, foreach문, iterator방식
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			Integer i = iter.next();
			System.out.println(i);
		}
		//모든 요소 삭제
		list.clear();
		
		//리스트가 비어있는가?
		System.out.println(list.isEmpty());// 비어있으면 true
		
		System.out.println(list); //배열같아보이지만 배열이 아님!
		
	}

	/**test0을 ArrayList버전으로 변경하기
	 * 
	 */
	private void teat3() {
      List<Student> list1 = new ArrayList<Student>();
		
		
		list1.add(new Student (1,"김선호"));
		list1.add(new Student (2,"이현재"));
		list1.add(new Student (3,"조승우"));
		System.out.println(list1);
	
		//1. 학생2명 추가
		list1.add(new Student(4,"김석진"));
		list1.add(new Student(5,"송강"));
		System.out.println(list1);
		
	   //2. 중간의 학생1명 삭제
//		list1.remove(3);
		//객체를 전달해 삭제하려면 전달한 객체와 저장된 객체의 동등성을 인정받아야 한다.
		//두 객체의 equals비교 결과가 true가 나오도록 equals 오버라이딩해야 한다..
		System.out.println(new Student(4, "김석진"). equals (new Student (4, "김석진")));
		
		System.out.println(list1.remove(new Student(4, "김석진")));
	
		System.out.println(new Student(4, "김석진").hashCode());
		System.out.println(new Student(4, "김석진").hashCode());
		
	   //3. 중간에 학생 1명 추가 : new Student(3. "뺑덕어멈");
		list1.add(0,new Student (3, "뺑덕어멈"));
		System.out.println(list1);
		
		for(Student s : list1) {
			System.out.println(s);
		}
	}
	/**
	 * Generics 타입제한
	 * 
	 * 기본형을 사용할 수 없다.
	 * int -> Integer
	 * double -> Double
	 */
	private void test2() {
		List list1 = new ArrayList();
		list1.add("안녕");
		list1.add(123);
		Object e1 = list1.get(0);
		Object e2 = list1.get(1);
		System.out.println(((String)e1).length());
		
		//다형성 적용
		//<String> 타입변수 지정 : 요소의 타입 제한
		List<String> list2 = new ArrayList<String>();
		list2.add("안녕");
//		list2.add(123); // String이 아닌 요소는 추가할 수 없다.
		String s1 = list2.get(0);
		System.out.println(s1.length());
		
		//Wrapper Class
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(31); // 31 -> new Integer(31) ;  auto-boxing 
		int num = list3.get(0); // new Integer(31) - > 31: auto-boxing
	}

	/**
	 * java.util.List 인터페이스
	 * java.util.ArrayList 구현클래스
	 */
	private void test1() {
		ArrayList list1 = new ArrayList();
		List list2 = new ArrayList();
		Collection list3 = new ArrayList();
		
		//맨 마지막에 요소 추가 add
		list1.add("안녕");
		list1.add(123);
		list1.add(123.456);
		list1.add(true);
		list1.add(new Date());
		list1.add(new Student(1,"이도현"));
		list1.add(123);
		
		//toString override되어있음.
		//저장된 순서유지, 중복허용
		System.out.println(list1);
		
		//저장된 요소의 개수
		System.out.println(list1.size());
		
		//삭제 remove
		list1.remove(3);
		
		//중간에 요소 추가 
		list1.add(3, false);
		
		//반복문을 통해 요소에 접근가능 : 인덱스 사용가능
		for(int i = 0; i< list1.size(); i++) {
			System.out.println(i + ":" + list1.get(i));
		}
	}
	/**
	 * 배열의 문제점
	 */
	private void test0() {
		
		Student[] arr = new Student[3];
		arr[0] = new Student(1, "김선호");
		arr[1] = new Student(2, "이현재");
		arr[2] = new Student(3, "조승우");
		
		//1. 학생2명 추가
		Student[] arr2 = new Student[10]; // 메모리 공간 낭비
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		arr2[3] = new Student(4, "김석진");
		arr2[4] = new Student(5, "송강");
		
		//2. 중간의 학생1명 삭제
		//데이터는 중간의 빈자리 없이 관리해야한다.
//		arr2[2] = null;
		arr2[2] = arr2[3];
		arr2[3] = arr2[4];
		arr2[4] = null;
		
		//3. 중간에 학생 1명 추가 : new Student(6. "뺑덕어멈");
		arr2[4] = arr2[3];
		arr2[3] = arr2[2];
		arr2[2] = arr2[1];
		arr2[1] = arr2[0];
		arr2[0] = new Student(6, "뺑덕어멈");
		
		System.out.println(Arrays.toString(arr2));
		
	}
}