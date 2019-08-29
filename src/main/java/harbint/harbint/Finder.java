package harbint.harbint;


public class Finder {
    public Finder() {
        System.out.println("Finder class initialization");
    }
    @SuppressWarnings("unused")
	public Integer findMax(int[] intArray) {
        if(intArray.length == 0) {
            return null;
        }
        if(intArray == null) {
            System.out.println("returned null");
            return null;
        }
        int placeholder = intArray[0];
        for(int i=0;i<intArray.length;i++) {
            if(placeholder < intArray[i]) {
                placeholder = intArray[i];
            }
        }
        return placeholder;
    }//return the max number of the input array. They would also return null in case the input array is null or empty.

    @SuppressWarnings("unused")
	public Integer findMin(int[] intArray) {
        if(intArray.length == 0) {
            return null;
        }
        if(intArray == null) {
            System.out.println("returned null");
            return null;
        }
        int placeholder = intArray[0];
        for(int i=0;i<intArray.length;i++) {
            if(placeholder > intArray[i]) {
                placeholder = intArray[i];
            }
        }
        return placeholder;    } //return the min number of the input array. They would also return null in case the input array is null or empty.
}