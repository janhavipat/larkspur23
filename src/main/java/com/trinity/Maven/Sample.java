package com.trinity.Maven;

import java.util.Iterator;

public class Sample {
	private void drowStarPattern(int rows) {
for (int lines = 0; lines < rows; lines++) {
	for (int space = rows; space>=lines; space--) {
		System.out.print(" ");
	}
		for (int ast = 0; ast <= lines; ast++) {
			System.out.print("* ");
			
		}
		System.out.println();
	
}
	}
public static void main(String[] args) {
	Sample s= new Sample();
	s.drowStarPattern(6);
}
}
