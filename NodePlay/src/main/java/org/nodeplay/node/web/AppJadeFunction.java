package org.nodeplay.node.web;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.WebApplicationContext;

public class AppJadeFunction implements ApplicationContextAware {
	Logger log = LoggerFactory.getLogger(getClass());
	// private ApplicationContext applicationContext;
	private String contextPath;

	NumberFormat numberFormat = NumberFormat.getNumberInstance();
	DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
	

	public String uri(String path) {
		if (path == null)
			return contextPath;
		if (path.startsWith("/")) {
			return contextPath + path;
		}
		return contextPath + "/" + path;
	}

	public String fmt(BigDecimal dec) {
		decimalFormat.applyPattern("#.####");	// "#,#00.0#"
		return decimalFormat.format(dec);
	}

	public String fmt(BigDecimal dec, int fraction) {
		// multi thread에 안전하지 않다.
		String pattern = "#.";
		for (int i=0; i < fraction; i++)
			pattern += "0";
		decimalFormat.applyPattern(pattern);	// "#,#00.0#"
		return decimalFormat.format(dec);
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// this.applicationContext = applicationContext;
		if (applicationContext instanceof WebApplicationContext) {
			WebApplicationContext wac = (WebApplicationContext) applicationContext;
			contextPath = wac.getServletContext().getContextPath();
		} else {
			contextPath = "/NodePlay";
		}
		log.info("context root is known as : " + contextPath);
	}
}
