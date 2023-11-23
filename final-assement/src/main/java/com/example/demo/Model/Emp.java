package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Emp {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
   
    private String uname;
    private String upassword;
    private String uemail;
    private String ucontact;

    public Emp() {
    }

    public String getUname() {
        return uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public String getUemail() {
        return uemail;
    }

    public String getUcontact() {
        return ucontact;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public void setUcontact(String ucontact) {
        this.ucontact = ucontact;
    }

    @Override
    public String toString() {
        return "Emp [uname=" + uname + ", upassword=" + upassword + ", uemail=" + uemail + ", ucontact=" + ucontact
                + "]";
    }
}
