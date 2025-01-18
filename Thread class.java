class Mythread extends Thread{
public void run(){
	for(int i=1;i<=5;i++){
		System.out.println("Thread using Thread class:"+i);
	try{
		Thread.sleep(500);
	}
	catch(InterruptedException e){
	System.out.println(e.getMessage());
	}
	}
	}
}

public class ThreadClassDemo{
	public static void main(String[] args){
		Mythread t =new Mythread();
		t.start();
	}
}
