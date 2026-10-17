/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author ASUS
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
                
        //display student name and student ID
        
        System.out.println("Student's name: Hanan");
        System.out.println("Student's ID: S88218");
        //store two marks using variable
         double marks;
        double mark2=45;
        double mark3=50;
        double mark1=2;
        
        //calculate the total mark
        marks= mark2 + mark3 + mark1;
                
                //display the total
                System.out.println("Total mark: =" + marks );
                
                if (marks < 30)
                        System.out.println("Needs Improvement");
                if (marks < 80)
                    System.out.println("Good");
                if (marks < 90)
                    System.out.println("Very Good");
                else 
                   System.out.println("Excellent");
                
    }
    
}

