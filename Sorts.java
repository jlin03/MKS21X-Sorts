public class Sorts {
	/**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
	public static void selectionSort(int[] data) {
		if(data.length > 0) {
			for(int l = 0; l < data.length;l++) {
				int min = l;
				for(int i = l; i < data.length;i++) {
					if(data[i] < data[min]) {
						min = i;
					}
				}
				int val = data[min];
				data[min] = data[l];
				data[l] = val;
			}
		}
	}

	/**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
		if(data.length > 0) {
			boolean recip = true;
			boolean allT = false;
			int l = 0;
			while(recip) {
				allT = true; //assume the array is already sorted
				for(int i = 0; i < data.length - 1 - l;i++) {
					if(data[i] > data[i+1]) {
						int temp = data[i];
						data[i] = data[i+1];
						data[i+1] = temp;
						allT = false;						//if the array isn't fully sorted, keep the loop
					}
				}

				if(!allT) {				//if the array is already sorted stop looping
					recip = true;
				}
				else {
					recip = false;
				}

				l++;
			}
		}
	}


	public static void insertionSort(int[] data) {
		int pos;
		int val;
		for(int i = 0; i < data.length;i++) {
			for(int index = i-1; data[index] < data[i] || i < 0; index--) {
				pos = index;
			}
			val = data[i];
			for(int shift = pos + 1; shift <= i;shift++) {
				data[shift] = data[shift - 1];
			}
			data[pos] = val;
		}
	}




}
