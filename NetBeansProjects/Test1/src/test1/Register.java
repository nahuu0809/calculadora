package test1;

public class Register {
    protected String createNewUser;
    protected String createNewPassword;
    protected String email;
    protected String phone;
    protected String birthday;

    public Register(String createNewUser, String createNewPassword, String email, String phone, String birthday) {
        this.createNewUser = createNewUser;
        this.createNewPassword = createNewPassword;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
    }

    public String getCreateNewUser() {
        return createNewUser;
    }

    public void setCreateNewUser(String createNewUser) {
        this.createNewUser = createNewUser;
    }

    public String getCreateNewPassword() {
        return createNewPassword;
    }

    public void setCreateNewPassword(String createNewPassword) {
        this.createNewPassword = createNewPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    
    }
    
    
