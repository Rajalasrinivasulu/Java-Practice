
package test;

class  kishore {
    void disp(){
}
}
    class dad{
        void di(){
            System.out.println("Son");
            
        }
    }
    class brother{
        void dd(){
             System.out.println("trammududb ");
        }
        
    } 
    class vadina{
        void v(){
             System.out.println("mar");
        }
    
}


public class polymorphism {
    public static void main(String args[]){
        kishore k=new kishore();
        dad d=new dad();
        brother b=new brother();
        vadina v=new vadina();
        Object o=k;//Int x---index  int x=10, int y; y=x;
        o=d;       
        o=b;
        o=v;      
      
        
        
    }
}
    

