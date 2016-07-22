package com.week1.day5.assignment1.MethodsAndFlow;

public class MethodsAndFlow {

	private String[] stringArray;
	
	public MethodsAndFlow(String[] stringArray)
	{
		this.stringArray = stringArray;
	}
	
	public void outputSubset(int startPosition, int numberOfValues)
	{
		
		int stopPosition = (startPosition + numberOfValues);
		
		// check that startPosition is valid before proceeding
		if(startPosition < 0 || startPosition > stringArray.length || startPosition > numberOfValues)
		{
			System.out.println("One or more values is invalid.");
		}
		
		else
		{
			
			//ensure that numberOfValues is not greater than length of array
			if(stopPosition > stringArray.length)
			{
				stopPosition = stringArray.length;
			}
			
			//output requested values
			for(int i = startPosition; i < stopPosition; i++)
			{
				System.out.print(stringArray[i] + " ");
			}
			
			System.out.println();
		}
		
	}
	
	public void outputAll(){
		outputSubset(0, stringArray.length);
	}
}
