package company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class MakeData {

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rset = null;
    //接続文字列
    final String url = "jdbc:postgresql://localhost:5432/tiscdb";
    final String user = "tiscuser";
    final String password = "userpass";

    ArrayList<Parent> Select1(){
    ArrayList<Parent> list =new ArrayList<>();
        try {
            conn = DriverManager.getConnection(url, user,password);
            String sql = "select com_id,com_name,com_sales,count(ten_id) from company left join tenpo on company.can_id=tenpo.com_id groupby com_id,com_name,com_sale" ;
            stmt = conn.prepareStatement(sql);
            rset = stmt.executeQuery();
            while (rset.next()){                 
                list.add(new Parent(rset.getInt(1),rset.getString(2),rset.getInt(3),rset.getInt(4)));         
                }          
            }    
        catch (SQLException e){
            e.printStackTrace();
            }
        finally {
            try {
                if(rset != null)rset.close();
                if(stmt != null)stmt.close();
                if(conn != null)conn.close();
            }
        catch (SQLException e){
            e.printStackTrace();
            }
        }return list;
    }

    ArrayList<Child> Select2(int id){
        ArrayList<Child> list =new ArrayList<>();
        try {
            conn = DriverManager.getConnection(url, user, password);
            //自動コミットOFF
            //conn.setAutoCommit(false);
            String sql = "select ten_id,ten_name ,com_id,ten_sales from tenpo left join company on company.com_id=tenpo.com_id where company.com_id=?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            rset = stmt.executeQuery();
            while (rset.next()){                 
                list.add(new Child(rset.getInt(1),rset.getString(2),id,rset.getInt(4)));
            }                   
        }    
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try {
                if(rset != null)rset.close();
                if(stmt != null)stmt.close();
                if(conn != null)conn.close();
                }
        catch (SQLException e){
            e.printStackTrace();
            }
        }return list;
    }

    ArrayList<Product> Select3(int id){
        ArrayList<Product> list =new ArrayList<>();
        try {
            conn = DriverManager.getConnection(url, user, password);
            String sql = "select pro_id,pro_name ,ten_id ,pro_inv from product left join inventory on product.pro_id=inventory.pro_id where inventory.ten_id=?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            rset = stmt.executeQuery();
            while (rset.next()){                 
                    list.add(new Product(rset.getInt(1),rset.getString(2),id,rset.getInt(4)));
                }               
        }    
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try {
                if(rset != null)rset.close();
                if(stmt != null)stmt.close();
                if(conn != null)conn.close();
                }
        catch (SQLException e){
            e.printStackTrace();
            }
        }return list;
    }

    ArrayList<String> Select4(int id){
        ArrayList<String> list =new ArrayList<>();
        try {
            conn = DriverManager.getConnection(url, user, password);
            String sql = "select ten_name from tenpo where com_id=?";          
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            rset = stmt.executeQuery();       
            while (rset.next()){                 
                    list.add(rset.getString(1));
                }                    
            }    
        catch (SQLException e){
            e.printStackTrace();
            }
        finally {
            try {
                if(rset != null)rset.close();
                if(stmt != null)stmt.close();
                if(conn != null)conn.close();
            }
        catch (SQLException e){
            e.printStackTrace();
            }
        }return list;
    }
}