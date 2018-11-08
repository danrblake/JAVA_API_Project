import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class PoliceForcesManager {

    JSONArray data;


    public JSONObject getSpecificForceData(int index){
        GetForceData(index);
        JSONObject selectedData = (JSONObject) data.get(index);
        PoliceJSONObjectParser policeJSONParser1 = new PoliceJSONObjectParser("forces/" + selectedData.get("id"));
        return policeJSONParser1.getPoliceData();
    }

    private void GetForceData(int index){
        PoliceJSONArrayParser policeJSONArrayParser = new PoliceJSONArrayParser("forces");
        data = policeJSONArrayParser.getPoliceData();
    }


}
