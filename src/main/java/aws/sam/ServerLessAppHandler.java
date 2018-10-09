package aws.sam;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.apache.log4j.Logger;

import java.util.Map;

public class ServerLessAppHandler implements RequestHandler<Map<String,Object>, String> {

    private static final Logger log = Logger.getLogger(ServerLessAppHandler.class);

    @Override
    public String handleRequest(Map<String,Object> request, Context context) {
        log.info("Executing server less application model.");
        return "success";
    }
}
