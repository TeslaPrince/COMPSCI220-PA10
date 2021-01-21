package PA10;
public class BinarySearch {
	public static int binarySearch(String[] strings, String key) { // complete this method
		int left = 0;
		int right = strings.length-1;
		int index = -1;
		if(strings[left].compareTo(strings[right]) > 0) {
			index = binarySearchReverse(strings, left, right, key);
		}
		else if (strings[left].compareTo(strings[right]) < 0) {
			index = binarySearchForward(strings, left, right, key);
		}
		return index;
	}
	private static int binarySearchForward(String[] strings, int left, int right, String key) { // complete this method
		if (left <= right) {
            int mid = (left + right) / 2;
            if (strings[mid].compareTo(key) < 0) {
            	return binarySearchForward(strings, mid + 1, right, key);
            }
            else if (strings[mid].compareTo(key) > 0) {
            	return binarySearchForward(strings, left, mid- 1, key);
            }
            else {
                return mid;
            }
        }
        return -1;
    }
	private static int binarySearchReverse(String[] strings, int left, int right, String key) { // complete this method
		if (left <= right) {
            int mid = (left + right) / 2;
            if (strings[mid].compareTo(key) < 0) {
            	return binarySearchReverse(strings, left , mid - 1, key);
            }
            else if (strings[mid].compareTo(key) > 0) {
            	return binarySearchReverse(strings, mid + 1,right , key);
            }
            else {
                return mid;
            }
        }
        return -1;
	    }
	}