package com.abba.lambda.functions;

import java.util.function.Function;

public class FunctionTest implements Function<String, String>{

	@Override
	public String apply(String t) {
		return t;
	}

}
