package springmvc.controller;


import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import springmvc.model.*;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String  showForm() 
	{
		//name of the view
		System.out.println("Inside Contact Controller");
		return  "contact"; 
	}

	// creating a handler method for form action.
	
	
	//old method
	@RequestMapping(path="/processform",method = RequestMethod.PUT)
	public String handleForm(HttpServletRequest request) 
	{
	String emailString = request.getParameter("email");
	System.out.println("Emial is "+emailString);
		return "";
	}
	
	//new approcah
	
	//here request param maps the input to the respective paramteter varibles.
	
	
//	@RequestMapping(path="/processform")
//	public ModelAndView handleForm (
//			@RequestParam("email") String email , 
//			@RequestParam("name") String name ,
//			@RequestParam("passowrd") String userpassword
//			) 
//	
//	{
//		
//		springmvc.model.User ussUser=new springmvc.model.User();
//		
//		//Here we have used this USer class instead of ssending individual attributes to the JSP pae
//		
	//we are creating a  USer object and setting the data in it and sending the object itself.
	
//	ModelAndView modelAndView=new ModelAndView();
	
	
//		ussUser.setEmail(email);
//		ussUser.setName(name);
//		ussUser.setPassowrd(userpassword);
//		
//		System.out.println(ussUser);
	
//	modelAndView.addObject("user", ussUser);
//		
//		
	
	
	//we can use the above method or we can use  this method
	

////		modelAndView.addObject("name", name);
////		modelAndView.addObject("email", email);
////		modelAndView.addObject("password", userpassword);
//	
	

//		modelAndView.setViewName("ResultofContact");
//		
//		return modelAndView;
//	}
	
	@RequestMapping(path="/processform")
	public ModelAndView handleForm (@ModelAttribute springmvc.model.User user) 
	
	//so it does the work of binding the form values to the class attribute
	//also it sends the User object to the mentioned View Page using the addObject() internally so 
	//we donot have to use the line no 93.
	
	{
		ModelAndView modelAndView=new ModelAndView();
		//so this User object and the  method paramater User object are the same.
		//modelAndView.addObject("user", user);
		modelAndView.setViewName("ResultofContact");
		
		return modelAndView;
	}
	
	
	
}
