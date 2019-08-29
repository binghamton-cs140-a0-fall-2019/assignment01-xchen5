package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PlaceDOBTester{
  public static void main(String[]args){
    DateAndPlaceOfBirth one = new DateAndPlaceOfBirth(2000, 11, 5, "Brooklyn", "NY", "USA");
    DateAndPlaceOfBirth two = new DateAndPlaceOfBirth(1999, 11, 5, "Queens", "NY", "USA");
    DateAndPlaceOfBirth three = new DateAndPlaceOfBirth(2000, 11, 5, "Columbus", "OH", "USA");
    DateAndPlaceOfBirth four = new DateAndPlaceOfBirth(1994, 10, 2, "Paris", "France");
    DateAndPlaceOfBirth five = new DateAndPlaceOfBirth(1523, 4, 2, "London", "England");
    System.out.println(one);
    System.out.println(two);
    System.out.println(three);
    System.out.println(four);
    System.out.println(five);
    //true
    System.out.println(one.hasSameBirthDayAs(two));
    //true
    System.out.println(one.hasSameBirthDateAs(three));
    //false
    System.out.println(one.hasSameBirthDayAs(four));
    //true
    System.out.println(one.youngerThan(five));
    //false
    System.out.println(two.youngerThan(one));
    //false
    System.out.println(one.olderThan(four));
    //true
    System.out.println(four.olderThan(one));

    try(var output =new PrintWriter(new FileOutputStream(
          new File("output.txt"), true /* true means append to file */))) {
               output.println("\nTESTS FOR DateAndPlaceOfBirth.java");

               DateAndPlaceOfBirth one2 = new DateAndPlaceOfBirth(2000, 11, 5, "Brooklyn", "NY", "USA");
               DateAndPlaceOfBirth two2 = new DateAndPlaceOfBirth(1999, 11, 5, "Queens", "NY", "USA");
               DateAndPlaceOfBirth three2 = new DateAndPlaceOfBirth(2000, 11, 5, "Columbus", "OH", "USA");
               DateAndPlaceOfBirth four2 = new DateAndPlaceOfBirth(1994, 10, 2, "Paris", "France");
               DateAndPlaceOfBirth five2 = new DateAndPlaceOfBirth(1523, 4, 2, "London", "England");
               output.println(one2);
               output.println(two2);
               output.println(three2);
               output.println(four2);
               output.println(five2);
               //true
               output.println(one2.hasSameBirthDayAs(two2));
               //true
               output.println(one2.hasSameBirthDateAs(three2));
               //false
               output.println(one2.hasSameBirthDayAs(four2));
               //true
               output.println(one2.youngerThan(five2));
               //false
               output.println(two2.youngerThan(one2));
               //false
               output.println(one2.olderThan(four2));
               //true
               output.println(four2.olderThan(one2));
    //Copy all your lines above, add an extra "2" to every variable name
    // and replace every System.out.print or output.println
    // by output.print or output.println
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
