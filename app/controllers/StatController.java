package controllers;

import models.User;
import play.mvc.Controller;
import play.mvc.Result;

public class StatController extends Controller {
	
	public Result updateStats(String username) {
    	if (username != null) {
    		User.incrementLogin(username);
    	}
		return ok();
	}
	
}
