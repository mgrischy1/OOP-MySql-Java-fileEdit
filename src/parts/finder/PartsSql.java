/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parts.finder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mikeg
 */
public class PartsSql {

    Connection myConn = null;
    Statement myStmt = null;
    ResultSet myRs = null;

    String user = "root";
    String pass = "";

    public Connection getCon() throws SQLException {
     
        myConn = DriverManager.getConnection("jdbc:mysql://localhost/chargepoint?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true", user, pass);
        return myConn;
    }

    public void save(PartObj p) throws SQLException {

        try {

            // 2. Create a statement
//            myStmt = myConn.createStatement();
//            
            String query = " insert into parts (partNumber, name, Version, Station_Step, MPI_Number, MPI_Number1, MPI_Number2,  Station_Step1, Station_Step2)"
                    + " values (?,?,?,?,?,?,?,?,?)";

            myConn = getCon();
            Statement myqr = myConn.createStatement();
            myqr = myConn.createStatement();
            PreparedStatement ps = myConn.prepareStatement(query);
            ps.setInt(1, p.getPartNumber());
            ps.setString(2, p.getName());
            ps.setString(3, p.getVersion());
            ps.setString(4, p.getStation_Step());
            ps.setString(5, p.getMPI_Number());
            ps.setString(6, p.getMPI_Number1());
            ps.setString(7, p.getMPI_Number2());
            ps.setString(8, p.getStation_Step1());
            ps.setString(9, p.getStation_Step2());
            ps.executeUpdate();
//         
        } catch (SQLException ex) {
            Logger.getLogger(PartsSql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveRegister(EmployeeObj e) throws SQLException {

        try {

            // 2. Create a statement
//            myStmt = myConn.createStatement();
//            
            String query = " insert into register (idRegister, user, password, level)"
                    + " values (?,?,?,?)";
            myConn = getCon();
            Statement myqr = myConn.createStatement();
            myqr = myConn.createStatement();
            PreparedStatement ps = myConn.prepareStatement(query);
            ps.setInt(1, e.getIdRegister());
            ps.setString(2, e.getUser());
            ps.setString(3, e.getPassword());
            ps.setString(4, e.getLevel());
            ps.executeUpdate();
//         
        } catch (SQLException ex) {
            Logger.getLogger(PartsSql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<PartObj> show() {

        List<PartObj> part = new ArrayList<>();
        String sql = "select * from parts";
        PreparedStatement ps;
        try {
            myConn = getCon();
            ps = myConn.prepareStatement(sql);
            myRs = ps.executeQuery();
            while (myRs.next()) {
                PartObj e = new PartObj();
                e.setPartNumber(myRs.getInt("partNumber"));
                e.setName(myRs.getString("name"));
                e.setVersion(myRs.getString("Version"));
                e.setStation_Step(myRs.getString("Station_Step"));
                e.setMPI_Number(myRs.getString("MPI_Number"));
                e.setMPI_Number1(myRs.getString("MPI_Number1"));
                e.setMPI_Number2(myRs.getString("MPI_Number2"));
                e.setStation_Step1(myRs.getString("Station_Step1"));
                e.setStation_Step2(myRs.getString("Station_Step2"));

                part.add(e);

            }
        } catch (SQLException ex) {
            Logger.getLogger(PartsSql.class.getName()).log(Level.SEVERE, null, ex);
        }

        return part;
    }

    public void update(PartObj p) {

        String query = "update parts set name = ?, Version = ?, Station_Step = ?, MPI_Number = ?, MPI_Number1 = ?, MPI_Number2 = ?,"
                + "  Station_Step1 = ?, Station_Step2 = ? where partNumber = ?";
        try {
            myConn = getCon();
            Statement myqr = myConn.createStatement();
           
            PreparedStatement ps = myConn.prepareStatement(query);

            ps.setString(1, p.getName());
            ps.setString(2, p.getVersion());
            ps.setString(3, p.getStation_Step());
            ps.setString(4, p.getMPI_Number());
            ps.setString(5, p.getMPI_Number1());
            ps.setString(6, p.getMPI_Number2());
            ps.setString(7, p.getStation_Step1());
            ps.setString(8, p.getStation_Step2());
            ps.setInt(9, p.getPartNumber());
            // execute the java preparedstatement
            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(PartsSql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(int partNumber) {

        PreparedStatement preparedStmt = null;

        try {
            String query = "delete from parts where partNumber = ?";
            myConn = getCon();
            PartObj e = new PartObj();
            preparedStmt = myConn.prepareStatement(query);
            preparedStmt.setInt(1, partNumber);

            //   preparedStmt.execute(query);
            preparedStmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PartsSql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
