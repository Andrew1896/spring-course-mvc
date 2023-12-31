package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

//@Controller
//public class MyController {
//
//    @RequestMapping("/")
//    public String showFirstView() {
//        return "first-view";
//    }
//
//    @RequestMapping("/askDetails")
//    public String askEmployeeDeatails() {
//        return "ask-emp-details-view";
//    }
//
//    @RequestMapping("/showDetails")
//    public String showEmpDetails(){
//        return "show-emp-details-view";
//    }
//
//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("description", " - udemy instructor" );
//
//        return "show-emp-details-view";
//    }
//
//
//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@RequestParam ("employeeName") String empName, Model model) {
//
//        empName = "Mr. " + empName + "!";
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("description", " - udemy instructor");
//
//        return "show-emp-details-view";
//    }
//}

// lectia 61
//@Controller
//@RequestMapping("/employee")
//public class MyController {
//
//    @RequestMapping("/")
//    public String showFirstView() {
//        return "first-view";
//    }
//
//    @RequestMapping("/askDetails")
//    public String askEmployeeDeatails() {
//        return "ask-emp-details-view";
//    }
//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@RequestParam ("employeeName") String empName, Model model) {
//
//        empName = "Mr. " + empName + "!";
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("description", " - udemy instructor");
//
//        return "show-emp-details-view";
//    }
//}


@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDeatails(Model model) {

//        Employee emp = new Employee;
//        emp.setName("Mihai");
//        emp.setSurname("Panfil");
//        emp.setSalary(900);
//        model.addAttribute ("employee", emp);

        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp
            , BindingResult bindingResult) {

//        String name = emp.getName();
//        emp.setName("Mr. "+ name);
//        String surname = emp.getSurname();
//        emp.setSurname(surname + "!");
//        int salary = emp.getSalary();
//        emp.setSalary(salary*10);

        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        }
        else {
            return "show-emp-details-view";
        }
    }
}