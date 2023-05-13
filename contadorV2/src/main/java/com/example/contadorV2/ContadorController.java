package com.example.contadorV2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class ContadorController {
	public void contadorIndex(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 1);	
		}else {
			session.setAttribute("count", (int)session.getAttribute("count")+ 1);
		}
	}
	@RequestMapping("/")
    public String index(HttpSession session) {
		contadorIndex(session);
        return "index.jsp";
    }
	@RequestMapping("/counter")
    public String counter(HttpSession session, Model model) {
		if(session.getAttribute("count") != null) {
			model.addAttribute("count", session.getAttribute("count"));
		}else {
			model.addAttribute("count", 0);
		}
		return "counter.jsp";
    }
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/counter";
	}

	@RequestMapping("/counter2")
	public String contador2(HttpSession session, Model model) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			model.addAttribute("count", 0);
		}else {
			session.setAttribute("count", (Integer)session.getAttribute("count") + 2);
			model.addAttribute("count", session.getAttribute("count"));
		}

		return "counter2.jsp";
	}
}
