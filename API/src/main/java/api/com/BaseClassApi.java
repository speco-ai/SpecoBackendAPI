package api.com;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;





@Path("/")
public class BaseClassApi 
{
	List<String> empty = new ArrayList<>();
	private DataService dataService = DataService.getInstance();
	@POST
	@Path("doctor")
    @Consumes(MediaType.APPLICATION_JSON)
 	@Produces(MediaType.APPLICATION_JSON)
 	public Response getdoctors(Doctors doctor)
 	{
 		return Response.status(200).entity(dataService.doctor(doctor)).build();
 	}
	
	 @GET
	 @Path("doctor")
     @Produces(MediaType.APPLICATION_JSON)
     public List<Doctors> getdoctors() {
         return dataService.getdoctors();
     }
     
	 @GET
	 @Path("doctor/{doctorid}")
	 @Produces(MediaType.APPLICATION_JSON)
	 public Response getdoctor(@PathParam("doctorid") String id) {
	        Doctors doctor = dataService.getdoctorbyid(id);
	        if (doctor == null) {
	        	 return Response
	   			      .status(Response.Status.NOT_FOUND)
	   			      .entity("Invalid doctor ID supplied"+doctor)
	   			      .build();
	        } else {
	            return Response.ok()
	                           .entity(doctor)
	                           .build();
	        }
	    }
	
	 @GET
	 @Path("onboarding")
	 @Produces(MediaType.APPLICATION_JSON)
	 public Response getonboardingesponse() {
			List<Onboarding> onboarding = new ArrayList<Onboarding>();
			onboarding.add(new Onboarding("Visual EMR  previous data","Get access to patient EMR from their previous consultation","preview.jpg"));
			onboarding.add(new Onboarding("Manage appointments easily","smart assistants prioritize appointments,facilitate consultation and schedule followups","images.png"));
			onboarding.add(new Onboarding("Seamless Data migration","Access via app and web","preview.jpg"));
			onboarding.add(new Onboarding("Automate invoice and billing","Leave your operation to us","image3.jpg"));
			
			 return Response
				      .status(Response.Status.OK)
				      .entity(onboarding)
				      .build();
		}
	 
	    @POST
		@Path("clinic")
	    @Consumes(MediaType.APPLICATION_JSON)
	 	@Produces(MediaType.APPLICATION_JSON)
	 	public Response getclinic(Clinic clinic)
	 	{
	    	return Response.status(200).entity(dataService.clinic(clinic)).build();
	 	}
	    
	     @GET
		 @Path("clinic")
	     @Produces(MediaType.APPLICATION_JSON)
	     public List<Clinic> getclinics() {
	         return dataService.getcliniclist();
	     }
	     
	     @GET
		 @Path("clinic/{clinicid}")
		 @Produces(MediaType.APPLICATION_JSON)
		 public Response getclinicbyid(@PathParam("clinicid") String id) {
		        Clinic clinic = dataService.getClinicById(id);
		        if (clinic == null) {
		            return Response.status(Response.Status.NOT_FOUND)
		                      .build();
		        } else {
		            return Response.ok()
		                           .entity(clinic)
		                           .build();
		        }
		    }
	     
	     @PUT
	     @Path("clinic/{clinicid}")
	     @Produces(MediaType.APPLICATION_JSON)
	     @Consumes(MediaType.APPLICATION_JSON)
	     public Response getCustomer(@PathParam("clinicid") String id,Clinic cs) {
	         Clinic cur = dataService.getClinicById(id);
	         if (cur == null) {
	             return Response.status(Response.Status.NOT_FOUND)
	                       .build();
	         } else {
	        	 return Response.ok()
	                            .entity(dataService.updateclinicdetails(id,cs.getClinicname(),cs.getRegistrationno(),cs.getLocation(),cs.getAadharcard(),cs.getEmailid(),cs.getQualificationname(),cs.getPhoneNumber(),cs.getInstitutename(),cs.getClinictype(),cs.getProcurementyear(),cs.getYearsofpractice(),cs.getAssociatedfacilites(),cs.getClinicregistration(),cs.getDocname()))
	                            .build();
	         }
	     }
	     
	     @DELETE
	     @Path("clinic/{clinicid}")
	     @Produces(MediaType.APPLICATION_JSON)
	     @Consumes(MediaType.APPLICATION_JSON)
	     public Response getdetail(@PathParam("clinicid") String id) {
	         Clinic del = dataService.getdeleteclinic(id);
	         if (del == null) {
	             return Response.status(Response.Status.NOT_FOUND)
	                       .build();
	         } else {
	        	 
	             return Response.ok()
	                            .entity(del)
	                            .build();
	         }
	     }
	     
	     @GET
		 @Path("paymentplans")
		 @Produces(MediaType.APPLICATION_JSON)
		 public Response getpaymentplansesponse() {
				List<Paymentplans> plans = new ArrayList<Paymentplans>();
				plans.add(new Paymentplans("image2.jpg","Basic plan rs999/month","your plan includes:1.advanced Calendar-manages appointment"+ "2.professional billing"+ "3.Unlimited appointment confirmation,reminders and followups"+ "4.share records with patients","Start your free 30day trial now"));
				plans.add(new Paymentplans("image2.jpg","Business plan rs1499/month","your plan includes:1.advanced Calendar-manages appointment"+"2.professional billing"+"3.Unlimited appointment confirmation,reminders and followups"+"4.share records with patients"+"5.supports 13local languages"+"6.patient education tips and videos"+"24/7 helpdesk support","Start your free 30day trial now"));
				
				return Response
					      .status(Response.Status.OK)
					      .entity(plans)
					      .build();
			}
		 
	     
}
