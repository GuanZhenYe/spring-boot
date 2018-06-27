package com.example.web.utils;

import com.example.web.Constant.Constant;
import com.example.web.annotation.SessionUser;
import com.example.web.beans.SessionInfo;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by hp on 2018/2/16.
 */
@Component
public class SessionArgumentResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.hasParameterAnnotation(SessionUser.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter,
                                  ModelAndViewContainer modelAndViewContainer,
                                  NativeWebRequest nativeWebRequest,
                                  WebDataBinderFactory webDataBinderFactory) throws Exception {

        HttpServletRequest httpServletRequest= nativeWebRequest.getNativeRequest(HttpServletRequest.class);
        SessionInfo sessionInfo=(SessionInfo) httpServletRequest.getAttribute(Constant.SESSION_KEY);
        if(sessionInfo==null){
            return null;
        }
        Class<?> parameterType=methodParameter.getParameterType();
        if(supportsParameter(methodParameter)&&parameterType.equals(SessionInfo.class)){
            System.out.println("session 里的用户信息注入 到方法参数中");
            return sessionInfo;
        }
        return null;
    }
}
