package se.chalmers.dm;

import com.github.javafaker.Bool;

public class User {
    private int ID;
    private String Ssn;
    private String FName;
    private String LName;
    private String Email;
    private Bool isActive;

    public User(int ID, String Ssn, String FName, String LName, String Email, Bool isActive){

        this.ID = ID;
        this.Ssn = Ssn;
        this.FName = FName;
        this.LName = LName;
        this.Email = Email;
        this.isActive = isActive;



    }


}
