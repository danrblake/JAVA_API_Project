import Utilities.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public class PoliceForcesManager {

    private JSONArray forceData;
    private ArrayList forceIDs = new ArrayList();

    public PoliceForcesManager() {
        SetForceData();
        SetForceIDs();
    }

    public JSONArray getForcesData() {
        return forceData;
    }

    public JSONObject getSpecificForceData(int index){
        PoliceJSONObjectParser policeJSONParser = new PoliceJSONObjectParser("forces/" + forceIDs.get(index));
        return policeJSONParser.getPoliceData();
    }

    public JSONArray getSeniorOfficerData(int index){
        PoliceJSONArrayParser policeJSONParser = new PoliceJSONArrayParser("forces/" + forceIDs.get(index) + "/people");
        return policeJSONParser.getPoliceData();
    }



    //Helper Methods
    private void SetForceData(){
        PoliceJSONArrayParser policeJSONArrayParser = new PoliceJSONArrayParser("forces");
        forceData = policeJSONArrayParser.getPoliceData();
    }



    private void SetForceIDs(){
        for (int i = 0; i < forceData.size(); i++) {
            JSONObject selectedData = (JSONObject) forceData.get(i);
            forceIDs.add(selectedData.get("id"));
        }
    }

    public ArrayList getForceIDs(){
        return forceIDs;
    }


}
