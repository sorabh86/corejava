package com.github.sorabh86.programs.basic;

public class StarPatternMain {
	
	public static void main(String[] args) {
		rightTriangle(6);
		leftTriangle(6);
		pyramind(6);
		diamond(15);
		downwardTriangle(6);
		mirrorRightTriangle(6);
		reversePyramind(6);
		rightDownMirror(6);
		rightPascalTriangle(6);
		leftPascalTriangle(6);		
		sandglass(6);
		alphabetStar(8);
		triangleStar(9);
		downTriangleStar(9);
		diamondStarHolo(9);
	}
	
	static void diamondStarHolo(int row) {
		System.out.println("--- Diamond Star Holo---");
		
		// triangleStar holo
		for(int i=1; i<row; i++) {
			
			int j;
			for(j=i; j<row; j++)
				System.out.print(" ");
					
			for(j=1; j<=2*i-1; j++)
				if(j==1 || j==2*i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			
			System.out.println();
		}
		
		// downTrangleStar holo
		for(int i=row; i>0; i--) {
			
			int j;
			for(j=i; j<row; j++)
				System.out.print(" ");
					
			for(j=1; j<=2*i-1; j++)
				if(j==1 || j==2*i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			
			System.out.println();
		}
		
	}

	static void downTriangleStar(int row) {
		System.out.println("---Down Triangle Star---");
		
		for(int i=row; i>0; i--) {
			
			int j;
			for(j=i; j<row; j++)
				System.out.print(" ");
			
			for(j=1; j<=2*i-1; j++) {
				if(j==1 || i==row || j==(2*i)-1)				
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
	}

	static void triangleStar(int row) {
		System.out.println("---Triangle Star---");
		
		for(int i=1; i<=row; i++) {
			
			int j;
			for(j=i; j<row; j++)
				System.out.print(" ");
			
			for(j=1; j<=(2*i)-1; j++) {
				if(j==1 || i==row || j==(2*i)-1)
					System.out.print("*");
				else
					System.out.print(" ");
					
			}
			System.out.println();
		}
	}

	static void alphabetStar(int row) {
		System.out.println("-------- Alphabet Star Pattern:");
		
		for(int i=0; i<=row; i++) {
			
			for(int j=0; j<=row/2; j++) {
				
				if((j==0 || j==row/2) && (i!=0 || i!=row/2) || (i==0 && j!=row/2) || i==row/2)
					System.out.print("*");
				else
					System.out.print(" ");
					
			}
			
			System.out.println();
		}
	}

	private static void sandglass(int row) {
		System.out.println("-------- Sandglass Pattern:");
		
		// invert pyramind
		for(int i=row; i>=0; i--) {
			
			int j;
			for(j=row-i; j>0; j--)
				System.out.print(" ");
			
			for(j=i; j>=0; j--) 
				System.out.print("* ");
			
			System.out.println();
		}
		
		// pyramind
		for(int i=0; i<=row; i++) {
			
			int j;
			for(j=row-i; j>0; j--)
				System.out.print(" ");
			
			for(j=i; j>=0; j--) 
				System.out.print("* ");
			
			System.out.println();
		}
	}

	static void rightTriangle(int row) {
		System.out.println("-------- Right Triangle Pattern:");
		for(int i=0; i<row; i++) {
			for(int j=0; j<=i; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
	
	static void leftTriangle(int row) {
		System.out.println("-------- Left Triangle Pattern:");
		for(int i=0; i<row; i++) {
			int j;
			//print space
			for(j=2*(row-i); j>=0; j--) 
				System.out.print(" ");
			
			// print star's
			for(j=0; j<=i; j++)
				System.out.print("* ");
			
			System.out.println();
		}
	}
	static void pyramind(int row) {
		System.out.println("-------- Pyramind Pattern:");
		for(int i=0; i<row; i++) {
			int j;
			for(j=(row-i); j>1; j--)
				System.out.print(" ");
			for(j=0; j<=i; j++)
				System.out.print("* ");
			
			System.out.println();
		}
	}
	static void diamond(int row) {
		System.out.println("-------- Diamond Pattern:");
		
		// upper pyramind
		for(int i=1, s=row; i<=row-1; i++) {
			
			int j;
			for(j=1; j<=s; j++)
				System.out.print(" ");
			s--;
			
			for(j=1; j <= (i-1); j++)
				System.out.print("* ");
			
			System.out.println();
		}
		
		// lower inverted pyramind
		for(int i=1, s=1; i<=row; i++) {
			
			int j;
			for(j=1; j<=s; j++)
				System.out.print(" ");
			s++;
			
			for(j=1; j<=(row-i); j++)
				System.out.print("* ");
			
			System.out.println();
			
		}
	}
	
	static void downwardTriangle(int row) {
		System.out.println("Downward Triangle:");
		
		for(int i=row; i>=0; i--) {
			for(int j=0; j<=i; j++)
				System.out.print("* ");
			
			System.out.println();
		}
	}
	
	static  void mirrorRightTriangle(int row) {
		System.out.println("Mirror Right Triangle:");
		
		for(int i=0; i<=row; i++) {
			
			int j;
			for(j=0; j<=2*(row-i)+20; j++) {
				System.out.print(" ");
			}
			
			for(j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void reversePyramind(int row) {
		System.out.println("Reverse Pyramid:");
		
		for(int i=row; i>=1; i--) {
			
			int j;
			for(j=row; j>i; j--)
				System.out.print(" ");
			
			for(j=1; j<=i; j++)
				System.out.print("* ");
			
			System.out.println();
		}
	}
	
	static void rightDownMirror(int row) {
		System.out.println("Right Down Mirror:");
		
		for(int i=row; i>=1; i--) {
			
			int j;
			for(j=2*(row-i); j>0; j--)
				System.out.print(" ");
			
			for(j=1; j<=i; j++)
				System.out.print("* ");
			
			System.out.println();
		}
	}
	
	static void rightPascalTriangle(int row) {
		System.out.println("Right Pascal's Triangle:");
		
		// right triangle
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++)
				System.out.print("* ");
			
			System.out.println();
		}
		
		// downard triagle
		for(int i=row; i>0; i--) {
			for(int j=1; j<=i-1; j++)
				System.out.print("* ");
			
			System.out.println();
		}
		
	}
	static void leftPascalTriangle(int row) {
		System.out.println("Left Pascal's Triangle:");
		
		// right triangle
		for(int i=1; i<=row; i++) {
			
			int j;
			for(j=1; j<=2*(row-i); j++)
				System.out.print(" ");
			
			for(j=1; j<=i; j++)
				System.out.print("* ");
			
			System.out.println();
		}
		
		// downard triagle
		for(int i=row-1; i>=0; i--) { 
			
			int j;
			for(j=1; j<=2*(row-i); j++)
				System.out.print(" ");
			
			for(j=1; j<=i; j++) 
				System.out.print("* ");
			System.out.println(); 
		}
	}
	
	
}
