package edu.mum.waa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.waa.service.AdviceService;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AdviceController  {
	
	  @Autowired
	  AdviceService adviceService;

 		@RequestMapping (value="/advice",method = RequestMethod.GET)
		public String adviceForm(Model model) {
		
 			Map<Integer,String> roasts = adviceService.getAllRoasts();
 			model.addAttribute("roasts",roasts);
			
			return "advice";
		}

	  @RequestMapping (value="/advice",method = RequestMethod.POST)
	  public String adviceList(Integer roastKey, Model model, RedirectAttributes redirectAttributes) throws Exception {

		  String roast = adviceService.getRoast(roastKey);
 		List<String> roastList  = adviceService.getListByType(roast);
 
//		model.addAttribute("roast",roast);
//		model.addAttribute("roastList",roastList);
          redirectAttributes.addFlashAttribute("roast",roast);
          redirectAttributes.addFlashAttribute(roastList);
 		
		return "redirect:/roastDetails" ;
 
	}
	@RequestMapping(value="/roastDetails", method=RequestMethod.GET)
    public String adviceDetails(Model model){
 		    return "display";
    }
	
 
}
