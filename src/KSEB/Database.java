/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KSEB;
import java.sql.*;
/**
 *
 * @author nyesteventuretechnologies
 */
public class Database 
{
  
	public static java.sql.Connection con;
	public static PreparedStatement ps;
	public static ResultSet rs;
	public static int id,age;
	public static String name,address,email,user,pass;
    String LastName="";
	private String names;
         public void setName(String name) {
              System.out.println("-------------++++name++++++++++++++++------------------"+name);
       this.name = name;
    }

    public String getName() {
       return name;
    }
	public Database()
	{
			try
			{
	    	 Class.forName("com.mysql.jdbc.Driver").newInstance();
	    	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kseb","root","");
	    	 System.out.println("Connection established");
			}
			catch(Exception e)
			{
	    	 System.out.println("PLEASE RUN WAMPSERVER .The exception is "+e);
	    	}
	}  
        
       public boolean methodUserlogin(String name,String password) 
        {
        try
        {

            PreparedStatement ps=con.prepareStatement("select * from register where username=? and password=?");
            ps.setString(1, name); 
            ps.setString(2, password); 
            rs=ps.executeQuery();

            if(rs.next())
            {
                String  consumerNumber=rs.getString(5);
                
             //   ViewBill viewBill=new ViewBill(consumerNumber);
              //  viewBill.ViewBill(consumerNumber);
                System.out.println("-------------------------------"+consumerNumber);
              
                Database d=new Database();
              //   System.out.println("---------consumerNumber----------------------"+consumerNumber);
             ps=d.con.prepareStatement("select * from bill where consumer=?");
            ps.setString(1, consumerNumber);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
                    
            {
                  System.out.println("---------getStringgetStringgetStringgetStringgetString----------------------"+rs.getString(2));
             LastName = rs.getString(2);
              setName(LastName);
                   //  System.out.println("-------------++++++++++++++++++++------------------"+getLastName);   
                       
              return true;
          }    
             
            }
            else
            {
                return false;
            }
        } 
        catch (Exception e) 
        {
           
            System.out.println("error while validating"+e);
            return false;
        }

        return true; 
        
        }
       
       
  
       
       
 
       
       public boolean methodlogin(String user,String password) {
        try {

            ps = con.prepareStatement("select * from admin where name=? and password=?");
            
            ps.setString(1, user); 
            ps.setString(2, password);    
            rs = ps.executeQuery();
            
            if (rs.next()) 
            {
                return true;
            } 
            else 
            {
                return false;
            }
        } 
        catch (Exception e) 
        {
           
            System.out.println("error while validating" + e);
            return false;

        }
    }
       public boolean approve(int id){
		try{
					//update user set newusername=?,password=? where userid=?
		ps=con.prepareStatement("update bill set approve=? where id=?");
		System.out.println("====");
		ps.setInt(1,1);
		System.out.println("status"+1);
		ps.setInt(2,id);
                System.out.println("id"+2);
		ps.executeUpdate();
		return true;
		}
                catch(Exception e)
                {
			System.out.println("Error in approvephotogaphy"+e);
                        return false;
		}
	}

    
}
