import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.EventListener;

public class Function extends CofigBot{

   public void sendText(String chatId, String text){
       SendMessage message = new SendMessage();
       message.setText(text);
       message.setChatId(chatId);
       try {
          execute(message);
       } catch (TelegramApiException e) {
           e.printStackTrace();
       }
   }
}
