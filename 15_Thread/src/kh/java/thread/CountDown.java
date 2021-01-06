package kh.java.thread;

public class CountDown extends Thread {

	private int num;
	
	public CountDown(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		for(int i = num; i >= 0; i--) {
			System.out.println(i);
//			delay(100);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
//				e.printStackTrace();
				
				break;
			}
		}
		
		System.out.println("[" + Thread.currentThread().getName() + " 종료]");
	}
	
	public void delay(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}