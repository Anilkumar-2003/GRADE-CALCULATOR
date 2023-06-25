import java.util.Scanner;

public class Calculator {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// taking input from the user using the Scanner
		// class
		System.out.print(
			"Enter the marks:");
		int a = sc.nextInt();
		

		
		solve(a);
	}
public static int solve(int a)
{
if (a >= 90 & a <= 100){
   System.out.println ("Your Grade is A");
}
else if (a >= 80 & a < 89){
    System.out.println ("Your Grade is B");
}
else if (a >= 70 & a < 79){
   System.out.println ("Your Grade is C");
}
else if (a >= 60 & a < 69){
   System.out.println ("Your Grade is D");
}
else if (a >= 50 & a < 59){
  System.out.println ("Your Grade is E");
}
else if (a >= 0 & a < 50){
    System.out.println ("Your Grade is F");
}

else{
  System.out.println ("Invalid Input!");
}

		// printing the final result
		System.out.println("Your answer is - " + a);
		return a;
	}
}
