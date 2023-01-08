class Solution {
    public String categorizeBox(int l, int w, int h, int m) {
        /*
        The box is "Bulky" if:
Any of the dimensions of the box is greater or equal to 104.
Or, the volume of the box is greater or equal to 109.

If the mass of the box is greater or equal to 100, it is "Heavy".
If the box is both "Bulky" and "Heavy", then its category is "Both".
If the box is neither "Bulky" nor "Heavy", then its category is "Neither".
If the box is "Bulky" but not "Heavy", then its category is "Bulky".
If the box is "Heavy" but not "Bulky", then its category is "Heavy".
*/
        boolean bulky= l>=10000 || w>=10000 || h>=10000 ||(long )l*(long)w*(long)h>=(long)1000000000;
        boolean heavy=m>=100;
                
        System.out.println(l + " " +w +" "+h+" "+(long)(l*w*h));
        if(bulky == true &&heavy ==true)
            return "Both";
        if(bulky==true)
            return "Bulky";
        if(heavy==true)
            return "Heavy";
        
        return "Neither";
    }
}