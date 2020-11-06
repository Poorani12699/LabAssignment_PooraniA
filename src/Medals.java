/*
 * Author : Poorani A
 * Date : 4/11/2020
 * Description : Program to print medal type based on marks 
 */
import java.util.HashMap;
import java.util.Set;
public class Medals
{
       public HashMap<String,String> getStudent(HashMap<String,Integer> student)
       {
              HashMap<String,String> medal = new HashMap<>();
              Set<String> set = student.keySet();
              for(String s:set)
              {
            	  //providing control conditions to decide the medal type
                     Integer marks = student.get(s);
                     if(marks>=90)
                     {
                           medal.put(s,"Gold");
                     }
                     else if(marks >=80)
                     {
                           medal.put(s,"Silver");
                     }
                     else if(marks>=70)
                     {
                           medal.put(s,"Bronze");
                     }
              }
              return medal;
       }
       public static void main(String[] ar)
       {
              HashMap<String,Integer> student = new HashMap<>();
              Medals m = new Medals();
              student.put("student1",60);//hardcoded input
              student.put("student2",20);
              student.put("student3",90);
              student.put("student4",70);
              student.put("student5",80);
              System.out.println(m.getStudent(student));
       }
}