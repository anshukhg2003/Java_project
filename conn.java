package bank.management.system;
/** JDBC connectivity 5 stages:
 * Register The Driver
 * Create a Connection
 * Create a statement
 * Execute query
 * Close Connection
 * */
import java.sql.*; /* import library  usel sql */
public class conn {
    Connection c; /* create a object */
    Statement s; /* create a object */
    public conn(){ /* create a construction */
    try{ /* uses exception handling */
    /* Drive Register */
     c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Anshu2003@"); /* step2 connection_create */
      s = c.createStatement(); /* step3 create_statement */
    } catch (Exception e){
        System.out.println(e);
    }
    
}
    
}
