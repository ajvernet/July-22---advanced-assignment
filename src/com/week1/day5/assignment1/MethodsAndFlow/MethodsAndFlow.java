package com.week1.day5.assignment1.MethodsAndFlow;

public class MethodsAndFlow {

	private String[] stringArray;
	
	public MethodsAndFlow(String[] stringArray)
	{
		this.stringArray = stringArray;
	}
	
	public void outputSubset(int startPosition, int numberOfValues)
	{
		
		// check that startPosition is valid before proceeding
		if(startPosition < 0 || startPosition > stringArray.length || startPosition > numberOfValues)
		{
			System.out.println("One or more values is invalid.");
		}
		
		else
		{
			
			//ensure that numberOfValues is not greater than length of array
			if(numberOfValues > stringArray.length)
			{
				numberOfValues = stringArray.length;
			}
			
			//output requested values
			for(int i = startPosition; i < numberOfValues; i++)
			{
				System.out.println(stringArray[i]);
			}
		}
		
	}
	
	public void outputAll(){
		outputSubset(0, stringArray.length);
	}
}
