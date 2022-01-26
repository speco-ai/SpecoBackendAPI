package api.com;


public class Paymentplans 
{
private String title;
private String description;
private String image;
private String button1;



public Paymentplans(String title, String description, String image, String button1) 
{
	this.image = image;
	this.title = title;
	this.description = description;
	this.button1 = button1;
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


public String getButton1() {
	return button1;
}
public void setButton1(String button1) {
	this.button1 = button1;
}

}


