package com.niit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllerz {
@RequestMapping("/")
public String name()
{
return "index";	
}
}
