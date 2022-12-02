class Solution {
    private int getCount(String s,int i,int j){
       //Types of initialization in set 
        
        //1.)Constructor
        
        //set.addAll(Arrays.asList(new Character[] {'A','E','I','O','U','a','e','i','o','u'}));
        
        // Any duplicate elements present in the list will be rejected. This approach is not time efficient as we’re initially creating an array, converting it to a list, and passing that list to create a set.
        
        //2.) Double brace initialization
        /*
        Set<Integer> set = new HashSet<Integer>() {{
        add(1);
        add(2);
        add(3);
        }};
        */
        
//This creates a new class that inherits from HashSet. We should avoid this approach as it costs an extra class at each usage. It also holds hidden references to the enclosing instance and any captured objects. This may cause memory leaks or problems with serialization.
        
        //3.)
        
        // set.add('a');
        // set.add('e');
        // set.add('i');
        // set.add('o');
        // set.add('u');
        // set.add('A');
        // set.add('E');
        // set.add('I');
        // set.add('O');
        // set.add('U');

        //System.out.println(i);
        //System.out.println(j);
        
//         //JAVA 8
//         Using Java 8
// We can use the Java 8 Stream to construct small sets by obtaining stream from static factory methods and accumulating the input elements into a new set using collectors. For example,
        
        //4.)Collectors.toSet()

//Collectors.toSet() returns a Collector that accumulates the input elements into a new Set.

// Set<Character> set = Stream.of('A','E','I','O','U','a','e','i','o','u')
//                         .collect(Collectors.toSet());

        
//         5.)
// Collectors.toCollection()

// The specification doesn’t guarantee the type of set returned by toSet(). Even though Java 8 and above returns a HashSet, this might change in future releases. We can use toCollection() to ensure that the returned type of Set is HashSet, as shown below:
        
        // Set<Character>set =Stream.of('A','E','I','O','U','a','e','i','o','u').collect(Collectors.toCollection(HashSet::new));
           
        //JAVA 9
        //6.)Java 9 made it convenient to create instances of a list with small numbers of elements by providing Sets.of() static factory methods that create compact, unmodifiable instances. For example,
        
        Set<Character>set =Set.of('A','E','I','O','U','a','e','i','o','u');
            
             int count=0;
        for(int x=i;x<=j;x++){
             
            if(set.contains(s.charAt(x))){   
                count++;
                // System.out.println("!"+s.charAt(x));
                // System.out.println(count+"!");
            }
        }
        return count;// will return no. of count of vowels each halves of string contains
    }
    public boolean halvesAreAlike(String s) {
        int ac,bc;
        
        ac=getCount(s,0,(s.length()/2)-1);        
        bc=getCount(s,s.length()/2,s.length()-1);
        
        return ac==bc;
    }
}