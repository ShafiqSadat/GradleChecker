//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class KanKorDB {
//
//    public static Connection getConnection() throws SQLException {
//        String connect = "jdbc:sqlite:./kankor.db";
//        return DriverManager.getConnection(connect, "", "");
//    }
//    public static void addUser(String userID , String name){
//        try {
//            Connection con = getConnection();
//            String SQL = "INSERT INTO users (id,userId,name) VALUES(null,?,?)";
//            PreparedStatement stmt = con.prepareStatement(SQL);
//            stmt.setString(1,userID);
//            stmt.setString(2,name);
//            stmt.execute();
////            System.out.println("Saved!!!");
//            con.close();
//            stmt.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
