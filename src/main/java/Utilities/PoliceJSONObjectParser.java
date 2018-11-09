package Utilities;

import Utilities.JSONFactory;
import org.json.simple.JSONObject;

public class PoliceJSONObjectParser {

    private JSONObject policeData;

    public PoliceJSONObjectParser(String request) {
        HTTPGetManager httpGetManager = new HTTPGetManager();
        JSONFactory jsonFactory = new JSONFactory();
        httpGetManager.acquirePoliceData(request);
        jsonFactory.convertPoliceDataToJSONObject(httpGetManager.getPoliceData());
        policeData = jsonFactory.getPoliceJSONObject();
    }

    public JSONObject getPoliceData(){
        return policeData;
    }
}
