package com.srinivas.org;



class Bark{
     int size=20;
     String str="Srinu";
      public int getsize(){
       return size;
     } 
      public void  setsize(int s){
           size=s;         
           System.out.println("after setting size is "+" "+size);
          
       }
       void  barking(){
           
            System.out.println("Hello this is Dog barking Method");
       }
}
       class GoodDog{
           
           public static void main(String args[]){
               Bark b=new Bark();
               System.out.println(" Size is "+b.size);
               System.out.println(" Size is "+b.getsize());
              
// after setting size is 
                b.setsize(70);
               
             
                   b.barking();
               
               
               
           }
       }



