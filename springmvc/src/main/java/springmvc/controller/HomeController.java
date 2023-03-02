package springmvc.controller;

import java.security.PublicKey;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.internal.compiler.ast.ReturnStatement;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	//adding MODEL object in the paramteter.
	public String home(Model model) 
	{
		
		//returns the name f the view  i.e  index.jsp
		
		System.out.println("This is home Controller");
		//adding data uisng key value pair.
		model.addAttribute("name", "Saswata Goswami");
		
		List<String> friends=new ArrayList<String>();
		
		friends.add("emni");
		friends.add("abc");
		friends.add("Kangana");
		
		//adding key value pair
		model.addAttribute("lulu", friends);
		return  "index";
	}
	
	@RequestMapping("/about")
	public String about() 
	{
		System.out.println("Thi is about controller");
		return  "about";
	}
	
	
	@RequestMapping("/direct")
	public ModelAndView help() 
	{
		ModelAndView modelAndView=new ModelAndView();
		//setting the data
		modelAndView.addObject("name", "Bemni");
		//setting view name
		modelAndView.setViewName("help");
		
		//sending time
		
		LocalDateTime loc=LocalDateTime.now();
		
		modelAndView.addObject("now", loc);
		
		
		System.out.println("This is help Controller");
		return modelAndView;
	}
	
	@RequestMapping("/help")
	public ModelAndView direct() 
	{
		ModelAndView mode=new ModelAndView();
		
		mode.addObject("name","saswata");
		mode.addObject("kalpan","behenchod");
		//mode.setViewName("help");
		
		//Creating List of marks
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(22);
		mode.addObject("arr", list);
		
		System.out.println("Thsi is direct Controller");
		
		return  mode;
		
	}
}
