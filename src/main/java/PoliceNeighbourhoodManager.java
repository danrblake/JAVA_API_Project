import Utilities.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
public class PoliceNeighbourhoodManager {

    private ArrayList forceIDs;
    private JSONArray neighbourhoodInfo;
    private ArrayList neighbourhoodIDs = new ArrayList();
    private String requestNeighbourhood;
    private JSONObject specificIDData;

    public PoliceNeighbourhoodManager(){
        PoliceForcesManager forcesManager = new PoliceForcesManager();
        forceIDs = forcesManager.getForceIDs();
    }

    public void getSpecificNeighbourHoodData(String nameOfNeighbourhood) {
        this.requestNeighbourhood = nameOfNeighbourhood;
        PoliceJSONArrayParser arrayParser = new PoliceJSONArrayParser(nameOfNeighbourhood+"/neighbourhoods");
        neighbourhoodInfo = arrayParser.getPoliceData();
        for (int i = 0; i < neighbourhoodInfo.size(); i++) {
            JSONObject selectedData = (JSONObject) neighbourhoodInfo.get(i);
            neighbourhoodIDs.add(selectedData.get("id"));
        }
    }
    public ArrayList getNeighbourhoodIDs(){
        return neighbourhoodIDs;
    }

    public void getSpecificIDData(String id){
        PoliceJSONObjectParser objectParser = new PoliceJSONObjectParser(requestNeighbourhood + "/" + id);
        specificIDData = objectParser.getPoliceData();
    }

    public void getNeighbourhoodTeamData(String id){
        PoliceJSONArrayParser arrayParser = new PoliceJSONArrayParser(requestNeighbourhood + "/" + id + "/people");
    }

    public void getNeighbourhoodPriorities(String id){
        PoliceJSONArrayParser arrayParser = new PoliceJSONArrayParser(requestNeighbourhood + "/" + id + "/priorities");
    }
    public void getNeighbourhoodEvents(String id){
        PoliceJSONArrayParser arrayParser = new PoliceJSONArrayParser(requestNeighbourhood + "/" + id + "/events");
    }
}
