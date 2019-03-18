package com.andy.business.core;

import com.andy.common.utils.IPUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IPInterceptor implements HandlerInterceptor {
	private final static Logger log = LoggerFactory.getLogger(IPInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		log.info("开始校验用户IP~~~~~~~");
		//过滤ip,若用户在白名单内，则放行
		String ipAddress = IPUtils.getRealIP(request);
		log.info("USER IP ADDRESS IS =>" + ipAddress);
		if (!StringUtils.isNotBlank(ipAddress))
			return false;
		/*if (ips.isEmpty()) {
			response.getWriter().append("<h1 style=\"text-align:center;\">Not allowed!</h1>");
			return false;
		}*/
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

	}
}
