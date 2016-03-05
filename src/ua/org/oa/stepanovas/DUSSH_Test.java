package ua.org.oa.stepanovas;

public class DUSSH_Test {   

    private static final int SPEED10 = 10; // the speed have set

    public static void main(String[] args) {
        Student[] myArr;
        myArr = new Student[10];
        myArr[0] = new Student();
        myArr[0].setParams("Tom", "Black", 12, 9);
        myArr[1] = new Student();
        myArr[1].setParams("Juliya", "Hills", 15, 21);
        myArr[2] = new Student();
        myArr[2].setParams("Bob", "Devis", 15, 14);
        myArr[3] = new Student();
        myArr[3].setParams("Leo", "Zimens", 16, 18);
        myArr[4] = new Student();
        myArr[4].setParams("Lu", "Andys", 15, 15);
        myArr[5] = new Student();
        myArr[5].setParams("Rob", "Dinny", 13, 11);
        myArr[6] = new Student();
        myArr[6].setParams("Ann", "Adlons", 11, 7);
        myArr[7] = new Student();
        myArr[7].setParams("Hug", "Belt", 14, 11);
        myArr[8] = new Student();
        myArr[8].setParams("Diggy", "Ands", 15, 22);
        myArr[9] = new Student();
        myArr[9].setParams("Lu", "Andys", 12, 8);

        float averageSpeed;
        int i;
        averageSpeed = 0;
        for (i = 0; i < myArr.length; i++) {
            averageSpeed = averageSpeed + myArr[i].getSpeed();
        }
        averageSpeed = averageSpeed / myArr.length; // average Speed of students
        System.out.println("The average speed of students  = " + averageSpeed + " m/sec");

        float speedEqual = 0;
        int j;
        for (j = 0; j < myArr.length; j++) {
            speedEqual = myArr[j].getSpeed();
            String fname = myArr[j].getfName();
            String lname = myArr[j].getlName();
            if (speedEqual < averageSpeed) { 
          
                System.out.println(fname + "   "+ lname + "   "+ speedEqual + "   m/sec - this speed is higher than average speed " 
                        + averageSpeed + " m/ sec");
            } else 
            {
                System.out.println(fname +"   "+ lname + "   "+speedEqual + "   m/sec - this speed is lower than average speed "
                        + averageSpeed + " m/ sec");
            }
        }   
        float speedConst = SPEED10;
        int f;
        for (f = 0; f < myArr.length; f++) {
            speedConst = myArr[f].getSpeed();
            String fname = myArr[f].getfName();
            String lname = myArr[f].getlName();
            if (speedConst >= SPEED10) {   
            	System.out.println(fname + "   "+ lname + "   "+ speedConst +  " m/sec -this speed is higher than 10 m/sec "); 
            } else {
                System.out.println(fname + "   "+ lname + "   "+ speedConst +  "  m/sec - this speed is lower than 10  m/sec ");
            }
        }
    }
}