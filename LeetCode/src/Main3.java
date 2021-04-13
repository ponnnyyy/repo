import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums,0);
         return  res;
    }

    private  void backtrack(List<List<Integer>> list,List<Integer> templist,int nums[],int start){
        list.add(new ArrayList<>(templist));
        for (int i = start; i <nums.length ; i++) {
            templist.add(nums[i]);
            backtrack(list,templist,nums,i+1);
            templist.remove(templist.size()-1);
        }


    }
}
