package com.example.carros2.demo.web.services.carros2.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(
            ApplicationContext applicationContext){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet,"/ws/*");
    }

    @Bean(name = "carros")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema carrosSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CarrosPort");
        wsdl11Definition.setLocationUri("/ws");

        wsdl11Definition.setTargetNamespace("http://spring.io.carros2-jar-maven-ws");
        wsdl11Definition.setSchema(carrosSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema carrosSchema() {
        return new SimpleXsdSchema(new ClassPathResource("carros.xsd"));
    }


}
