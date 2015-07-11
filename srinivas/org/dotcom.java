
package com.srinivas.org;
class Simpledoc{
    int numberofcell[];
    int numberofhits=0;
    public void setnumberofcell(int[] cells){
        numberofcell=cells;
    }
    public String Checkyourself(String str){
  int guess=Integer.parseInt(str);
//        int guess=str;
        String result="miss";
        for(int cells:numberofcell){
            if(guess==cells){
                result="hit";
                numberofhits++;
                break;
            }
        }
        if(numberofhits==numberofcell.length){
            result="kill";
        }
        System.out.println(result); 
        return result;
         } 
}      

public class dotcom {
    public static void main(String args[]){
        Simpledoc sd=new Simpledoc();
        int[] locations={2,3,4};
      sd.setnumberofcell(locations);
   String name="3";
      sd.Checkyourself(name);
     
    }
    
}
