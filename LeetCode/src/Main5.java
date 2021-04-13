import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public List<List<Integer>> permute(int[] nums) {
          int len= nums.length;
          List<Integer> path=new ArrayList<>();
          List<List<Integer>> res=new ArrayList<>();
          boolean used[]=new boolean[len];
          dfs(nums,len,0,path,res,used);
          return  res;
    }

    private void dfs(int[] nums, int len, int dept, List<Integer> path, List<List<Integer>> res, boolean[] used) {
        if (dept==len){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i <len ; i++) {
            if(used[i]){
                continue;
            }
            path.add(nums[i]);
            used[i]=true;
            dfs(nums,len,dept+1,path,res,used);
            path.remove(path.size()-1);
            used[i]=false;
        }
    }
}
