package org.nodeplay.node.web;

import de.neuland.jade4j.model.JadeModel;

/**
 * Does not work. I don't know aspectj.
 * @author shawn
 *
 */
privileged aspect JadeModelFunction {
    public String JadeModel.uri(String path) {
		if (path == null)
			return "/NodePlay";
		if (path.startsWith("/")) {
			return "/NodePlay" + path;
		}
		return "/NodePlay/" + path;
    }
}