package BasicPattern;

public class Sandglass_Alphabetic_Pattern {

	public static void main(String[] args) {
		for(int i = 0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<4-i;j++) {
				System.out.print((char)(65+j)+" ");
			}
			
			System.out.println();

		}
		for(int i = 0;i<4;i++) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print((char)(65+j)+" ");
			}
			
			System.out.println();

		}

	}

}
