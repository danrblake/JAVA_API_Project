import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class JSONFactory {
    private JSONArray policeJSON;

    public JSONArray getPoliceJSON() {
        return policeJSON;
    }
    public void convertPoliceDataToJSON(String JSONString) {
        JSONParser jsonParser = new JSONParser();
        try {
            this.policeJSON = (JSONArray) jsonParser.parse(JSONString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
