package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.Iterator;
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

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var RestObjetos() throws Exception {
 return new Callable<Var>() {

   private Var api = Var.VAR_NULL;
   private Var i = Var.VAR_NULL;
   private Var objeto = Var.VAR_NULL;

   public Var call() throws Exception {
    api = cronapi.json.Operations.toList(cronapi.util.Operations.getURLFromOthers(Var.valueOf("GET"), Var.valueOf("application/json"), Var.valueOf("https://www.cronapp.io/wp-json/wp/v2/posts"), Var.VAR_NULL, Var.VAR_NULL));
    for (Iterator it_i = api.iterator(); it_i.hasNext();) {
        i = Var.valueOf(it_i.next());
        objeto = cronapi.json.Operations.getJsonOrMapField(i, Var.valueOf("id"));
        System.out.println(objeto.getObjectAsString());
        objeto = cronapi.json.Operations.getJsonOrMapField(i, Var.valueOf("title.rendered"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.titulo1"), objeto);
        System.out.println(objeto.getObjectAsString());
        objeto = cronapi.json.Operations.getJsonOrMapField(i, Var.valueOf("content.rendered"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.titulo2"), objeto);
        System.out.println(objeto.getObjectAsString());
    } // end for
    return Var.VAR_NULL;
   }
 }.call();
}

}

