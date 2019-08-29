package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester{
  public static void main(String[]args){
    DateAndPlaceOfBirth date = new DateAndPlaceOfBirth(2000, 11, 5, "Brooklyn", "NY", "USA");
    StreetUSAddress street = new StreetUSAddress("111 xd street", "fl 0", "New York", "NY", "12313");
    Person one = new Person("Xavier", "Chen", "111001111",date, street);
    System.out.println(one);
    try(var output =new PrintWriter(new FileOutputStream(
          new File("output.txt"), true /* true means append to file */))) {
               output.println("\nTESTS FOR Person.java");
               DateAndPlaceOfBirth date2 = new DateAndPlaceOfBirth(2000, 11, 5, "Brooklyn", "NY", "USA");
               StreetUSAddress street2 = new StreetUSAddress("111 xd street", "fl 0", "New York", "NY", "12313");
               Person one2 = new Person("Xavier", "Chen", "111001111",date2, street2);
               output.println(one2);

    //Copy all your lines above, add an extra "2" to every variable name
    // and replace every System.out.print or System.out.println
    // by output.print or output.println
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

}
