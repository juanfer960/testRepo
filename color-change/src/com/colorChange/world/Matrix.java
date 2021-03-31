package com.colorChange.world;

import com.colorChanges.entity.Node;

public class Matrix {
	
	private  Node [][] matrix;
	
	private boolean acctionAbove;
	private boolean acctionDown;
	private boolean acctionLeft;
	private boolean acctionRight;
	
	public Matrix() {
		matrix = new Node[10][10];
	}
	

    public boolean loadMatrix() {
    		
    	for (int x=0; x < matrix.length; x++) {
			//System.out.println("");
			for (int y=0; y < matrix[x].length; y++) {
				matrix[x][y] = loadNode(x,y);
			    //System.out.print("["+matrix[x][y].getColor()+"]");
			 }
		}
    	
    	return true;
    }
    
    public Node loadNode(int x, int y) {
    	
    	Node node = new Node();
    	
    	node.setColor((int) Math.floor(Math.random()*5+1));
    	
    	node.setCoordinateX(x);
    	node.setCoordinateY(y);
    	
    	//System.out.print(matrix[x][y].getColor());
    	
    	return node;
    }
    
    public boolean paintMatrix() {
  
    	for (int x=0; x < matrix.length; x++) {
			System.out.println("");
			for (int y=0; y < matrix[x].length; y++) {
			    System.out.print("["+matrix[x][y].getColor()+"]");
			 }
		}
    	
    	return true;
    	
    }
    
    public void setColorNode(int x, int y, int color) throws Exception {
    	
    	if(color < 0 || color > 4){
    		throw new Exception("Wrong input parameter");
    	}
    	
    	try {
    		matrix[x][y].setColor(color);
    		//matrix[3][1].setColor(color);
    		//matrix[1][1].setColor(color);
    		//matrix[2][0].setColor(color);
    		//matrix[2][2].setColor(color);
    	}
    	catch(IndexOutOfBoundsException e)
    	{
    		//System.out.print("");
    	}
    	
    	
    	if(acctionAbove==false) {
    		x = x + 1;
    		acctionAbove = true;
    		setColorNode(x, y,color);
    	}
    	
    	if(acctionDown==false) {
    		x = x - 2;
    		acctionDown = true;
    		setColorNode(x, y,color);
    	}
    	
    	if(acctionLeft==false) {
    		x = x + 1;
    		y = y + 1;
    		acctionLeft = true;
    		setColorNode(x, y,color);
    	}
    	
    	if(acctionRight==false) {
    		y = y - 2;
    		acctionRight = true;
    		setColorNode(x, y,color);
    	}
    	
    }

}






