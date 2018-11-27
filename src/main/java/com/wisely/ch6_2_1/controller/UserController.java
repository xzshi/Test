package com.wisely.ch6_2_1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wisely.ch6_2_1.Person;

@Controller
public class UserController {

	public String index(Model model) {
		Person single = new Person("aa", 11);
		List<Person> people = new ArrayList<Person>();
		Person p1 = new Person("xx", 11);
		Person p2 = new Person("yy", 22);
		Person p3 = new Person("zz", 33);
		people.add(p1);
		people.add(p2);
		people.add(p3);
		model.addAttribute("singlePerson", single);
		model.addAttribute("people", people);
		return "index";
	}
    
    /**
     * Ê×Ò³
     * @return
     */
    @RequestMapping("/")
    public String page(){
        return "system/index";
    }
 
 
    /**
     * Ìø×ª
     * @return
     */
    @RequestMapping("/redirect")
    public String page2(){
        return "redirect/redirect";
    }
 
 
    /**
     *ÊÓÍ¼
     * @param model
     * @return
     */
    @RequestMapping("/model")
    public String page3(Model model){
        model.addAttribute("name","seawater");
        return "hello";
    }

}