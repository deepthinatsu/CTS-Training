
import java.io.*;
import java.util.*;
import java.text.*;
public class four  {
	
      public static void main(String args[]){
    	  
      try{
      BufferedReader br = new BufferedReader(
                  new InputStreamReader(System.in));

      DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");

      System.out.println("Enter Date1");

      String dateSt1= br.readLine();       // Accepts date1 as string

      System.out.println("Enter Date2"); 

      String dateSt2= br.readLine();  // Accepts date2 as string

      Date date1=df.parse(dateSt1);     // Date String to Date
      Date date2=df.parse(dateSt2);
 
      //System.out.println("Date1 = " + dateSt1);
      //System.out.println("Date2 = " + dateSt2);

      System.out.println("Days between Date1 and Date2 = " + (date2.getTime() - date1.getTime())/(24*60*60*1000));

      }
      catch(Exception e){
        System.out.println("Error : Invalid Date ");
      }
  }
}
