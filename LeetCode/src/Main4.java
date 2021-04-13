import java.util.*;

public class Main4 {

    public String[] permutation(String S) {
        char[] chars=S.toCharArray();
        int len=chars.length;
        boolean[]used=new boolean[len];
        LinkedList<String> res = new LinkedList<>();
        dfs(chars,len,0,new StringBuilder(),used,res);
        return res.toArray(new String[0]);
    }

    private void dfs(char[] chars, int len, int dept, StringBuilder  path, boolean[] used, LinkedList<String> res) {
        if(dept== len){
            res.add(path.toString());
            return;
        }
        for (int i = 0; i <len ; i++) {
            if(used[i]){
                continue;
            }
            path.append(chars[i]);
            used[i]=true;
            dfs(chars,len,dept+1,path,used,res);
            path.deleteCharAt(path.length()-1);
            used[i]=false;
        }
    }

}
