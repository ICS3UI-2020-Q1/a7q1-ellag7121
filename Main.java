/**
 * asks user for grade, tells grade approximate letter grade
 * @author Graham Ellacott
 */
public class Main {

  //a method that gets a grade and tells the user the letter grade
  public static String examGrade(int grade){
    if(grade >= 80){ //if grade is over 80
      return "A"; //return A
    }else if(grade >= 70){ //if grade is over 70
      return "B"; //return B
    }else if(grade >= 60){ //if grade is over 60
      return "C"; //return C
    }else if(grade >= 50){ //if grade is over 50
      return "D"; //return D
    }else{ //if grade is under 50
      return "F"; //return F
    }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    //check a bunch of different grades
    for(int i = 0; i < 100; i += 5){ //count by 5s from 0 to 99
      String grade = examGrade(i); //find the letter grade
      //print the grade to the screen
      System.out.println(i + " = " + grade);
    }
    
  }
}
