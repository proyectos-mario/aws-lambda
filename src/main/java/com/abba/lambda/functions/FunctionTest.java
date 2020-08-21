package com.abba.lambda.functions;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

@Component
public class FunctionTest implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent>{

	@Override
	public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent input) {
	APIGatewayProxyResponseEvent response=new APIGatewayProxyResponseEvent();
	response.setStatusCode(200);
	response.setBody("Hello spring cloud function to aws:"+input.getBody());
		return response;
	}

}
