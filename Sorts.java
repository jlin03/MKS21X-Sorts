public class Sorts {
	public static void selectionSort(int[] ary) {
		for(int x = 0; x < ary.length;x++) {
			int min = x;
			for(int i = x; i < ary.length;i++) {
				if(ary[i] < ary[min]) {
					min = i;
				}
			}
			int val = ary[min];
			ary[min] = ary[x];
			ary[x] = val;
		}
	}




}
