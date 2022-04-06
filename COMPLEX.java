

class COMPLEX{
   //for real and imaginary parts of complex numbers
   double real, img;
   
   COMPLEX(){
       
   }

	
   //constructor to initialize the complex number
   COMPLEX(double r, double i){
	real = r;
	img = i;
       
   }
   COMPLEX addcomp(COMPLEX C1,COMPLEX C2)
   {
       COMPLEX temp=new COMPLEX();
       temp.real=C1.real+C2.real;
       temp.img=C1.img+C2.img;
       return temp;
   }
   void printcomplexnumber(){
       System.out.println("complex number : "
                                       + real + " + " 
                                       +img + " i ");
   }
   
   
  public class COMPLEXnumber{

        private double real;
        private double img;
      
  }
    public static void main(String args[]) {
	COMPLEX c1 = new COMPLEX(5.5, 4);
        c1.printcomplexnumber();
	COMPLEX c2 = new COMPLEX(1.2, 3.5);
        c2.printcomplexnumber();
        COMPLEX c3 = new COMPLEX();
        c3=c3.addcomp(c1,c2);
        
       System.out.println("sum of ");
       c3.printcomplexnumber();
     
    }
}