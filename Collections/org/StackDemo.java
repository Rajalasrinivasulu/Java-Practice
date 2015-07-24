package collections;
import java.util.*;

public class StackDemo {
    public static void main(String args[]){
        Stack st=new Stack();      
        System.out.println(st.empty());
        for(int i=0;i<10;i++)
        {
            st.push(i);
        }
        System.out.println(st);
        st.add("B");
                System.out.println(st.empty());
         st.push("M");
           System.out.println(st);
           System.out.println(st.search("N"));
           System.out.println(st.indexOf("M"));
//           System.out.println(st.indexOf("M"));
          st.remove(11);
                     System.out.println(st);

           
    }
    
}
