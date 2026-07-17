package carro.lexus.is.gr.mantenimiento.soap;

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
public class configuration  extends WsConfigurerAdapter {

    private final static String TNS = "http://lexus.ws.mant.gc";

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet,"/ws/*");
    }

    @Bean(name="lexusIs")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema lexusIsSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("LexusIsPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace(TNS);
        wsdl11Definition.setSchema(lexusIsSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema lexusIsSchema() {
        return new SimpleXsdSchema(new ClassPathResource("lexusIs.xsd"));
    }

}
