package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class RestUpdate {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// restUpdate
public static Var restUpdate() throws Exception {
 return new Callable<Var>() {

   private Var update = Var.VAR_NULL;

   public Var call() throws Exception {
    update = cronapi.util.Operations.getURLFromOthers(Var.valueOf("GET"), Var.valueOf("application/x-www-form-urlencoded"), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL);
    return Var.VAR_NULL;
   }
 }.call();
}

}

