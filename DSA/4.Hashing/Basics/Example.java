import java.util.*;
public class Example 
{
    public static void main(String[] args) 
    {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('a',1);
        map.put('b',4);
        map.put('a',2);
        // System.out.println(map.get('z')+1);
        System.out.println(map.getOrDefault('z',0)+1);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) 
        {
            char key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key+" "+value);
        }
    }    
}
