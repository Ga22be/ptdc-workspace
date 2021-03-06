public class SameSort {
	public SameSort() {

	}

	public static int[] merge(int[] v1, int[] v2) {
		int[] result = new int[v1.length + v2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (k < v1.length + v2.length) {
			if (i < v1.length && j < v2.length) {
				if (v1[i] <= v2[j]) {
					result[k] = v1[i++];
				} else {
					result[k] = v2[j++];
				}
			} else if(i >= v1.length) {
				result[k] = v2[j];
			} else {
				result[k] = v1[i];
			}
			k++;
		}

		return result;
	}

}
