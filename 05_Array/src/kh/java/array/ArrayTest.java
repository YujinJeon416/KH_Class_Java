package kh.java.array;

public class ArrayTest {

	 public static void main(String[] args) {
		 ArrayTest a= new ArrayTest();
//		 a.test0();
//		 a.test1();
//		 a.test2();
//		 a.test3();
//		 a.test4();
//		 a.test5();
//		 a.test6();
		 a.test7();
		 
	 }
	 
	 /**
	  * 배열의 특징
	  *  - 배열의 길이는 변경할 수 없다.
	  */
	 public void test7() {
		 int[] arr = new int[10];
		 System.out.println(arr.length);
		 
		 //hashCode 비교 : 객체 주소값에 접근할 수 있는 key값
		 System.out.println(arr.hashCode());
		 
		 //toString : 객체를 문자열 정보로 표현
		 System.out.println(arr);//[I@2a139a55 출력됨
		 System.out.println(arr.toString());//윗줄과 같은 결과가 나온다.
		 
		 arr = new int[7];
		 System.out.println(arr.length);
		 System.out.println(arr.hashCode());
		 System.out.println(arr);
		 System.out.println(arr.toString());
		 
		 //참조형 변수의 기본값 null
		 arr = null; //삭제하는것! 
		 
//		 System.out.println(arr.length); // null로 삭제했기때문에 에러남 
//		System.out.println(arr[0]); // 이것도 에러! NullPointerException
	 }
	 
	 /**
	  * String[]
	  */
	 public void test6() {
//		 String[] nameArr = new String[3];
//		 nameArr[0] = "홍길동";
//		 nameArr[1] = "신사임당";
//		 nameArr[2] = "장영실";
		 String[] nameArr = {"홍길동", "신사임당", "장영실"}; //위의 네줄을 한줄로!
		 
		 for(int i = 0; i < nameArr.length; i++) {
			 System.out.println(nameArr[i]);
		 }
	 }
	 /**
	  * @실습문제 : 알파벳 소문자가 담긴 char배열을 생성하고 출력하세요.
	  * a, b, c, d, e, f, g, .....x, y, z 
	  */
	 
	 public void test5() {
		 char[] abc = new char[26];
		 for(int i = 0 ; i<abc.length;i++) {
				abc[i] = (char)('a'+ i);
				System.out.print(abc[i]);
				System.out.print(i != abc.length -1 ? ", " : "");
			}

		
		 
	 }
	 /**
	  * 배열의 요소에 담긴 값에 규칙이 있다면, 값 대입시에 반복문을 사용할 수 있다.
	  * 
	  * {1,2,3,4,5}
	  * {'a','b','c'}
	  * {2,4,6,8,10}
	  * 
	  */
	 //1부터 100까지
	 public void test4() {
		int[] arr = new int[100];
//		arr[0] = 1;
//		arr[1] = 2;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i + 1; //101부터 200까지는 1만 101로 고치면 된다.
		}
		//값 출력
		for(int i = 0; i< arr.length; i++) {
			System.out.printf("arr[%d] = %d%n", i, arr[i]);
		}
	 }
	 /**
	  * 초기화
	  * 배열 변수 선언 + 배열 할당(heap) + 인덱스별 값 대입
	  */
	 public void test3() {
		 char[] charr = {'a', 'b', 'c'}; //이게 제일 좋다.
		// char[] charr = new char[] {'a','b','c'}; //위 아래랑 같은 뜻
		 
//		 char[] charr;
//		 charr = new char[3];
//		 charr[0] = 'a';
//		 charr[1] = 'b';
//		 charr[2] = 'c';
		 
	 }
	 
	 public void test2() {
		 //배열 선언
//		 double[] arr; //int long double char
		 
		 //배열 할당 : heap영역에 배열 객체를 생성하고, 주소값을 arr에 대입
//		 arr = new double[3];
		 
		 double[] arr = new double[3]; 
		 //배열 요소(각 인덱스)에 값 대입
		 arr[0] = 1.1;
		 arr[1] = 2.2;
		 arr[2] = 3.3;//배열 마지막 인덱스 : arr.length -1
//		 arr[3] = 4.4;
		 for(int i = 0; i<arr.length; i++) {
			 System.out.println(arr[i]);
		 }
	 }
	 
	 /**
	  * 배열: 동일한 자료형의 값이 여러개인 경우
	  */
	 public void test1() {
		 //1.배열 선언
		 int[] arr;
//		 int arr[]; // 둘다 가능하지만 자바에서는 위의 것을 더 선호 
		 
		 //2. 배열 할당: 배열 길이를 반드시 지정할 것.
		 //메모리 heap영역에 int값을 담을 수 있는 공간 할당.
		 //배열은 각 타입별 초기값으로 미리 처리됨.
		 //기본형- int 0, double 0.0, char ' '(공란), boolean false
		 //참조형- null (값 없음)
		 arr = new int[5];
		 
		 
		 //배열 각 번지수 참조
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println(arr[2]);
		 System.out.println(arr[3]);
		 System.out.println(arr[4]);
		 
		 
		 //3. 배열 각 번지에 값 대입
		 arr[0] = 80;
		 arr[1] = 70;
		 arr[2] = 90;
		 arr[3] = 75;
		 arr[4] = 43;
		 
		 //초기화
		 int[] intarr = new int[] {80,70,90,75,43};
		 
		 System.out.println("========================");
//		 System.out.println(arr[0]);
//		 System.out.println(arr[1]);
//		 System.out.println(arr[2]);
//		 System.out.println(arr[3]);
//		 System.out.println(arr[4]);
		 for(int i = 0; i< 5; i ++) {
			 System.out.println(arr[i]);
		 }
		 System.out.println("========================");
		 //4.총점, 평균
//		 int total = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
		 
		 //반복문을 이용해 점수배열의 총점 구하기
		 int total = 0;
		 //의미를 찾기 힘든 magic number대신 변수, 상수를 사용하자.
		 for (int i = 0; i < arr.length; i++) {
				total += arr[i];
			}
		 System.out.println("총점 = " + total);
		 
		 //평균 구하기
		 double avg =(double)total/arr.length;
		 System.out.println("평균=" + avg);

		 
//		 double avg = (double)total / 5;//(5 =arr.length;)
//		 System.out.printf("총점 : %d점, 평균 : %.2f%n", total, avg);
		 
	 }
	 
	 public void test0() {
		 //동일한 자료형을 가진 여러 값
		 int kor = 80;
		 int math = 70;
		 int eng = 90;
		 int society = 75;
		 int science = 45;
		 
		 //총점, 평균
		 int total = kor + math + eng + society + science;
		 double avg = (double)total / 5;
		 
		 System.out.printf("총점 : %d점, 평균 : %.2f%n", total, avg);
	 }
}


