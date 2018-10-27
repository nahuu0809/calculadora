package test1;

public class Myprofile {
    
    protected String Username;
    protected String email;
    protected String PhoneNum;

    public Myprofile(String Username, String email, String PhoneNum) {
        this.Username = Username;
        this.email = email;
        this.PhoneNum = PhoneNum;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }
    
   
}
