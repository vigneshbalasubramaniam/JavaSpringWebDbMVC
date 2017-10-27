/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spr.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao emp;
    @RequestMapping(value="/homePage", method=RequestMethod.GET)
    public ModelAndView login()
    {
        return new ModelAndView("homePage","command",new Employee());
    }
 @RequestMapping(value="/viewemployee", method=RequestMethod.POST)
 public String viewUser(@ModelAttribute("web") Employee employee,ModelMap model)
         {
             emp.insert(employee.getEid(),employee.getEname(),employee.getStreet(),employee.getLocation());
            /* model.addAttribute("eid",employee.getEid());
             model.addAttribute("ename",employee.getEname());
             model.addAttribute("street",employee.getStreet());
             model.addAttribute("location",employee.getLocation());*/
             List list= emp.display();
             model.addAttribute("list",list);
             return "result";
         }
 
}
