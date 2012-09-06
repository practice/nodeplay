package org.nodeplay.node.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class ViewUtilInterceptor implements HandlerInterceptor, ApplicationContextAware {

	private AppJadeFunction jadeFunction;

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// nothing
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		if (modelAndView != null) {
			modelAndView.addObject("f", jadeFunction);
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// nothing
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		Map<String, AppJadeFunction> beansOfType = applicationContext.getBeansOfType(AppJadeFunction.class);
		if (beansOfType.size() == 0)
			throw new IllegalStateException("There is no bean of type AppJadeFunction");
		jadeFunction = beansOfType.values().iterator().next();
	}
}
