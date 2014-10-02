package org.wtm.entity;

import com.google.gson.annotations.SerializedName;

public class Subscription {

	private Integer id; 
	private String name; 
	@SerializedName("screen_name")
	private String screenName; 
	@SerializedName("is_close")
	private Integer isClosed; 
	@SerializedName("is_admin")
	private Integer isAdmin;
	@SerializedName("is_member")
	private Integer isMember;
	
    @SerializedName("photo_50")
    private String photo50;
    @SerializedName("photo_100")
    private String photo100;
    @SerializedName("photo_200")
    private String photo200;
	private String type;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
	private String lastName;
	
       
    
    public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getScreenName() {
		return screenName;
	}




	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}




	public Integer getIsClosed() {
		return isClosed;
	}




	public void setIsClosed(Integer isClosed) {
		this.isClosed = isClosed;
	}




	public Integer getIsAdmin() {
		return isAdmin;
	}




	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}




	public Integer getIsMember() {
		return isMember;
	}




	public void setIsMember(Integer isMember) {
		this.isMember = isMember;
	}




	public String getPhoto50() {
		return photo50;
	}




	public void setPhoto50(String photo50) {
		this.photo50 = photo50;
	}




	public String getPhoto100() {
		return photo100;
	}




	public void setPhoto100(String photo100) {
		this.photo100 = photo100;
	}




	public String getPhoto200() {
		return photo200;
	}




	public void setPhoto200(String photo200) {
		this.photo200 = photo200;
	}




	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	@Override
	public String toString() {
		return "Subscription [id=" + id + ", name=" + name + ", screenName="
				+ screenName + ", isClosed=" + isClosed + ", isAdmin="
				+ isAdmin + ", isMember=" + isMember + ", photo50=" + photo50
				+ ", photo100=" + photo100 + ", photo200=" + photo200
				+ ", type=" + type + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}
    
    
     
     
    
}
