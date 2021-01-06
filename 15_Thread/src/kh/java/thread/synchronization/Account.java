package kh.java.thread.synchronization;

public class Account {

	
		private int balance;
		
		public Account(int balance){
			this.balance = balance;
		}
		
		//출금 메소드 : atm기는 이 메소드를 통해 출금 가능
		/*
		 * 동기화 처리
		 * 결국 객체 단위로 동기화 처리 : account객체를 임계영역으로 설정하게 된다.
		 * 1.synchronized 메소드 만들기
		 * 2. synchronized  block 사용하기 (추천)
		 */
		
		public void withdraw(int money) {
			
			String threadname = Thread.currentThread().getName();
			//this는 현재 객체
			synchronized (this) {System.out.println("[" + threadname + " -> 현재잔액 : " + balance + "원 ]");
			
			if(money<=balance) {
				balance -= money;
				System.out.println("[" + threadname + ">> 출금 : " + money + "원, 잔액 : " + balance + "원 ]");
				System.out.println(threadname + "잔액이 부족합니다.");
			}else {
				
				System.out.println("[" + threadname + " -> 현재잔액 : " + money + ",잔액이 부족합니다.]");
				
			}
			
			
		}
	}

		public int getBalance() {
			
			return balance;
		}
		}
	

