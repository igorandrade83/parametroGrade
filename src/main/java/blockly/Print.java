package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Print {

public static final int TIMEOUT = 300;

/**
 *
 * @param x
 * @return Var
 */
// print
public static Var Executar(Var x) throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item = cronapi.object.Operations.getObjectField(x, Var.valueOf("email"));
    System.out.println(item.getObjectAsString());
    System.out.println(x.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

