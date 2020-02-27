package se.chalmers.dm;

import com.github.javafaker.Address;

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


    public static void insertFakeUsers(int n){

        Address adress = new Address();
        int ID = 0;
        Statement statement = null;
        for(int i = 0; i < n; i++){

            statement.executeQuery("INSERT INTO tbl_user VALUES" + "(" +
                    ID++;



        }

    }

}


