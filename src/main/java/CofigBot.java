import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class CofigBot extends TelegramLongPollingBot {
   public static String TOKEN="5258439744:AAHbTOUHuo2PbtXwvCTHpiU5PYhADJVTIn8";
   public static String NAME="BotT";
    @Override
    public String getBotUsername() {
        return NAME;
    }

    @Override
    public String getBotToken() {
        return TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage() && update.getMessage().hasText()){
            String id= String.valueOf(update.getMessage().getChatId());
            String text= String.valueOf(update.getMessage().getText());
            //System.out.print("---------------------------------------------------------");
            System.out.print("id "+id+" TEST "+text);

            Function f= new Function();
            f.sendText(id,text);
        }

    }
}
