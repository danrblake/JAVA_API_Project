import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class PoliceJSONParser {
    JSONArray policeData;

    public PoliceJSONParser(String request) {
        HTTPGetManager httpGetManager = new HTTPGetManager();
        JSONFactory jsonFactory = new JSONFactory();
        httpGetManager.acquirePoliceData(request);
        jsonFactory.convertPoliceDataToJSON(httpGetManager.getPoliceData());
        policeData = jsonFactory.getPoliceJSON();
    }

    public JSONArray getPoliceData(){
        return policeData;
    }
}
