package controllers;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import models.Friends;
import models.ProfilePayload;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.profile;

public class ProfileController extends Controller {
	
	public Result displayPage() {
		return ok(profile.render(session().get("username")));
    }
	
	public Result getProfile() {
		String username = request().getQueryString("username");
		String user = request().getQueryString("name");
		
		//collect all confirmed friends
		String conFriends = Friends.getConfirmed(username);
//		System.out.println("confirmed");

		//collect all pending friend requests made by user
		String penFriends = Friends.getPending(username);
//		System.out.println("pending");
		
		//collect all friend requests from other users that are requesting user
		String reqFriends = Friends.getRequested(username);
//		System.out.println("requested");
		
        // Display users with partial or full match
		
		//collect request for user search where the username is not the same as the
		//logged in user and starts with the requested user name
		String message = Friends.getMessage(username, user);
		
		ProfilePayload payload = new ProfilePayload(conFriends, penFriends, reqFriends, message);
		return ok(Json.toJson(payload));
	}

	public Result getProfileJson(String username)
	{
		//collect all confirmed friends
		JsonObject conFriends = Friends.getConfirmedJson(username);

		//collect all pending friend requests made by user
		JsonObject penFriends = Friends.getPendingJson(username);

		//collect all friend requests from other users that are requesting user
		JsonObject reqFriends = Friends.getRequestedJson(username);

		JsonObject list = new JsonObject();
		list.add("confirmed", new JsonPrimitive(conFriends.toString()));
		list.add("pending", new JsonPrimitive(penFriends.toString()));
		list.add("requested", new JsonPrimitive(reqFriends.toString()));
		return ok(list.toString());
	}

}
