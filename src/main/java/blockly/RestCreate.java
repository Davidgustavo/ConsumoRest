package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class RestCreate {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// restCreate
public static Var restCreate() throws Exception {
 return new Callable<Var>() {

   private Var create = Var.VAR_NULL;

   public Var call() throws Exception {
    create = cronapi.util.Operations.getURLFromOthers(Var.valueOf("GET"), Var.valueOf("application/x-www-form-urlencoded"), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL);
    return Var.VAR_NULL;
   }
 }.call();
}

}

