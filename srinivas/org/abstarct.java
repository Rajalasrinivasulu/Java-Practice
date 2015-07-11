
package test;

 abstract class x1{

     void dispaly1(){
         System.out.println("Duispsyl");
     }
     abstract   void milk();
 }
abstract class z1 extends x1{
    
}

abstract class y1 extends x1{
   
//    void milk(){
//        System.out.println("Milk for dog");
    }
    

//concrete class 
class f extends z1 {
    void milk(){
       System.out.println("Milk for dog");
}
    
}


public class abstarct { 
    public static void main(String args[]){
//        x1 d=new x1();
//        y1 y=new y1();
        f y=new f();
        y.dispaly1();
        y.milk();
    }
    }
//inheritance
// abstract class abstract method .
