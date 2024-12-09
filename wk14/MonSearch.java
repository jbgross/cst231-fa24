package wk14;

public class MonSearch {
    public static void main(String[] args) {
        int [] a = {5, 6, 2, 11, -17, 42, 0};
        System.out.println(searchBoolean(a, 11));
        System.out.println(searchLocation(a, 11));
        System.out.println(searchBoolean(a, 25));
        System.out.println(searchLocation(a, 25));
        String [] words = {"hello", "hola", "ciao"};
        System.out.println(search(words, "hola"));
        System.out.println(search(words, "Hola"));
    }


    public static int search(String [] data, String search) {
        // iterate over each element of data[]
        for(int i = 0; i < data.length; i++) {
            // is data[i] the string I'm looking for
            if(data[i].equals(search)) {
                 return i;
            }
        }
        return -1;
    }

    public static int searchLocation(int [] data, int search) {
        for(int i = 0; i < data.length; i++) {
            // is data[i] the value that I'm searching for
            if(data[i] == search) {
                return i;
            }
        }
        // after loop, we know that search is not in data[]
        return -1;
    }

    public static boolean slowSearch(int [] data, int search) {
        boolean isFound = false;
        for(int i = 0; i < data.length; i++) {
            if(data[i] == search) {
                isFound = true;
            }
        }
        return isFound;
    }
    public static boolean searchBoolean(int [] data, int search) {
        for(int i = 0; i < data.length; i++) {
//            return data[i] == search;
//            if(data[i] == search) {
//                return true;
//            } else {
//                return false;
//            }
            if(data[i] == search) {
                return true;
            }
        }
        // after the loop
        return false;
    }
}
