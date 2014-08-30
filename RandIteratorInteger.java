import java.util.*;
public class UniformRandomIteratorInteger {

    public static void main(String[] args) {

    // Create integers to further feed with iterator
    List<Integer> IntegersFeed = new ArrayList<>();
     IntegersFeed.add(8);
     IntegersFeed.add(7);
     IntegersFeed.add(6);
     IntegersFeed.add(5);
     IntegersFeed.add(4);
     IntegersFeed.add(3);
     IntegersFeed.add(2);
     IntegersFeed.add(1);
     IntegersFeed.add(0);
     
      UseUniformRandomIteratorInteger(IntegersFeed);
     
    }
    
    
    // LCG uniform random generator between 0 and 1
    public static double GenerateLCGRand (Double XRand) {  
        int a = 25173, b = 13849, m = 32768;
            XRand = (a * XRand + b) % m;
            XRand = XRand / m;
            return XRand;    
        }
    
    public static void UseUniformRandomIteratorInteger(List<Integer> IntegersF) {
    
    int count = 0;
    int RandPosition;
    double Rand = System.currentTimeMillis(); // initial value 
    Iterator<Integer> integerIter = IntegersF.iterator();
    
    
    while (integerIter.hasNext()){
        count++;
      
     // generate uniform rand variable
     
     Rand = GenerateLCGRand(Rand);
    
    // Decide which position integer is chosen as random
    
    RandPosition = (int)(Math.round(count*Rand));
    
    // ensuring that no lower than 1 position is chosen
    if (RandPosition<1) {
        RandPosition = 1;
    }
          
      integerIter.next();
      System.out.println("Current integer values traversed by iterator are");     
      for(int i=0; i<count; i++){
              System.out.print("/" + IntegersF.get(i));
         }
         
         System.out.println(" ");
         System.out.println("Random integer chosen is: "+ IntegersF.get(RandPosition-1));
         System.out.println(Rand);
         System.out.println("-------- Next Iteration --------");
         System.out.println(" ");
    }
  }

    
}
