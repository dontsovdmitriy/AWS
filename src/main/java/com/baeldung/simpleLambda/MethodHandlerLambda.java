package com.baeldung.simpleLambda;

        import com.amazonaws.services.lambda.runtime.Context;
        import com.amazonaws.services.lambda.runtime.RequestHandler;

public class MethodHandlerLambda implements RequestHandler<RequestClass, ResponseClass > {

    public ResponseClass handleRequest(RequestClass request, Context context){
        String greetingString = String.format("Hello %s, %s.", request.getFirstName(), request.getLastName());
        return new ResponseClass(greetingString);
    }
}
