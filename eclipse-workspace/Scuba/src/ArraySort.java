import java.util.Arrays;


class Emp 
{ 
    int empNo; 
    String name, location, company; 
  
    
    public Emp(int empNo, String name, 
                               String location,String company ) 
    { 
        this.empNo = empNo; 
        this.name = name; 
        this.location = location; 
        this.company = company; 
    } 
  
    // Used to print student details in main() 
    public String toString() 
    { 
        return this.empNo + " " + this.name + 
                           " " + this.location+this.company; 
    } 
} 
  
class Sortbyroll implements Comparator<Emp> 
{ 
    
    public int compare(Emp a, Emp b) 
    { 
        return a.empNo - b.empNo; 
    } 
} 
  

class Main 
{ 
    public static void main (String[] args) 
    { 
        Emp [] arr = {new Emp(2626, "praga", "london", "Maveric"), 
                          new Emp(2628, "John", "Cairo", "CIB"), 
                          new Emp(2726, "Sai", "jaipur","TCS")}; 
  
        
        Arrays.sort(arr); 
  
        System.out.println(" "); 
        for (int i=0; i<arr.length; i++) 
            System.out.println(arr[i]); 
    } 
} 