import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		Arrays.fill(arr, 5);
		for(int i=1; i*i<=n; i++) {
			arr[i*i] = 1;
		}
		
		for(int i=2; i<=n; i++) {
			for(int j=1; j*j<=i; j++) {
				arr[i] = Math.min(arr[i], arr[i-j*j]+1);
			}
		}
		System.out.println(arr[n]);
	}

}