public class Solution<T> {
    public void reverseArray(T[] arr){
        for(int i = 0, j = arr.length - 1; i < j; i++, j--){
            T temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}