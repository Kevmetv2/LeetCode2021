import java.util.HashMap;

public class Check_Array_Formation_Through_Concatenation_1640 {


    public static void main(String[] args) {

    }
    
    public boolean canFormArray(int[] arr, int[][] pieces) {

        HashMap<Integer,int[]> map = new HashMap();

        for(int[] piece : pieces){
            map.put(piece[0],piece);
        }

        int start = 0;

        while(start<arr.length){
            if(map.containsKey(arr[start])){
                int[] temp = map.get(arr[start]);
                for(int i = 0;i<temp.length;i++){
                    if(temp[i] == arr[start]) start++;
                    else return false;
                }

            }else{
                return false;
            }
        }

        return true;
    }
}
