package org.nodeplay.node.web;

import org.nodeplay.node.model.NodeRevision;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/noderevisions")
@Controller
@RooWebScaffold(path = "noderevisions", formBackingObject = NodeRevision.class)
public class NodeRevisionController {
}
