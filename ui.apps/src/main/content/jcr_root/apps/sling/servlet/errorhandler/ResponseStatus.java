package apps.sling.servlet.errorhandler;

import com.adobe.cq.sightly.WCMUse;

public class ResponseStatus extends WCMUse {
    
    @Override
    public void activate() throws Exception {
        getResponse().setStatus(404);
    }
}
