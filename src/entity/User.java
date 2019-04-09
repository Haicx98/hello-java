package entity;

import java.util.ArrayList;
import java.util.HashMap;

public class User {
    private String username;
    private String password;
    private String fullname;
    private String email;
    private HashMap<String, ArrayList> errorsUser;
    private HashMap<String, ArrayList> errorsPassword;
    private HashMap<String, ArrayList> errorsFullname;
    private HashMap<String, ArrayList> errorsEmail;

    public User() {
    }

    public User(String username, String password, String fullname, String email) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void validateUser(){
        this.errorsUser = new HashMap<>();
        ArrayList listErrorsUser = new ArrayList();
        if(this.username == null){
        listErrorsUser.add("username can not be null");
        }if (this.username.length() > 50 || this.username.length() < 2){
            listErrorsUser.add("username must have from 2 to 50 characters");
        }
        this.errorsUser.put("username",listErrorsUser);
    }

    public void validatePassword(){
        this.errorsPassword = new HashMap<>();
        ArrayList listErrorsPassword = new ArrayList();
        if(this.password == null){
            listErrorsPassword.add("username can not be null");
        }if (this.password.length() > 50 || this.password.length() < 2){
            listErrorsPassword.add("username must have from 2 to 50 characters");
        }
        this.errorsUser.put("password",listErrorsPassword);
    }

    public void validateFullname(){
        this.errorsFullname = new HashMap<>();
        ArrayList listErrorsFullname = new ArrayList();
        if(this.fullname == null){
            listErrorsFullname.add("username can not be null");
        }if (this.fullname.length() > 50 || this.fullname.length() < 2){
            listErrorsFullname.add("username must have from 2 to 50 characters");
        }
        this.errorsUser.put("username",listErrorsFullname);
    }

    public void validateEmail(){
        this.errorsEmail = new HashMap<>();
        ArrayList listErrorsEmail = new ArrayList();
        if(this.email == null){
            listErrorsEmail.add("username can not be null");
        }if (this.username.length() > 50 || this.username.length() < 2){
            listErrorsEmail.add("username must have from 2 to 50 characters");
        }
        this.errorsUser.put("username",listErrorsEmail);
    }

    public  HashMap<String,ArrayList> getErrorsUser(){
        validateUser();
        return this.errorsUser;
    }

    public HashMap<String,ArrayList> getErrorsPassword(){
        validatePassword();
        return this.errorsPassword;
    }

    public HashMap<String,ArrayList> getErrorsFullname(){
        validateFullname();
        return this.errorsFullname;
    }

    public HashMap<String,ArrayList> getErrorsEmail(){
        validateEmail();
        return this.errorsEmail;
    }

}
