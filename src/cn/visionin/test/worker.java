package cn.visionin.test;
public class worker extends Thread {
	String name;
	static int id=0;
	static Object lock=new Object();
	public worker(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	public synchronized void add(){
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+' '+i);
		}
	}
	
	public synchronized static void staticAdd(){
		for(int i=0;i<10;i++){
			try {
				currentThread().sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("static: "+i);
		}
		
	} 
	
	Lock lock1=new Lock();
	Lock lock2=new Lock();

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		synchronized (worker.class) {
//			for(int i=0;i<15;i++){
//				System.out.println(name+' '+i);
//			}
//		}
//		add();
//		staticAdd();


		


	}
}
