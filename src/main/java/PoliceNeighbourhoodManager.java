import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
public class PoliceNeighbourhoodManager {

    private ArrayList forceIDs;
    private JSONArray neighbourhoodInfo;

    public PoliceNeighbourhoodManager(){
        PoliceForcesManager forcesManager = new PoliceForcesManager();
        forceIDs = forcesManager.getForceIDs();
    }

    public void getSpecificNeighbourHoodData(String nameOfNeighbourhood) {
        PoliceJSONArrayParser arrayParser = new PoliceJSONArrayParser(nameOfNeighbourhood+"/neighbourhoods");
        neighbourhoodInfo = arrayParser.getPoliceData();
        System.out.println(neighbourhoodInfo);
    }
}
