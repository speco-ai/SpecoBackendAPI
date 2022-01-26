package api.com;

public class Doctors 
{
	private String id;
	private String registrationno;
	private String procurement;
    private String overview;
    private String practice;
	private String institute;
	private String name;
	private String qualification;
	private String experience;
	private String phone;
	private String status;
	private String img;
	private String ongoingpatient;
	private String treatedpatient;
	
	public Doctors()
	{
		
	}
	public Doctors(String name,String qualification,String experience,String phone,String status,String img,String ongoingpatient,String treatedpatient)
	{
		this.name = name;
		this.qualification = qualification;
		this.experience = experience;
		this.status = status;
		this.img = img;
		this.ongoingpatient = ongoingpatient;
		this.treatedpatient = treatedpatient;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getOngoingpatient() {
		return ongoingpatient;
	}

	public void setOngoingpatient(String ongoingpatient) {
		this.ongoingpatient = ongoingpatient;
	}

	public String getTreatedpatient() {
		return treatedpatient;
	}

	public void setTreatedpatient(String treatedpatient) {
		this.treatedpatient = treatedpatient;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRegistrationno() {
		return registrationno;
	}
	public void setRegistrationno(String registrationno) {
		this.registrationno = registrationno;
	}
	public String getProcurement() {
		return procurement;
	}
	public void setProcurement(String procurement) {
		this.procurement = procurement;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getPractice() {
		return practice;
	}
	public void setPractice(String practice) {
		this.practice = practice;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	


}
