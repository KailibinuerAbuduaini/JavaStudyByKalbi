package Day027_two_dimentional_array;

import java.util.Arrays;

public class Array_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// toString()
		
				int[] nums= {43,12,4,1,3,5};
				
				System.out.println(Arrays.toString(nums));
				
				// equals
				
				int[] nums1= {4,5,6,10,100};
				int[] nums2= {4,5,6,10,100};
				
				System.out.println(Arrays.equals(nums1, nums2));
				
				// sort()  : sorts array in ascending order
				
				Arrays.sort(nums);
				System.out.println(Arrays.toString(nums));
				
				String[] languages= {"Spanish", "Italian", "English", "Arabic"};
				
				Arrays.sort(languages);
				System.out.println(Arrays.toString(languages));  // if there is number or special character $ ... it will sorted frst
				
				
				// binarySearch()
				
				int[] numX= {4,6,7,10,55};
				
				System.out.println(Arrays.binarySearch(numX, 7));
                System.out.println(Arrays.binarySearch(numX, 5));//-2 //(-(-insertionPoint)-1
				System.out.println(Arrays.binarySearch(numX, 55));
				
				//copyOf()

				double[] d1= {2,3,4,5,12,4};
				double[] d2=d1;
				System.out.println();

				


	}

}
