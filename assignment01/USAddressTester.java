package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester{
  public static void main(String[]args){
    StreetUSAddress one = new StreetUSAddress("345 Chambers Street", "", "New York", "NY", "10282");
    StreetUSAddress two = new StreetUSAddress("123 XYZ Street", "FL 2", "New York", "NY", "13123");
    System.out.println(one);
    System.out.println(two);
    try(var output =new PrintWriter(new FileOutputStream(
          new File("output.txt"), true /* true means append to file */))) {
               output.println("\nTESTS FOR StreetUSAddress.java");

               StreetUSAddress one2 = new StreetUSAddress("345 Chambers Street", "", "New York", "NY", "10282");
               StreetUSAddress two2 = new StreetUSAddress("123 XYZ Street", "FL 2", "New York", "NY", "13123");
               output.println(one2);
               output.println(two2);
    //Copy all your lines above, add an extra "2" to every variable name
    // and replace every System.out.print or System.out.println
    // by output.print or output.println
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

}
