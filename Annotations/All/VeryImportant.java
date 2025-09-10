package All;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // <- Allow us to read it through reflection!
public @interface VeryImportant {
    String value() default "This is the best boy ever!";
}
