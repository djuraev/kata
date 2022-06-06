package utils;

public class Util {
    //
    public static Object[] resizeArray(Object[] array, int resizingFactor) {
        //
        int currentLength = array.length;
        Object[] newArray = new Object[currentLength * resizingFactor];
        for (int index=0; index <currentLength; index++) {
            newArray[index] = array[index];
        }
        return newArray;
    }
}
