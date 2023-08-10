package BasicPattern;

public class Right_Alphabet_Triangle {
	
	
	public static void main(String[] args) {
		int a=65;
		char ch= (char)(a+12);
		System.out.println("The character is "+ch);
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(a+j)+" ");
			}
			System.out.println();
		}

	}

}
