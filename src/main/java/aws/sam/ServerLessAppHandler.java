package aws.sam;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.apache.log4j.Logger;

public class ServerLessAppHandler implements RequestHandler<String, String> {

    private static final Logger log = Logger.getLogger(ServerLessAppHandler.class);

    @Override
    public String handleRequest(String request, Context context) {
        log.info("Executing server less application model.");
        return "success";
    }
}
