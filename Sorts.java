public class Sorts {
	public static void selectionsort(int[] ary) {
		for(int x = 0; x < ary.length;x++) {
			int min = x;
			for(int i = x; i < ary.length;i++) {
				if(ary[i] < ary[min]) {
					min = i;
				}
			}
			int val = ary[min];
			for(int i = min;i > x;i--) {
				ary[i] = ary[i-1];
			}
			ary[x] = val;
		}
	}
	
	
	
	
}
