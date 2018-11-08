import java.io.IOException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
public class HTTPGetManager {

    private String baseURI = "https://data.police.uk/api/";

    private String policeData;


    public void acquirePoliceData(String request) {
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(baseURI + request);
            CloseableHttpResponse response = httpClient.execute(httpGet);
            policeData = EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getPoliceData(){
        return policeData;
    }
}
