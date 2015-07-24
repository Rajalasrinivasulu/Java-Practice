

package com.srinivas.org;

class testdrive{
public static void main(String args[]){
    int numberofguess=0;
   Gamehelper helper=new Gamehelper();//Gamehelper class 
   Simpledoc thedoc=new Simpledoc();
   int random=(int)(Math.random()*5);
   int locations[]={random,random+1,random+2};
   thedoc.setnumberofcell(locations);
   boolean aslive=true;
   while(aslive==true){
       String guess=helper.getuserunput("enter a number");
       String result=thedoc.Checkyourself(guess);
       numberofguess++;
       if(result.equals("kill")){
           aslive=false;
           System.out.println("you took "+numberofguess+"guesses");
       }
   }
   
   
   

}
}