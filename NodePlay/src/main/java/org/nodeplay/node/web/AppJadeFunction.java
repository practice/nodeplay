package org.nodeplay.node.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.WebApplicationContext;

public class AppJadeFunction implements ApplicationContextAware {
	Logger log = LoggerFactory.getLogger(getClass());
//	private ApplicationContext applicationContext;
	private String contextPath;

	public String uri(String path) {
		if (path == null)
			return contextPath;
		if (path.startsWith("/")) {
			return contextPath + path;
		}
		return contextPath + "/" + path;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
//		this.applicationContext = applicationContext;
		if (applicationContext instanceof WebApplicationContext) {
			WebApplicationContext wac = (WebApplicationContext)applicationContext;
			contextPath = wac.getServletContext().getContextPath();
		} else {
			contextPath = "/NodePlay";
		}
		log.info("context root is known as : " + contextPath);
	}
}
