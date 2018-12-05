public class Sorts {
	public static void selectionsort(int[] ary) {
		for(int x = 0; x < ary.length;x++) {
			int min = 0;
			for(int i = 0; i < ary.length;i++) {
				if(ary[i] < ary[min]) {
					min = i;
				}
			}
			int val = ary[min];
			for(int i = min;i >= 0;i++) {
				ary[i] = ary[i-1];
			}
			ary[0] = val;
		}
	}
	
	
	
	
}
