import java.util.Arrays;

//Donovan Guo	2/1/2018
public class ArrayMethods1 
{
	public static void swapString (String[]arr, int mama, int mio )
	{
		String store = arr[mama];
		arr[mama]= arr[mio];
		store = arr[mio];
	}
	
	public static void swapDouble (double[]arr, int mama, int mio )
	{
		double store = arr[mama];
		arr[mama]= arr[mio];
		store = arr[mio];
	}
	
	public static void swapInt ( int[]arr, int mama, int mio )
	{
		int store = arr[mama];
		arr[mama]= arr[mio];
		store = arr[mio];
	}
	
	
	public static void bubbleSort(String[]list1)
	{
		int swapnum = 1;
		int combthrough = list1.length-1;
		while(swapnum != 0)
		{
			swapnum = 0;
			for (int i = 0; i < combthrough; i++ )
			{
				if ((list1[i].compareTo(list1[i+1])>0))
				{
					swapString( list1 , i , i+1);
					swapnum ++;
				}
				combthrough--;
			}
			
		}
	}
	
	
	public static void selectionSort(double[]list1)
	{
		for(int i = 1; i< list1.length-1;i++)
		{
			int mindex = i;
			for( int j = i+1; j < list1.length; j++)
			{
				if(list1[j] < list1[mindex])
				{
					mindex = j;
				}
			}
			swapDouble(list1,i,mindex);
		}
	}
	public static void insertionSort(int[]arr)
	{
		for(int i = 2; i < arr.length; i++)
		{
			int j = i;
			while((j> 1) && (arr[j-1] > arr[j]))
			{
				swapInt(arr,j,j-1);
				j= j-1;
			}
		}
	}
	public static void main(String[]args)
	{
	int[]test1 = {1,4,4,5,2,4,3,17,0};
	double[]test2 = {1.1, 4.1 , 4.2 , 5.0 , 2.0 , 4.0 , 3.0 , 17.0 , 0.0};
	String[]test3 = {"zebra","tortilla","abba","foo","bar","aba"};
	
	insertionSort(test1);
	System.out.println(Arrays.toString(test1));
	selectionSort(test2);
	System.out.println(Arrays.toString(test2));
	bubbleSort(test3);
	System.out.println(Arrays.toString(test3));
	
	}
















}
