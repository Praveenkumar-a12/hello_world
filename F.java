
public class F {
	
	public static int factorial (int N) {
		if(N<=1)
			return 1;
		else return(N * factorial(N-1));
	}

	public static void main(String[] args) {
		
		System.out.println(factorial(4));
		System.out.println(factorial(5));
		System.out.println(factorial(6));

	}

}
