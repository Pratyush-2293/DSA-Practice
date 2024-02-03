public class LastOccurrenceInArray {
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(LastOccurrence(arr, 5, 0));
    }

    public static int LastOccurrence(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int foundIndex = LastOccurrence(arr, key, i+1);
        if(foundIndex==-1 && arr[i]==key){
            return i;
        }

        return foundIndex;
    }
}
