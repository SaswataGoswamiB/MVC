package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Recontroller {

	
	//usng redirect prefix.
	@RequestMapping("/one")
	public String one() 
	{
		System.out.println("This is one handler");
		//using redrect prefix.
		return "redirect:/three";
		
		//this is s a elative URL.
	}
	
	//using RedirectView
	@RequestMapping("/three")
	public RedirectView three() 
	{
		RedirectView redirectView=new RedirectView();
		
		// If you give    redirectView.setUrl("/two");  you will be getting an error
		redirectView.setUrl("two");
		//redirectView.setUrl("https://www.google.com");
		return redirectView;
	}
	
	
	@RequestMapping("/two")
	public String two() 
	{
		System.out.println("This is second handle");
		return"contact";
	}
}
