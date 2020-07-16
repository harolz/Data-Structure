import java.util.ArrayList;
import java.util.List;

public class RemoveEven {
    public static int[] removeEven(int[] arr){
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i < arr.length; ++i){
            if(arr[i]%2==1){list.add((int)arr[i]);}
        }
        int [] res = new int[list.size()];
        for(int i=0; i < res.length; ++i){
            res[i] = (int)list.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int [] input = {1,2,3,4,5,5};
        for (int element: removeEven(input)) {
            System.out.println(element);
        } 
    }
}