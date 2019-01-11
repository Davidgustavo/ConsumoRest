package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Rest {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Rest
public static Var Rest() throws Exception {
 return new Callable<Var>() {

   private Var mark = Var.VAR_NULL;

   public Var call() throws Exception {
    mark = cronapi.json.Operations.toList(cronapi.util.Operations.getURLFromOthers(Var.valueOf("GET"), Var.valueOf("application/json"), Var.valueOf("https://api.coinmarketcap.com/v2/ticker/1/?convert=BRL"), Var.VAR_NULL, Var.VAR_NULL));
    mark = cronapi.json.Operations.getJsonOrMapField(mark, Var.valueOf("data"));
    mark = cronapi.json.Operations.getJsonOrMapField(mark, Var.valueOf("quotes"));
    mark = cronapi.json.Operations.getJsonOrMapField(mark, Var.valueOf("BRL"));
    mark = cronapi.json.Operations.getJsonOrMapField(mark, Var.valueOf("price"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.rest"), mark);
    return Var.VAR_NULL;
   }
 }.call();
}

}

