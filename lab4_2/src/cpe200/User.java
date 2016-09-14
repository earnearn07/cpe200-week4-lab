package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;
    private String user_pattern = new String("^[A-Za-z][A-Za-z0-9]{7,}$") ;
    private String pass_pattern = new String("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$");
    public User() {}
    public boolean setUserName(String name) {this.userName = (name.matches(user_pattern))?name:this.userName; return name.matches(user_pattern);}
    public boolean setPassword(String name) {this.password = (name.matches(pass_pattern))?name:this.password; return name.matches(pass_pattern);}
    public String getUserName() {return this.userName;}
    public String getPassword() {return this.password;}
}
