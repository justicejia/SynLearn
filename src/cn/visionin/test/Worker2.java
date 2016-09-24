package cn.visionin.test;

public class Worker2 extends Thread {

	Lock lock;
	
	public Worker2(Lock l) {
		// TODO Auto-generated constructor stub
		lock=l;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		lock.add2();
	}
}
