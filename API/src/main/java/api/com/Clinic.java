package api.com;

public class Clinic {
    private String id;
    private String clinicname;
    private String registrationno;
    private String location;
    private String aadharcard;
    private String emailid;
    private String qualificationname;
    private String phoneNumber;
    private String institutename;
    private String clinictype;
    private String procurementyear;
    private String yearsofpractice;
    private String associatedfacilites;
    private String clinicregistration;
    private String docname;
    
    

    public Clinic() {
    }

    public Clinic(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getId() {
        return id;
    }

   
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


	public String getClinicname() {
		return clinicname;
	}

	public void setClinicname(String clinicname) {
		this.clinicname = clinicname;
	}

	public String getRegistrationno() {
		return registrationno;
	}

	public void setRegistrationno(String registrationno) {
		this.registrationno = registrationno;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAadharcard() {
		return aadharcard;
	}

	public void setAadharcard(String aadharcard) {
		this.aadharcard = aadharcard;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getQualificationname() {
		return qualificationname;
	}

	public void setQualificationname(String qualificationname) {
		this.qualificationname = qualificationname;
	}

	public String getInstitutename() {
		return institutename;
	}

	public void setInstitutename(String institutename) {
		this.institutename = institutename;
	}

	public String getClinictype() {
		return clinictype;
	}

	public void setClinictype(String clinictype) {
		this.clinictype = clinictype;
	}

	public String getProcurementyear() {
		return procurementyear;
	}

	public void setProcurementyear(String procurementyear) {
		this.procurementyear = procurementyear;
	}

	public String getYearsofpractice() {
		return yearsofpractice;
	}

	public void setYearsofpractice(String yearsofpractice) {
		this.yearsofpractice = yearsofpractice;
	}

	public String getAssociatedfacilites() {
		return associatedfacilites;
	}

	public void setAssociatedfacilites(String associatedfacilites) {
		this.associatedfacilites = associatedfacilites;
	}

	public String getClinicregistration() {
		return clinicregistration;
	}

	public void setClinicregistration(String clinicregistration) {
		this.clinicregistration = clinicregistration;
	}

	public String getDocname() {
		return docname;
	}

	public void setDocname(String docname) {
		this.docname = docname;
	}
}