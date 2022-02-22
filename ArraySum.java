
public class ArraySum {
	public int sumOfArray (Integer[] a,int index) {
		if(index==0)
			//To return the index of array
			return a[index];
		else
			//To return the sum of the index array and the sumOfarray
			return a[index]+sumOfArray(a, index-1);
		
	}
}
