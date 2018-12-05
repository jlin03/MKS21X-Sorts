public class Sorts {
	public static void selectionsort(int[] ary) {
		int min = 0;
		for(int i = 0; i < ary.length;i++) {
			if(ary[i] < ary[min]) {
				min = i;
			}
		}
		for(int i = min;i >= 0;i++) {
			ary[i] = ary[i-1];
		}
		
		
	}
	
	
	
	
}
