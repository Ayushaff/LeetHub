class Solution {
    private int getCount(String s,int i,int j){
        int count=0;
        
        
        Set<Character>set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        System.out.println(i);
        System.out.println(j);
        for(int x=i;x<=j;x++){
             
            if(set.contains(s.charAt(x))){   
                count++;
                System.out.println("!"+s.charAt(x));
                System.out.println(count+"!");
            }
        }
        return count;
    }
    public boolean halvesAreAlike(String s) {
        int ac,bc;
        ac=getCount(s,0,(s.length()/2)-1);
        
        bc=getCount(s,s.length()/2,s.length()-1);
        return ac==bc;
    }
}