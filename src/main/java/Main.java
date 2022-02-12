import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import org.apache.log4j.BasicConfigurator;

public class Main {
    public static void main(String[] arg){
        BasicConfigurator.configure();

try {
    TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
    botsApi.registerBot(new CofigBot());
}catch (Exception e){

}
    }
}
