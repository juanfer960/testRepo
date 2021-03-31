package com.colorChange.main;

import com.colorChange.world.Matrix;

public class mainControl{
	
	public static void main(String [] args) throws Exception {
		
		Matrix matrix = new Matrix();
		
		matrix.loadMatrix();
		
		matrix.paintMatrix();
		
		System.out.println("");
		System.out.println("*******************************");
		System.out.print("");
		System.out.println("*******************************");
		
		matrix.setColorNode(2, 1, 0);
		
		matrix.paintMatrix();
	}

}
