package org.example.configs;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import javax.servlet.*;

public class WebServletConfiguration implements WebApplicationInitializer {

    /**
     * Configure the given {@link ServletContext} with any servlets, filters, listeners
     * context-params and attributes necessary for initializing this web application. See examples
     * {@linkplain WebApplicationInitializer above}.
     *
     * @param servletContext the {@code ServletContext} to initialize
     * @throws ServletException if any call against the given {@code ServletContext} throws a {@code
     *                          ServletException}
     */
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // Creates context object
        AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
        // Registers annotated configurations class
        webCtx.register(WebConfig.class);
        // Passes servlet context to context instance
        webCtx.setServletContext(servletContext);
        // Registers dispatch servlet and passes context instance
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(webCtx));
        //Maps URL pattern
        servlet.addMapping("/");
        //Sets creation priority
        servlet.setLoadOnStartup(1);
//        //Registers security filters
//        FilterRegistration.Dynamic security = servletContext.addFilter("springSecurityFilterChain", new DelegatingFilterProxy());
//
//        // Sets dispatcher types a security filters to be applied
//        EnumSet<DispatcherType> dispatcherTypes = EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD);
//        security.addMappingForUrlPatterns(dispatcherTypes, true, "/*");
    }
}
