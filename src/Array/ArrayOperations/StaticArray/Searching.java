package Array.ArrayOperations.StaticArray;

public class Searching {

    // its an unsorted array
    // returning index of the first recurring element
    public static int searchingElement(int arr[], int n, int element) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1; // incase element not there
    }

}
