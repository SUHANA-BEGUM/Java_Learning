import java.util.*;
import java.lang.*;
import java.io.*;

class PreDecrementDemo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int initialBoxes = 40, groupSize = 5;
		int updatedStock = --initialBoxes;
		int groups = updatedStock / groupSize;
		System.out.println("Initial Stock is: " + initialBoxes);
		System.out.println("Group Size is: " + groupSize);
		System.out.println("updatedStock is: "+ updatedStock);
		System.out.println("Full Groups: " + groups);
	}
}
