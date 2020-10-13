/**
 * gets a number grade, prints approximate letter grade
 * @author Graham Ellacott
 */
public class Main {

  //a method that gets a grade and tells the user the letter grade
  public static void examGrade(int grade){
    if(grade >= 80){ //if grade is over 80
      System.out.println("A"); //print A
    }else if(grade >= 70){ //if grade is over 70
      System.out.println("B"); //print B
    }else if(grade >= 60){ //if grade is over 60
      System.out.println("C"); //print C
    }else if(grade >= 50){ //if grade is over 50
      System.out.println("D"); //print D
    }else{ //if grade is under 50
      System.out.println("F"); //print F
    }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //check a bunch of different grades
    for(int i = 0; i < 100; i += 5){ //count by 5s from 0 to 99
      System.out.println(i); //print the number grade
      examGrade(i); //find the letter grade
    }
    
  }
}
