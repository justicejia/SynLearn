package cn.visionin.test;

class Test{
	public static void main(String[] args){
		

//synchronized 方法加的锁是该方法所在的类的实例对象，静态的对应的是该类。
//一把锁对应的所有方法都不被同时访问，无论是相同的方法还是不同的方法。

//		worker w1=new worker("zhangsan");
//		worker w2=new worker("lisi");
//		w1.start();
//		w2.start();
		
//		SomeThing someThing=new SomeThing();
//		SomeThing st=new SomeThing();
//		Thread t1=new Thread(someThing,"firstThread");
//		Thread t2=new Thread(st,"secondThread");
//		t1.start();
//		t2.start();
		
//		SomeThing someThing=new SomeThing();
//		Thread t1=new Thread(someThing,"firstThread");
//		Thread t2=new Thread(someThing,"secondThread");
//		t1.start();
//		t2.start();
			
//		Lock l1=new Lock();
//		Lock l2=new Lock();
//		new Worker1(l1).start();
//		new Worker2(l1).start();
		
		Lock samelock=new Lock();
		new Worker1(samelock).start();
		new Worker2(samelock).start();
	}
}
