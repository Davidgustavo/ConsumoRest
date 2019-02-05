package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class TesteDate {

public static final int TIMEOUT = 300;

/**
 *
 * @param param_obterdate
 * @return Var
 */
// testeDate
public static Var testeDate(Var param_obterdate) throws Exception {
 return new Callable<Var>() {

   // param
   private Var obterdate = param_obterdate;
   // end

   public Var call() throws Exception {
    obterdate = cronapi.screen.Operations.getValueOfField(obterdate);
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.valorAlterado"), obterdate);
    return Var.VAR_NULL;
   }
 }.call();
}

}

