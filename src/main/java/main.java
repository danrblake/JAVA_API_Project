public class main {
    public static void main(String[] args) {
        PoliceNeighbourhoodManager policeNeighbourhoodManager = new PoliceNeighbourhoodManager();
        policeNeighbourhoodManager.getSpecificNeighbourHoodData("leicestershire");
        policeNeighbourhoodManager.getNeighbourhoodIDs();
        policeNeighbourhoodManager.getSpecificIDData("NC04");
        policeNeighbourhoodManager.getNeighbourhoodTeamData("NC04");
    }


}
