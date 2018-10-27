package test1;

public class Login {
    
  protected String userName;
  protected String password;

    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    } 
  public void mostrar(){
        System.out.println("Login");
        System.out.println("UserName:\t" +  userName);
        System.out.println("Password:\t\t" + password);
        
    } 
}
