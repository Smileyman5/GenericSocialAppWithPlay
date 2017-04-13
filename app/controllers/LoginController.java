package controllers;

import models.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.login;

import java.util.HashMap;
import java.util.Map;
public class LoginController extends Controller {
    
    public Result displayPage() {
    	session().clear();
    	return ok(login.render());
    }
    
    public Result login(String username, String password) {
        
		Map<String, Boolean> map = new HashMap<>();
		map.put("criteria", false);
		map.put("loggedin", false);
		map.put("failed", false);

		if (username == null && password == null) {
		}
		else if ((username = username.trim()).length() == 0
				|| (password = password.trim()).length() == 0) {
			map.put("criteria", true);
		}
		else if (User.login(username, password)) {
			map.put("loggedin", true);
		}
		else {
			map.put("failed", true);
		}
		session().put("username", username);
    	return ok(Json.toJson(map));
    }

}
