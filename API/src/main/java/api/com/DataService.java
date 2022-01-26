package api.com;

import java.util.ArrayList;
import java.util.List;


public class DataService 
{
	 private List<Doctors> doctor = new ArrayList<>();
	 private List<Clinic> clinic = new ArrayList<>();
	 private static DataService ourInstance = new DataService();
	 public static DataService getInstance() 
	 {
	        return ourInstance;
	 }
	 public String doctor(Doctors doctors) 
	 {
	        String newId = Integer.toString(doctor.size() + 1);
	        doctors.setId(newId);
	        doctor.add(doctors);
	        return "Data added successfully"+doctor;
	 }
	 public String doctor(
	    		String name,String registrationno,String practice, String institutename,String experience,String qualificationname,String phoneno,String procurementyear,
	    		String overview) 
	 {
	        Doctors doctor = new Doctors();
	        doctor.setName(name);
	        doctor.setRegistrationno(registrationno);;
	        doctor.setPractice(practice);
	        doctor.setInstitute(institutename);
	        doctor.setExperience(experience);
	        doctor.setQualification(qualificationname);
	        doctor.setPhone(phoneno);;
	        doctor.setProcurement(procurementyear);
	        doctor.setOverview(overview);
	        return doctor(doctor);
	  }
	  public List<Doctors> getdoctors() 
	  {
	        return doctor;
	  }
	  public Doctors getdoctorbyid(String id)
	  {
	        for (Doctors doctors : doctor) 
	        {
	            if (doctors.getId().equals(id)) {
	                return doctors;
	            }
	        }

	        return null;
	  }
	  
	  public String clinic(Clinic clinics) {
	        String newId = Integer.toString(clinic.size() + 1);
	        clinics.setId(newId);
	        clinic.add(clinics);
	        return "Clinic added successfully";
	    }
	   public String clinic(String clinicname, String registrationno, String location
			    ,String aadharcardno,String emailid,String qualificationname,String phoneno,String institutename,
			    String clinictype,String procurementyear,String yearsofpractice,String associatedfacilites,
			    String clinicregistration,String docname) 
	  {
			        Clinic clinics = new Clinic();
			        clinics.setClinicname(clinicname);
			        clinics.setRegistrationno(registrationno);
			        clinics.setLocation(location);
			        clinics.setAadharcard(aadharcardno);
			        clinics.setEmailid(emailid);
			        clinics.setQualificationname(qualificationname);
			        clinics.setPhoneNumber(phoneno);
			        clinics.setInstitutename(institutename);
			        clinics.setClinictype(clinictype);
			        clinics.setProcurementyear(procurementyear);
			        clinics.setYearsofpractice(yearsofpractice);
			        clinics.setAssociatedfacilites(associatedfacilites);
			        clinics.setClinicregistration(clinicregistration);
			        clinics.setDocname(docname);
			        return clinic(clinics);
	  }
	   public List<Clinic> getcliniclist() {
	        return clinic;
	    }
	 
		 public Clinic getClinicById(String id)
		 {
		        for (Clinic register : clinic) {
		            if (register.getId().equals(id)) {
		                return register;
		            }
		        }
	
		        return null;
		 }
		 public Clinic getdeleteclinic(String id) 
		 {
		        for (Clinic clinics : clinic) {
		            if (clinics.getId().equals(id))
		            {
						clinic.remove(clinics);
					 }
		            return clinics;
		        }
				return null;
		       
		    }
		 public Clinic updateclinicdetails(String id,String clinicname, String registrationno, String location
				    ,String aadharcardno,String emailid,String qualificationname,String phoneno,String institutename,
				    String clinictype,String procurementyear,String yearsofpractice,String associatedfacilites,
				    String clinicregistration,String docname)
		 {
			 for (Clinic cd : clinic) { 
		            if (cd.getId().equals(id)) 
		            {
		            	cd.setClinicname(clinicname);
		            	cd.setRegistrationno(registrationno);
		            	cd.setLocation(location);
				        cd.setAadharcard(aadharcardno);
				        cd.setEmailid(emailid);
				        cd.setQualificationname(qualificationname);
				        cd.setPhoneNumber(phoneno);
				        cd.setInstitutename(institutename);
				        cd.setClinictype(clinictype);
				        cd.setProcurementyear(procurementyear);
				        cd.setYearsofpractice(yearsofpractice);
				        cd.setAssociatedfacilites(associatedfacilites);
				        cd.setClinicregistration(clinicregistration);
				        cd.setDocname(docname);
		            	return cd;
		            	
		            }
			 }
			return null;
		 }
		 
		 
}
