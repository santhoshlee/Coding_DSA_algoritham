
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
    
       String reverse_val ="";
       char[] chars = str.toCharArray();
       
       for(int i=0;i<chars.length;i++) {
           reverse_val = String.valueOf(chars[i]) +reverse_val ;
       }
       
       return  reverse_val.toString();
    }
}