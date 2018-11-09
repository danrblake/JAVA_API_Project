package Utilities;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class JSONFactory {

    private JSONArray policeJSONArray;
    private JSONObject policeJSONObject;

    public void convertPoliceDataToJSONArray(String JSONString) {
        JSONParser jsonParser = new JSONParser();
        try {
            this.policeJSONArray = (JSONArray) jsonParser.parse(JSONString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public JSONArray getPoliceJSONArray() {
        return policeJSONArray;
    }

    public void convertPoliceDataToJSONObject(String JSONString) {
        JSONParser jsonParser = new JSONParser();
        try {
            this.policeJSONObject = (JSONObject) jsonParser.parse(JSONString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public JSONObject getPoliceJSONObject() {
        return policeJSONObject;
    }


}
