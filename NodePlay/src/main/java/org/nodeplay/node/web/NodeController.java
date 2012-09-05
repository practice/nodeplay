package org.nodeplay.node.web;

import org.nodeplay.node.model.Node;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/nodes")
@Controller
@RooWebScaffold(path = "nodes", formBackingObject = Node.class)
public class NodeController {
}
