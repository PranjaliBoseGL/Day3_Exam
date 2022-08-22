package com.customer.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class CustomerController {

 @RequestMapping("/hello")

 public String sayHello(@RequestParam("cid") int cid, @RequestParam("cname") String cname, @RequestParam("cphone") String cphone,@RequestParam("caddress") String caddress, @RequestParam("cloginid") String cloginid,@RequestParam("cpassword") String cpassword, Model m)

 {
	 m.addAttribute("cid",cid);
	 m.addAttribute("cname",cname);
	 m.addAttribute("cphone",cphone);
	 m.addAttribute("caddress",caddress);
	 m.addAttribute("cloginid",cloginid);
	 m.addAttribute("cpassword",cpassword);

	 return "viewpage";

 }
 @RequestMapping("/xx")
 public String xx()
 {
	 return "viewpage1";
 }

}