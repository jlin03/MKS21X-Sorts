public class Sorts {
	public static void selectionsort(int[] ary) {
		int min = 0;
		min = ary[0];
		for(int i = 0; i < ary.length;i++) {
			if(ary[i] < min) {
				min = ary[i];
			}
		}
	}
	
	
	
	
}
