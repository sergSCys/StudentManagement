package main.java.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

    public class StudentAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses(){
        return null;
    }
    @Override
    protected Class<?>[] getServletConfigClasses(){

        Class[] configFiles = {StudentAppConfig.class};

        return null;
    }

        @Override
        protected String[] getServletMappings() {
            String[] mappings = {"/"};
            return new String[0];
        }
    }
