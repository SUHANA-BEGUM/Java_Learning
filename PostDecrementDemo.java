import java.util.*;
import java.lang.*;
import java.io.*;

class PostDecrementDemo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int battery = 80;
		System.out.println("Battery before Post Decrement: " + battery);
		int decrement = battery--;
		System.out.println("Battery after Post Decrement: "+ battery);
	}
}
