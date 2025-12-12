import java.util.*;
public class Unit03{
    
    public static int shiftRight(int num)    {
        return -1;
    }
    public static int shiftRight(int num, int k){
        return -1;
    }
   
    public static int shiftLeft(int num)    {
        return -1;
    }
    public static int shiftLeft(int num, int k){
        return -1;
    }
    public static String shiftRight(String s)    {
        return "";
    }
    public static String shiftLeft(String s)    {
        return "";
    }
    public static String shiftLeft(String s, int k)    {
        return "";
    }
    public static String shiftRight(String s, int k)    {
        return "";
    }
    public static int countWords(String s)    {
        return -1;
    }
    public static int countParts(String s, char separator)    {
        return -1;
    }
    public static String getParts(String s, char separator)    {
        return "";
    }
    public static void printParts(String s, char separator)    {
        int lengthBfr = s.length();
        int lengthAftr = s.replaceAll("" + separator, "").length();
        int sentenceLength = lengthBfr - lengthAftr +1;
        if (sentenceLength == 3){
            String firstWord = s.substring(0, s.indexOf(separator));
            String secondWord = s.substring(s.indexOf(separator) +1, s.lastIndexOf(separator));
            String lastWord = s.substring(s.lastIndexOf(separator) +1); 
            System.out.println(firstWord+"\n"+secondWord+"\n"+lastWord); 
        }
        else if (sentenceLength == 2){
            String firstWord = s.substring(0, s.indexOf(separator));
            String lastWord = s.substring(s.indexOf(separator) + 1);
            System.out.println(firstWord + "\n" + lastWord);
        }
        else if (sentenceLength == 1){
            String word = s.substring(0, s.length());
            System.out.println(word);
        } 
    }
}
