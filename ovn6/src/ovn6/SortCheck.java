package ovn6;

public class SortCheck {
	public static void main(String[] args) {
		int n = 10;
		int[] nbrs = {1, 1, 2, 7, 4, 5, 12, 11, 8, 23};
		int maxVal = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++){
			if(nbrs[i] >= maxVal){
				maxVal = nbrs[i];
			} else {
				System.out.println("Tal nr " + (i+1) + " är fel, dess värde är " + nbrs[i]);
			}
		}
		
		

	}
}
