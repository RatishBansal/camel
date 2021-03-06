/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.rest.swagger;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class RestSwaggerComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        RestSwaggerComponent target = (RestSwaggerComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basepath":
        case "basePath": target.setBasePath(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "componentname":
        case "componentName": target.setComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "consumes": target.setConsumes(property(camelContext, java.lang.String.class, value)); return true;
        case "host": target.setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "produces": target.setProduces(property(camelContext, java.lang.String.class, value)); return true;
        case "specificationuri":
        case "specificationUri": target.setSpecificationUri(property(camelContext, java.net.URI.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basePath", java.lang.String.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("componentName", java.lang.String.class);
        answer.put("consumes", java.lang.String.class);
        answer.put("host", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("produces", java.lang.String.class);
        answer.put("specificationUri", java.net.URI.class);
        answer.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        answer.put("useGlobalSslContextParameters", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        RestSwaggerComponent target = (RestSwaggerComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basepath":
        case "basePath": return target.getBasePath();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "componentname":
        case "componentName": return target.getComponentName();
        case "consumes": return target.getConsumes();
        case "host": return target.getHost();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "produces": return target.getProduces();
        case "specificationuri":
        case "specificationUri": return target.getSpecificationUri();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        default: return null;
        }
    }
}

