package wk14;

public class WedSearch {

    public static void main(String[] args) {

    }

    public static int binarySearch(int [] a, int search) {
        int start = 0;
        int stop = a.length - 1;
        while(start <= stop) {
            int middle = (start + stop)/2;
            if(a[middle] == search) {
                return middle;
            } else if(search > a[middle]) {
                // search value will be in second half
                start = middle + 1;
            } else {
                // search value will be in first half
                stop = middle - 1;
            }
        }
        return -1;
    }

    public static int findSmallest(int [] a) {
        int smallestValue = a[0];
        for(int i = 1; i < a.length; i++) {
            if(smallestValue > a[i]) {
                smallestValue = a[i];
            }
        }
        return smallestValue;
    }

    public static int searchBackward(int [] a, int search ) {
        for(int i = a.length - 1; i >= 0; i--) {
            if(a[i] == search) {
                return i;
            }
        }
        return -1;
    }
}
