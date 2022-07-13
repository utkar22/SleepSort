import java.util.Scanner;

public class SleepSort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Size of Array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int min = 0;
		int max = 0;
		
		for (int i = 0; i<n; i++) {
			System.out.print("\nNext Element: ");
			int x = sc.nextInt();
			arr[i] = x;
			
			if (x<min) {
				min = x;
			}
			else if (x>max) {
				max = x;
			}
		}
		
		System.out.println("Sorting....");
		
		int offset = 1000+n+(0-min);
		
		Thread[] t_arr = new Thread[n];
		
		for (int i = 0; i<n; i++) {
			Thread t = new Sleeper(arr[i],offset);
			t.start();
			t_arr[i] = t;
		}
		
		Thread.sleep(offset+max+1000);
		
		for (int i = 0; i<n; i++) {
			t_arr[i].join();
		}
	}

}
