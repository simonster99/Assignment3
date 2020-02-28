package se.chalmers.dm;

import com.github.javafaker.Address;
import com.github.javafaker.Bool;
import com.github.javafaker.Faker;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Seeder {

    private ArrayList<User> Users = new ArrayList<>();

    public static void createUserTable() {
        Statement statement = null;
        try {

            statement.executeQuery("CREATE TABLE tbl_user ID INTEGER PRIMARY KEY, INTEGER Ssn, " +
                    "FName VARCHAR, LName VARCHAR, Email VARCHAR, isActive boolean;");


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public void insertFakeUsers(int n) throws SQLException {

        Faker faker = new Faker();

        int ID = 0;

        Statement statement = null;

        for(int i = 0; i < n; i++){

            String FName = faker.name().firstName();
            String LName = faker.name().lastName();
            String Ssn = faker.idNumber().ssnValid();
            String Email = FName+LName+"@gmail.com";
            Bool isActive = faker.bool();

            statement.executeQuery("INSERT INTO tbl_user VALUES" + "("+ID+", "+Ssn+", "+FName+", "+LName+", "+
                    Email+", "+isActive+";");

                    ID++;

                    User user = new User(ID, Ssn, FName, LName, Email, isActive);
                    Users.add(user);

        }

    }
      public static void createWebPageTable(){
            Statement statement = null;
            try {

                statement.executeQuery("CREATE TABLE tbl_webpage ID INTEGER PRIMARY KEY, URL VARCHAR, " +
                        "AUTHOR VARCHAR FOREIGN KEY, Content VARCHAR, popularity FLOAT;");


            } catch (SQLException e) {
                e.printStackTrace();
            }

    }

    public static void seeder.insertFakeWebPage(200){
        Faker faker = new Faker();
        int id = 0;
        int author;


        Statement statement = null;
        for(int i = 0; i < n; i++){

            String content = faker.chuckNorris();

            double randNumber = Math.random();
            d = randNumber * 100;
            int popularity = (int)d + 1;

            URL myURL = new URL("http://example.com/");

            statement.executeQuery("INSERT INTO tbl_webpage VALUES" + "("+id+", "+author+", "+url+", "+content+", "+
                    popularity);

            id++;
        }
        if ()

    }

}


