package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester{
  public static void main(String[] args) {
    SimpleDate dateOne = SimpleDate.of(2000,11,5);
    SimpleDate dateTwo = SimpleDate.of(2000,11,3);
    SimpleDate dateThree = SimpleDate.of(2000, 8,2);
    SimpleDate dateFour = SimpleDate.of(1234, 12, 2);
    //false
    System.out.println(dateOne.before(dateTwo));
    //true
    System.out.println(dateTwo.before(dateOne));
    //true
    System.out.println(dateThree.before(dateOne));
    //false
    System.out.println(dateOne.before(dateThree));
    //True
    System.out.println(dateFour.before(dateOne));
    //false
    System.out.println(dateOne.before(dateFour));
    try(var output =new PrintWriter(new FileOutputStream(
          new File("output.txt"), true /* true means append to file */))) {
               output.println("\nTESTS FOR SimpleDate.java");
               SimpleDate dateOne2 = SimpleDate.of(2000,11,5);
               SimpleDate dateTwo2 = SimpleDate.of(2000,11,3);
               SimpleDate dateThree2 = SimpleDate.of(2000, 8,2);
               SimpleDate dateFour2 = SimpleDate.of(1234, 12, 2);
               //false
               output.println(dateOne2.before(dateTwo2));
               //true
               output.println(dateTwo2.before(dateOne2));
               //true
               output.println(dateThree2.before(dateOne2));
               //false
               output.println(dateOne2.before(dateThree2));
               //True
               output.println(dateFour2.before(dateOne2));
               //false
               output.println(dateOne2.before(dateFour2));

    //Copy all your lines above, add an extra "2" to every variable name
    // and replace every System.out.print or System.out.println
    // by output.print or output.println
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }


  }
}
