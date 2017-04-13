package models;

import com.avaje.ebean.Model;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Friends")
public class Friends extends Model {
	
	@EmbeddedId
	public Friendship friendship;
	
	public String status;
	
	
	public Friends(String username, String friend, String status) {
		this.friendship = new Friendship(username, friend);
		this.status = status;
	}

	public static Finder<Friendship, Friends> find = new Finder<Friendship, Friends>(Friends.class);

	public static String getConfirmed(String username) {
	    String list = "<br/><br/><div class='container'>" +
                "   <div class='row'>\n";
		List<Friends> users = find.where().eq("username", username).eq("status", "Confirmed").findList();
		if (users.isEmpty()) {
			return list;
		}
		for (Friends u: users) {
		    list += "   <div class='col s12 m4 z-depth-2'>" +
                    "       <div class='icon-block'>" +
                    "           <h2 class='center'><img src=\"https://www.drupal.org/files/profile_default.jpg\" alt=\"\" class=\"circle\" width='42' height='42'></h2>\n" +
                    "           <h5 class='center'>" + u.friendship.friend + "</h5>\n" +
                    "       </div>\n" +
                    "   </div>\n";
		}
		list += "   </div>\n" +
                "</div>\n";
		return list;
	}
	
	public static String getPending(String username) {
        String list = "<br/><br/><div class='container'>" +
                "   <div class='row'>\n";
		List<Friends> users = find.where().eq("friend", username).eq("status", "Pending").findList();
		if (users.isEmpty()) {
			return "";
		}
		for (Friends u: users) {
            list += "   <div class='col s12 m4 z-depth-2'>" +
                    "       <div class='icon-block'>" +
                    "           <h2 class='center'><img src=\"https://www.drupal.org/files/profile_default.jpg\" alt=\"\" class=\"circle\" width='42' height='42'></h2>\n" +
                    "           <h5 class='center'>" + u.friendship.username + "</h5>\n" +
                    "           <p class='center'>" +
                    "               <a onclick=\"updateFriends('" + u.friendship.username + "', 'PUT')\" class=\"btn-floating halfway-fab waves-effect waves-light blue\"><i class=\"material-icons\">add</i></a>" +
                    "               <a onclick=\"updateFriends('" + u.friendship.username + "', 'DELETE')\" class=\"btn-floating halfway-fab waves-effect waves-light red\"><i class=\"material-icons\">remove</i></a>\n" +
                    "           </p>\n" +
                    "       </div>\n" +
                    "   </div>\n";
		}
        list += "   </div>\n" +
                "</div>\n";
		return list;
	}
	
	public static String getRequested(String friend) {
        String list = "<br/><br/><div class='container'>" +
                "   <div class='row'>\n";
		List<Friends> users = find.where().eq("username", friend).eq("status", "Pending").findList();
		if (users.isEmpty()) {
			return "";
		}
		for (Friends u: users) {
            list += "   <div class='col s12 m4 z-depth-2'>" +
                    "       <div class='icon-block'>" +
                    "           <h2 class='center'><img src=\"https://www.drupal.org/files/profile_default.jpg\" alt=\"\" class=\"circle\" width='42' height='42'></h2>\n" +
                    "           <h5 class='center'>" + u.friendship.friend + "</h5>\n" +
                    "       </div>\n" +
                    "   </div>\n";
		}
        list += "   </div>\n" +
                "</div>\n";
		return list;
	}

	public static JsonObject getConfirmedJson(String username) {
		JsonObject confirmed = new JsonObject();
		JsonArray list = new JsonArray();
		List<Friends> users = find.where().eq("username", username).eq("status", "Confirmed").findList();
		if (users.isEmpty()) {
			return confirmed;
		}
		for (Friends u: users) {
			list.add(new JsonPrimitive(u.friendship.username));
		}
		confirmed.add("confirmed", list);
		return confirmed;
	}

	public static JsonObject getPendingJson(String username) {
		JsonObject pending = new JsonObject();
		JsonArray list = new JsonArray();
		List<Friends> users = find.where().eq("friend", username).eq("status", "Pending").findList();
		if (users.isEmpty()) {
			return pending;
		}
		for (Friends u: users) {
			list.add(new JsonPrimitive(u.friendship.username));
		}
		pending.add("pending", list);
		return pending;
	}

	public static JsonObject getRequestedJson(String friend) {
		JsonObject requested = new JsonObject();
		JsonArray list = new JsonArray();
		List<Friends> users = find.where().eq("username", friend).eq("status", "Pending").findList();
		if (users.isEmpty()) {
			return requested;
		}
		for (Friends u: users) {
			list.add(new JsonPrimitive(u.friendship.username));
		}
		requested.add("requested", requested);
		return requested;
	}

	public static String getMessage(String username, String friend) {
		String list = "";
		List<User> users = User.find.where().istartsWith("username", friend).ne("username", username).findList();
		if (users.isEmpty() || friend.equals(""))
			return "";
		users = filterFriends(users, username);
		for (User u: users) {
			list += "<a href=\"#!\">" + u.username + "</a>\n";
//					+ "<button onclick=\"updateFriends('" + u.username + "', 'POST')\">Add Friend</button>\n";
		}
//		list += "<br>\n";
		return list;
	}
	
	private static List<User> filterFriends(List<User> users, String username) {
		List<Friends> friends = find.where().eq("username", username).findList();
		ArrayList<String> list = new ArrayList<String>();
		for (Friends f: friends) {list.add(f.friendship.friend);}
		
		friends = find.where().eq("friend", username).findList();
		ArrayList<String> list2 = new ArrayList<String>();
		for (Friends f: friends) {list2.add(f.friendship.username);}
		
		for (int i = 0; i < users.size(); i++){
			if (list.contains(users.get(i).username) || list2.contains(users.get(i).username)) {
				users.remove(i);
				i--;
			}
		}
		return users;
	}
	
	public void setUsername(String username) {
		friendship.username = username;
	}

	public void setFriend(String friend) {
		friendship.friend = friend;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
