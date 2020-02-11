package com.accp.intercetor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.accp.domain.People;
import com.accp.domain.Permission;
import com.accp.service.PermissionService;


@Component
public class PermInterceptor implements HandlerInterceptor {

	
	@Autowired
	PermissionService service;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		People user = (People)request.getSession().getAttribute("user");
		List<Permission> perms = service.findByUid(user.getPno());
		String path = request.getRequestURI();
		boolean bol = perms.stream().anyMatch(item->item.getPath()!=null && item.getPath().indexOf(path)!=-1);
		return bol;
	}
	
}
