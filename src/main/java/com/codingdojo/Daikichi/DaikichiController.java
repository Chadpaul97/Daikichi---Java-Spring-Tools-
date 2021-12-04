package com.codingdojo.Daikichi;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome";
	}
	
	@RequestMapping(value="/daikichi/today", method=RequestMethod.GET)
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping(value="/daikichi/tomorrow", method=RequestMethod.GET)
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
    @RequestMapping(value="/daikichi/travel/kyoto", method=RequestMethod.GET)
    public String daikichi() {
    	return "Congratulations! You will soon travel to kyoto!";
    }
    
    @RequestMapping("/daikichi/travel/{city}")
    public String travel(@PathVariable("city") String city){
    	return "Congratulations! You will soon travel to" + city;
    }
    
    @RequestMapping("/daikichi/lotto/{number}")
    public String lotto(@PathVariable("number") String number){
    	int intNum = Integer.parseInt(number);
    	if( intNum % 2 == 0) {
    		return "You will take a grand journey in the near future, but be weary of tempting offers";
    	}
    	else {
    		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
    	}
    }
	

}
