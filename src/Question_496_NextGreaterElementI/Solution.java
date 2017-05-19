package Question_496_NextGreaterElementI;

public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] array = new int[findNums.length];
        int i=0;
        for (int value:findNums){
            array[i++]=findMaxInPosition(nums,findPosition(nums,value),value);
        }
        return array;
    }

    private int findPosition(int[] array,int value){
        int pos=0;
        for(int x:array){
            if(value==x){
                return pos;
            }
            pos++;
        }
        return -1;
    }

    public int findMaxInPosition(int[] array,int position,int value){
        for (int i = position+1; i < array.length; i++) {
            if(array[i]>value){
                return array[i];
            }
        }
        return -1;
    }


}