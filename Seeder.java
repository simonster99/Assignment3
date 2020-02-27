package se.chalmers.dm;

import com.github.javafaker.Address;
import com.github.javafaker.Bool;
import com.github.javafaker.Faker;

import java.sql.SQLException;
import java.sql.Statement;
public class Seeder {

    public static void createUserTable() {
        Statement statement = null;
        try {

            statement.executeQuery("CREATE TABLE tbl_user ID INTEGER PRIMARY KEY, INTEGER Ssn, " +
                    "FName VARCHAR, LName VARCHAR, Email VARCHAR, isActive boolean;");


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public static void insertFakeUsers(int n) throws SQLException {
        Faker faker = new Faker();
        int ID = 0;
        Statement statement = null;
        for(int i = 0; i < n; i++){

            String FName = faker.name().firstName();
            String LName = faker.name().lastName();
            String Ssn = faker.idNumber().ssnValid();
            Address Address = faker.address();
            String Email = FName+LName+"@gmail.com";
            Bool isActive = faker.bool();

            statement.executeQuery("INSERT INTO tbl_user VALUES" + "("+ID+", "+Ssn+", "+FName+", "+LName+", "+
                    Email+", "+isActive);

                    ID++;



        }

    }

}


