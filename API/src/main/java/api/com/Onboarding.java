package api.com;

public class Onboarding 
{
private String title;
private String description;
private String image;


public Onboarding(String title, String description, String image) {
	// TODO Auto-generated constructor stub
	this.title=title;
	this.description=description;
	this.image=image;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}


}


