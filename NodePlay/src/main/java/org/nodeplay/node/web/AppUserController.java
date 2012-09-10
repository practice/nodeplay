package org.nodeplay.node.web;

import java.math.BigDecimal;

import org.nodeplay.node.model.AppUser;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/appusers")
@Controller
@RooWebScaffold(path = "appusers", formBackingObject = AppUser.class)
public class AppUserController {
	
    @RequestMapping(params = "form", produces = "text/html")
    public String createForm(Model uiModel) {
        populateEditForm(uiModel, new AppUser());
        BigDecimal b1 = BigDecimal.valueOf(1234567.80);
        b1.setScale(3);
        uiModel.addAttribute("b1", b1);
        return "appuser/test";
    }
}
