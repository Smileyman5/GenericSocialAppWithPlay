package controllers;

import models.Friends;
import play.mvc.Controller;
import play.mvc.Result;

public class FriendController extends Controller {

	public Result displayPage(String username)
	{
		// La dee da da La de da da!!! Do dah!
		return ok(views.html.friends.render(username));
	}

	//post request
	public Result addFriend(String username, String name) {
		System.out.println("Adding a friend with username " + username + " and friend " + name);
		if (username != null && name != null) {
			new Friends(username, name, "Pending").save();
		}
		return ok();
	}
	
	//put request
	public Result acceptRequest(String username, String name) {
		if (username != null && name != null) {
			Friends friend = Friends.find.where()
					.eq("username", name)
					.eq("friend", username)
					.eq("status", "Pending")
					.findList()
					.get(0);
			friend.setStatus("Confirmed");
			friend.update();
			new Friends(username, name, "Confirmed").save();
		}
		return ok();
	}
	
	//delete request
	public Result deleteRequest(String username, String name) {
		if (username != null && name != null) {
			Friends.find.where()
				.eq("username", name)
				.eq("friend", username)
				.eq("status", "Pending")
				.findList().get(0).delete();
		}
		return ok();
	}

}
