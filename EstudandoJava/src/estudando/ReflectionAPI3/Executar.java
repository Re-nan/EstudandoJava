package estudando.ReflectionAPI3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //Definindo que só pode anotar métodos
@Retention(RetentionPolicy.RUNTIME) //Definindo que a annotation pode ser usada em tempo de execução
public @interface Executar {

}
