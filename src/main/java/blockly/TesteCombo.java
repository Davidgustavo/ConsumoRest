package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class TesteCombo {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// testeCombo
public static Var combo() throws Exception {
 return new Callable<Var>() {

   private Var testecombo = Var.VAR_NULL;

   public Var call() throws Exception {
    testecombo = cronapi.screen.Operations.getValueOfField(Var.valueOf("testeCombo.active.name"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.testecombo"), testecombo);
    return Var.VAR_NULL;
   }
 }.call();
}

}

