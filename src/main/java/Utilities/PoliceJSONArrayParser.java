package Utilities;

import Utilities.JSONFactory;
import org.json.simple.JSONArray;

public class PoliceJSONArrayParser {

    private JSONArray policeData;

    public PoliceJSONArrayParser(String request) {
        HTTPGetManager httpGetManager = new HTTPGetManager();
        JSONFactory jsonFactory = new JSONFactory();
        httpGetManager.acquirePoliceData(request);
        jsonFactory.convertPoliceDataToJSONArray(httpGetManager.getPoliceData());
        policeData = jsonFactory.getPoliceJSONArray();
    }

    public JSONArray getPoliceData(){
        return policeData;
    }
}
