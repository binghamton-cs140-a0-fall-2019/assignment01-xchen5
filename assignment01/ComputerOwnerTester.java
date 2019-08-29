package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester{
  public static void main(String[] args) {
    DateAndPlaceOfBirth date = new DateAndPlaceOfBirth(2000, 11, 5, "Brooklyn", "NY", "USA");
    StreetUSAddress street = new StreetUSAddress("111 xd street", "fl 0", "New York", "NY", "12313");
    Person one = new Person("Xavier", "Chen", "111001111",date, street);
    Computer comp1 = new Computer("Dell", "intel", 4, 100, true, 300 );
    Computer comp2 = new Computer("Dell", "intel", 4, 300, false, 300 );
    Computer comp3 = new Computer("Dell", "intel", 4, 3000, true, 300 );
    Computer comp4 = new Computer("Dell", "intel", 4, 2000, false, 300 );
    ComputerOwner compOwner = new ComputerOwner(one);
    compOwner.addComputer(comp1);
    compOwner.addComputer(comp2);
    compOwner.addComputer(comp3);
    compOwner.addComputer(comp4);
    System.out.println(compOwner);
    compOwner.removeComputer(3);
    compOwner.removeComputer(2);
    System.out.println(compOwner);
    try(var output =new PrintWriter(new FileOutputStream(
          new File("output.txt"), true /* true means append to file */))) {
               output.println("\nTESTS FOR ComputerOwner.java");
               DateAndPlaceOfBirth date2 = new DateAndPlaceOfBirth(2000, 11, 5, "Brooklyn", "NY", "USA");
               StreetUSAddress street2 = new StreetUSAddress("111 xd street", "fl 0", "New York", "NY", "12313");
               Person one2 = new Person("Xavier", "Chen", "111001111",date2, street2);
               Computer comp12 = new Computer("Dell", "intel", 4, 100, true, 300 );
               Computer comp22 = new Computer("Dell", "intel", 4, 300, false, 300 );
               Computer comp32 = new Computer("Dell", "intel", 4, 3000, true, 300 );
               Computer comp42 = new Computer("Dell", "intel", 4, 2000, false, 300 );
               ComputerOwner compOwner2 = new ComputerOwner(one2);
               compOwner2.addComputer(comp12);
               compOwner2.addComputer(comp22);
               compOwner2.addComputer(comp32);
               compOwner2.addComputer(comp42);
               output.println(compOwner2);
               compOwner2.removeComputer(3);
               compOwner2.removeComputer(2);
               output.println(compOwner2);

    //Copy all your lines above, add an extra "2" to every variable name
    // and replace every System.out.print or System.out.println
    // by output.print or output.println
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

}
