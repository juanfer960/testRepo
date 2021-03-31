package com.colorChange.test;

import com.colorChange.world.Matrix;

import junit.framework.TestCase;

public class Test extends TestCase{
	
	private Matrix matrix;
	
	public void scenarios() {
		matrix = new Matrix();
	}
	
	public void loadMatrix() {
		assertTrue(matrix.loadMatrix() == true);
	}
	
	public void paintMatrix() {
		assertTrue(matrix.paintMatrix() == true);
	}
	
	public void setColorNode() {
		//assertTrue(matrix.setColorNode(2, 1, 0));
	}
		
}
