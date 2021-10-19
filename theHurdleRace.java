package theHurdleRace;
import java.util.*;

public class theHurdleRace {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Hurdle Number: ");
		int i = sc.nextInt();
		int[] array = new int[i];  
		System.out.println("Enter Hurdle Heights: ");  
		for(int j=0; j<i; j++)  
		{   
			array[j]=sc.nextInt();  
		}  
		System.out.print("Enter jump height: ");
		int jump = sc.nextInt();
		
		Arrays.sort(array);
		
		System.out.println(array[i-1]-jump);

	}
}
