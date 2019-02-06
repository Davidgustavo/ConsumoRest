package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.data.domain.*;
import org.springframework.validation.annotation.*;
import org.springframework.web.bind.annotation.*;


/** 
* 
* RestController @generated 
* 
*/ 

@RestController
@RequestMapping(value = "/api/rest/main/Scheduler")
@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class RestAuth {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */

@RequestMapping(method = RequestMethod.GET, value="/restAuth")
// restAuth
public static Var restAuth() throws Exception {
 return new Callable<Var>() {

   private Var auth = Var.VAR_NULL;

   public Var call() throws Exception {
    auth = cronapi.json.Operations.toJson(cronapi.util.Operations.getURLFromOthers(Var.valueOf("GET"), Var.valueOf("application/json"), Var.valueOf("https://8-35-46301.debug.ide.cronapp.io/api/cronapi/crud/app.entity.User"), Var.VAR_NULL, cronapi.map.Operations.createObjectMapWith(Var.valueOf("JSESSIONID",Var.valueOf("2AEADAA1B7E2EFB7EFCBAC8E7442E164")))));
    System.out.println(auth.getObjectAsString());
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), auth);
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param id2
 * @param param_nome
 */

@RequestMapping(method = RequestMethod.GET, value="/delete/{id2}/{param_nome}")
// Descreva esta função...
public static void delete(@PathVariable("id2") Var id2 ,@PathVariable("param_nome") Var param_nome ) throws Exception {
  new Callable<Var>() {

   // param
   private Var nome = param_nome;
   // end
   private Var id2 = Var.VAR_NULL;

   public Var call() throws Exception {
    cronapi.database.Operations.execute(Var.valueOf("app.entity.teste"), Var.valueOf("update teste set nome = :nome where id = :id"),Var.valueOf("nome",id2),Var.valueOf("id",nome));
   return Var.VAR_NULL;
   }
 }.call();
}

}

