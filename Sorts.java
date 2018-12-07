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
			for(int l = 0; l < data.length;l++) {
				for(int i = 0; i < data.length - 2 - l;i++) {
					if(data[i] > data[i+1]) {
						int temp = data[i];
						data[i] = data[i+1];
						data[i+1] = temp;
					}
				}
			}
		}
	}




}
