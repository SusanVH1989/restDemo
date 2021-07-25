package org.mycompany;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;
@Component
public class MyRestRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		restConfiguration().component("servlet").bindingMode(RestBindingMode.json);
		
		rest("/order")
		.get("").route().setBody(constant("{msg:Hello there}")).endRest();
		
		
	}

}
