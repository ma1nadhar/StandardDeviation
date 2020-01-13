import java.util.Scanner;

public class StandardDiveation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		double mean = 0.0;
		//1 -2 4 -4 9 -6 16 -8 25 -10
		Scanner console = new Scanner(System.in);
		int count = console.nextInt();
		int[] myArry = new int[count];
		for(int i = 0;i<myArry.length; i++) {
			myArry[i] = console.nextInt();
			sum += myArry[i];
		}
		//System.out.println("sum:"+sum);
		mean = sum/myArry.length;
		//System.out.println("mean:"+mean);
		sum = 0;
		for(int i = 0;i<myArry.length; i++) {
			sum += Math.pow((myArry[i] - mean), 2);
		}
		//System.out.println("sum:"+sum);
		mean = sum/(myArry.length-1);
		//System.out.println("mean:"+mean);
		
		double result = Math.sqrt(mean);
		
		System.out.println("Please enter the integer array dimension:");
		System.out.println("Please enter the array elements:");
		System.out.println("Standard deviation = "+String.format("%.5g%n", result));
		
		console.close();
		
	}

}
