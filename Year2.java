
package year2;
import java.util.Scanner;
/**
 *
 * @author Maynul islam
 */
public class Year2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String set1 = 
              "1987  1989 1991 1993\n"
             +"1995  1997 1999 2001\n"
             +"2003 2005 2007 2009\n"
             +"2011 2013 2015 2017";
        
        String set2 =
               "1988 1989  1992  1993\n"
              +"1996 1997  2000  2001\n"
              +"2004 2005  2008  2009\n"
             + "2012 2013  2016  2025";
        
        String set3 = 
               "1990 1991  1992  1993\n"
             + "1998 1999  2000  2001\n"
             + "2006 2007  2008  2009\n"
             + "2014 2015  2016  2017";
        
        String set4 = 
               "1994 1995  1996 1997\n"
             + "1998 1999  2000 2001\n"
             + "2010 2011  2012 2013\n"
             + "2014 2015  2016 2017";
        
        String set5 = 
                "2002 2003 2004 2005\n"
              + "2006 2007 2008 2009\n"
              + "2010 2011 2012 2013\n"
              + "2014 2015 2016 2017";
        
        
        int date = 1986 ;
        
        System.out.println("Is your birth date in set-1?\n");
        System.out.println(set1);
        System.out.println("\nEnter 0 for No and 1 for Yes");
        int answer = input.nextInt();
        if (answer == 1) 
            date += 1; 
        
        
        
        System.out.println("Is your birth date in set-2?\n");
        System.out.println(set2);
        System.out.println("\nEnter 0 for No and 1 for Yes");
        answer = input.nextInt();
        if (answer == 1) 
            date += 2; 
        
        
        
        System.out.println("Is your birth date in set-3?\n");
        System.out.println(set3);
         System.out.println("\nEnter 0 for No and 1 for Yes");
        answer = input.nextInt();
        if (answer == 1) 
            date += 4; 
        
        
        
        System.out.println("Is your birth date in set-4?\n");
        System.out.println(set4);
         System.out.println("\nEnter 0 for No and 1 for Yes");
        answer = input.nextInt();
        if (answer == 1) 
            date += 8;
        
        
        System.out.println("Is your birth date in set-5?\n");
        System.out.println(set5);
         System.out.println("\nEnter 0 for No and 1 for Yes");
        answer = input.nextInt();
        if (answer == 1) 
            date += 16; 
        
        
        System.out.println("\nYour birthdate is " + date + "!");
        
        
    }
    
}
