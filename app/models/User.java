package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User extends Model {
	
	@Id
	String username;
	
	@Constraints.Required
	String password;
	
	String birthday;
	
	String first_name;
	
	String last_name;
	
	String gender;
	
	int login;
	
	public static Finder<String, User> find = new Finder<String, User>(User.class);
	
	public static boolean login (String user, String pass)
    {
        User u = find.byId(user);
        return u != null && u.username.equals(user) && u.password.equals(pass);
    }
	
	public static void incrementLogin(String username) {
		User user = find.byId(username);
		user.setLogin(user.login + 1);
		user.update();
	}

	public static void createUser(String user, String pass)
    {
        User newUser = new User();
        newUser.username = user;
        newUser.password = pass;
        newUser.save();
    }

    public String getUsername()
	{
		return username;
	}
	
	public void setLogin(int login) {
		this.login = login;
	}
	
}
