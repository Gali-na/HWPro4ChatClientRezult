import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Messange newMessage = new Messange();
        newMessage.setName("Galin");
        int userResponse=0;
String patrReqvest="";
            System.out.println("Select the chat menu");
            System.out.println("registration-1");
            System.out.println("general chat-2");
            System.out.println("eneral chat-3");

            Scanner scanner = new Scanner(System.in);
            userResponse= scanner.nextInt();
            if(userResponse==1) {
                patrReqvest="/TableRegis";
            }
        if(userResponse==2) {
            patrReqvest="/add";
        }

        if(userResponse==3) {
            patrReqvest="/privateChat";
        }
        newMessage.setText("Hello");

        Gson gson = new GsonBuilder().create();
        String sendMassege = gson.toJson(newMessage);
        String url = "http://localhost:8080/demoh_war_exploded"+"/patrReqvest";
        URL obj = null;
        try {
            obj = new URL(url);

        HttpURLConnection conn = null;

            conn = (HttpURLConnection) obj.openConnection();

            conn.setRequestMethod("POST");
            conn.setDoOutput(true);

            OutputStream os = conn.getOutputStream();
            try {

                os.write(sendMassege.getBytes(StandardCharsets.UTF_8));
                conn.getResponseCode();
            } finally {
                os.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
