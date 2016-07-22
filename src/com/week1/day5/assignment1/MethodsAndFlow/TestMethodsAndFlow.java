package com.week1.day5.assignment1.MethodsAndFlow;

public class TestMethodsAndFlow {


		public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
			MethodsAndFlow test1 = new MethodsAndFlow(args);
			
			test1.outputAll();
			
			test1.outputSubset(0, 4);
			
			//testing for incorrect inputs in the 
			// outputSubset method
			test1.outputSubset(-10, 3);
			
			test1.outputSubset(5,  4);
			
			test1.outputSubset(0, 30);
		}

}
