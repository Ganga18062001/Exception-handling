import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ParacticeOnFinally {
    public static void main(String[] args) {
        Connection cn = null;
        PreparedStatement pr = null;
        ResultSet rs = null ;
        try {

        }catch (Exception ex){
            System.out.println(ex);
        }finally {
            try{
                cn.close();

            }catch (SQLException e){

            }try{
                pr.close();

            }catch (Exception exx){

            }try{
                rs.close();

            }catch (Exception ee){

            }
        }
    }
}
