package ua.org.oa.stepanovas;

public class Student {  // the student's in DUSSH  
        
    private static final int SPEED_MAX = 40;      // student's max speed 
    private static final double SPEED_MIN = 0.1; //  student's min speed 
    private static final int AGE_MAX = 16;       // student's max age 
    private static final int AGE_MIN = 6;        // student's min age 
    private String lName;                    //Student's last name
    private String fName;                    // Student's first name
    private int age;                         //Student's age
    private float speed;                      //Student's speed
    
    public String getlName() {
        return this.lName;
    }
    
    
    public String getfName() {
        return this.fName;
    }
        
    public int getAge() {
        return this.age;
    }
    public float getSpeed() {
        return this.speed;
    }
    
    // Checking on empty field's in date
    
    public void setParams(String nfName, String nlName, int nage, float nspeed) {
        if(nfName.isEmpty()) {
        System.out.println("Not entered first name!");
        return;
        }
        if(nlName.isEmpty()) {
        System.out.println("Not entered last name!");
        return;
        }       
        
     // Checking on wrong speed and age
        
        
        if(nage < AGE_MIN || nage > AGE_MAX) {
            System.out.println("This age is wrong " + nage +"!");
            return;
            }       
        if(nspeed < SPEED_MIN || nspeed > SPEED_MAX) {
        System.out.println("This speed is " + nspeed +"!");
        return;
        }   
        
        fName = nfName;
        lName = nlName;
        age =  nage;
        speed = nspeed;
    }
}











