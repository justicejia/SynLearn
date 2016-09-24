package cn.visionin.test;

public class Worker1 extends Thread {
	Lock lock;
	
	public Worker1(Lock l) {
		// TODO Auto-generated constructor stub
		lock=l;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		lock.add1();
	}
}
