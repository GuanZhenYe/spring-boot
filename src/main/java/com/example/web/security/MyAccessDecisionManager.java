//package com.example.web.security;
//
//import org.springframework.security.access.AccessDecisionManager;
//import org.springframework.security.access.AccessDeniedException;
//import org.springframework.security.access.ConfigAttribute;
//import org.springframework.security.authentication.InsufficientAuthenticationException;
//import org.springframework.security.core.Authentication;
//
//import java.util.Collection;
//
///**
// * Created by hp on 2018/7/9.
// */
//public class MyAccessDecisionManager implements AccessDecisionManager {
//    @Override
//    public void decide(Authentication authentication, Object o, Collection<ConfigAttribute> collection) throws AccessDeniedException, InsufficientAuthenticationException {
//
//    }
//
//    @Override
//    public boolean supports(ConfigAttribute configAttribute) {
//        return false;
//    }
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return false;
//    }
//}
