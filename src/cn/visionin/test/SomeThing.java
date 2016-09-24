package cn.visionin.test;

public class SomeThing implements Runnable {

	public synchronized void sys1(){
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("sys1: "+Thread.currentThread().getName()+i);
		}
	}
	
	public synchronized void sys2(){
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("sys2 "+Thread.currentThread().getName()+i);
		}
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		sys1();
//		sys2();
	}

}
