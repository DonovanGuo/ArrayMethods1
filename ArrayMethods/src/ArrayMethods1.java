
public class ArrayMethods1 
{
	public static void swap (String[]arr, int mama, int mio )
	{
		String store = arr[mama];
		arr[mama]= arr[mio];
		store = arr[mio];
	}
	
	
	public static void bubbleSort(String[]list1)
	{
		int swapnum = 1;
		while(swapnum != 0)
		{
			swapnum = 0;
			for (int i = 0; i < list1.length; i++ )
			{
				if ((list1[i].compareTo(list1[i+1])>0))
				{
					swap( list1 , i , i+1);
					swapnum = 1;
				}
				if ((list1[i].compareTo(list1[i+1])<0))
				{
					swapnum = swapnum + 0;
				}
				if ((list1[i].compareTo(list1[i+1]) == 0 ))
				{
					swapnum = swapnum + 0;
				}
			}
		}
	}
	public static void selectionSort(String[]list1)
	{
		
	}
















}
