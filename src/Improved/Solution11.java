package Improved;

public class Solution11 {


    public int minNumberInRotateArray(int [] array) {

        int index1 = 0;
        int index2 = array.length-1;
        int indexMid = index1;

        while (array[index1] >= array[index2]){

            if (index2-index1 == 1){
                indexMid = index2;
                break;
            }

            indexMid = index1 + (index2-index1)/2;


            if (array[indexMid] == array[index1] && array[index1] == array[index2]){
                return MinInOrder(array,index1,index2);
            }

            if (array[indexMid] >= array[index1]){
                index1 = indexMid;
            }else if (array[indexMid] <= array[index1]){
                index2 = indexMid;
            }




        }

        return array[indexMid];


    }

    private int MinInOrder(int[] array, int index1, int index2) {

        int result = array[index1];
        for (int i = index1 +1 ; i < index2 ; i++){
            if (array[i] < result){
                result = array[i];
            }


        }

        return result;
    }
}
