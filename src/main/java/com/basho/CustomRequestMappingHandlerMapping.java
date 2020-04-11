package com.basho;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CustomRequestMappingHandlerMapping extends RequestMappingHandlerMapping {
    @Override
    protected HandlerMethod lookupHandlerMethod(String lookupPath, HttpServletRequest request) throws Exception {
        /*Handle Mock response*/
        if (Files.isReadable(Paths.get("mocks" + lookupPath + "/response.txt"))) {
            /*TODO: Handle Mocking response by redirecting to generic mock response controller*/
            System.out.println("Handle Mocking");
        }
        return super.lookupHandlerMethod(lookupPath, request);

    }

/*    @Override
    public void registerMapping(RequestMappingInfo mapping, Object handler, Method method) {
        super.registerMapping(mapping, handler, method);
    }

    @Override
    public void unregisterMapping(RequestMappingInfo mapping) {
        super.unregisterMapping(mapping);
    }

    @Override
    protected void registerHandlerMethod(Object handler, Method method, RequestMappingInfo mapping) {
        super.registerHandlerMethod(handler, method, mapping);
    }*/
}
