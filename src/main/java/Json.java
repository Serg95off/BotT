import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Json {
    public static void binace(){
        JSONObject json = new JSONObject(readurl("https://api.binance.com/api/v3/ticker/price?symbol=BTCUSDT"));
        System.out.println(json.get("symbol")+" "+json.get("price"));
    }

    public static String readurl(String url){
        String str="";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET() // GET is default
                .build();
        try {
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
            str=response.body();
            System.out.println(str);
        }catch (Exception d){}
        return str;
    }
}
