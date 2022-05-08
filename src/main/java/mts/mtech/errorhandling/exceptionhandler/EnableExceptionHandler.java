package mts.mtech.errorhandling.exceptionhandler;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Mitchell Tawanda Severa
 * 3/16/19
 * 8:05 AM
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({ExceptionHandlerConfiguration.class})
public @interface EnableExceptionHandler {
}
