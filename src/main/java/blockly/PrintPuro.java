package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class PrintPuro {

public static final int TIMEOUT = 300;

/**
 *
 * @param x
 * @return Var
 */
// printPuro
public static Var Executar(Var x) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(x.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

