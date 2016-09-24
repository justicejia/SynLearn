package cn.visionin.test;

public class Lock {
	public synchronized void add1(){
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"  add1: "+i);
		}
	}
	
	public synchronized void add2(){
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"  add2 : "+i);
		}
	}

}
