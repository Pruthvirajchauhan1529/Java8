package Task;//- Write a program for Thread with Lambda

// class MyThread  implements Runnable{

// 	public void run(){
// 		for (int i=0; i<10; i++) {
// 			System.out.println("Child Thread");
// 			try{
// 				Thread.sleep(2000);	
// 			}catch(Exception e){
// 				e.printStackTrace();
// 			}	
// 		}
// 	}
// }
public class LambdaThread02{
	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i=0; i<10; i++) {
				System.out.println("Child Thread");
			}
		};
		//MyThread t = new MyThread();
		Thread t = new Thread(r);
		t.start();
		for (int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}
}