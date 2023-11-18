//package fit.iuh.edu.week05_lap_phamtronghieu;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.thymeleaf.spring6.SpringTemplateEngine;
//import org.thymeleaf.spring6.view.ThymeleafViewResolver;
//
//@Configuration
//public class ThymeleafConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("forward:/index");
//    }
//
//    @Bean
//    public ViewResolver thymeleafViewResolver(SpringTemplateEngine templateEngine) {
//        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//        resolver.setTemplateEngine(templateEngine);
//        resolver.setCharacterEncoding("UTF-8");
//        return resolver;
//    }
//}
