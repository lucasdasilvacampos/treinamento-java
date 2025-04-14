package ultils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatadorData {
    static SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); ;

    public static String dataFormatada(Date data){
      return formatar.format(data);
    }
}
