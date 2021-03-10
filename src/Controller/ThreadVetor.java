package Controller;

public class ThreadVetor extends Thread {
	private int num;
	private int[] array;
	public ThreadVetor(int num, int[]array) {
		this.array = array;
		this.num = num;
	}
	@Override
	public void run() {
		if (num%2 == 0) {
			double time1 = System.nanoTime();
			for (int i = 0; i < array.length; i++) {
				
			}
			double time2 = System.nanoTime();
			System.out.println((time2 - time1)/Math.pow(10, 9));
		}else{
			double time1 = System.nanoTime();
			for (int i : array) {
				
			}
			double time2 = System.nanoTime();
			System.out.println((time2 - time1)/Math.pow(10, 9));
		}
	}
}
