
package com.srinivas.org;


 class PoorDog {
     private int size;
     private String str;
    Boolean b;
     public int getsize(){
         return size;
         
     }
     public String getstring(){
         return str;
     }
      public Boolean getboolena(){
          return b;
          
      }
    
}
 class PoorDogtestDrive{
     public static void main(String args[]){
         PoorDog pd=new PoorDog();
         int x1=pd.getsize();

         System.out.println(x1);
         System.out.println(pd.getstring());
         System.out.println("getting Boolen instance variable value  is"+pd.getboolena());
          
     }
 }