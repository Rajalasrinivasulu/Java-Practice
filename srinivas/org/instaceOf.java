
package javaapplication1;
class supw{    
    void display(){
        System.out.println("Srinivas Reddy ");
    }   
}
class subw extends supw{    
}
class ss extends subw{
    
}
public class instaceOf {
    public static void main(String args[]){
       supw s=new supw();
       s.display();
       subw s1=new subw();
       System.out.println(s1 instanceof supw);       
       String str="Reddy";
     
       System.out.println(str instanceof java.lang.String);
//         int i=10;
//       System.out.println(i instanceof java.lang.Integer);// doesn't work 
       ss ss=new ss();
       System.out.println(s1 instanceof supw && ss instanceof subw);   
       String str1="Reddy";
        int i=10;
        String name=null;
        System.out.println(str1 instanceof java.lang.String);
//        System.out.println(i instanceof Integer);
        System.out.println(name instanceof java.lang.String );// variable initiation is mandatory in checking object is a specified type .
    }
    
}

       
        
        
        
