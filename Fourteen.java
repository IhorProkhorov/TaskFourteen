
public class Fourteen {

    //Task 1
    public static int[] insertionSort(int[] array){
        for (int i = 1; i < array.length; i++){
            int key = array[ i ];
            int j;
            for ( j = i - 1; (j >= 0) && (array[j] > key); j--){
                array[j + 1] = array [j];
            }
            array[j + 1] = key;
        }
        return array;
    }

    //Task 2
    public static int interpolationSearch(int[] array, int elementToSearch) {

        int startIndex = 0;
        int lastIndex = array.length - 1;

        while ( array[startIndex] <= elementToSearch && elementToSearch <= array[lastIndex]) {

            int pos = startIndex + (elementToSearch - array[startIndex]) *
                    (lastIndex - startIndex) / (array[lastIndex] - array[startIndex]);

            if (array[pos] < elementToSearch)
                startIndex = pos + 1;

            else if (array[pos] > elementToSearch)
                lastIndex = pos - 1;

            else return pos;
        }
        return -1;
    }
}
