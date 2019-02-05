package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Upload {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Upload
public static Var Upload() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    cronapi.util.Operations.upload(Var.valueOf("Selecione o arquivo a ser enviado!"), Var.valueOf("*"), Var.valueOf("20MB"), Var.valueOf("true"), (sender_item) -> {
        item = Var.valueOf(sender_item);
        item = cronapi.list.Operations.get(item, Var.valueOf(1));
        cronapi.io.Operations.fileMove(item, Var.valueOf(cronapi.io.Operations.fileAppDir().toString() + cronapi.io.Operations.fileSeparator().toString() + Var.valueOf("PastaNova").toString()));
        System.out.println(item.getObjectAsString());
    });
    return Var.VAR_NULL;
   }
 }.call();
}

}

