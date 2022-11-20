class Solution {
    public int finalValueAfterOperations(String[] op) {
        int x=0;
        //System.out.println(op[0]+123);
        for(int i=0;i<op.length;i++){
        if(op[i].equalsIgnoreCase("--X") || op[i].equalsIgnoreCase("X--"))
                --x;
        else
            x++;
    }
        return x;
    }
}