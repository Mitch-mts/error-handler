package mts.mtech.errorhandling.exceptionhandler;


import mts.mtech.errorhandling.exception.AccessDeniedException;
import mts.mtech.errorhandling.exception.InvalidRequestException;
import mts.mtech.errorhandling.exception.RecordNotFoundException;
import mts.mtech.errorhandling.exception.SystemErrorException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mitchell Tawanda Severa
 * 9/2/18
 * 8:33 AM
 */

@ControllerAdvice(annotations = RestController.class)
public class ExceptionHandlerController {

    @ExceptionHandler(InvalidRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody mts.mtech.errorhandling.error.Error invalidRequestError(InvalidRequestException e) {
        return new  mts.mtech.errorhandling.error.Error(4, e.getMessage());
    }

    @ExceptionHandler(RecordNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public @ResponseBody mts.mtech.errorhandling.error.Error recordNotFoundError(RecordNotFoundException e) {
        return new mts.mtech.errorhandling.error. Error(4, e.getMessage());
    }

    @ExceptionHandler(SystemErrorException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public @ResponseBody mts.mtech.errorhandling.error.Error systemError(SystemErrorException e) {
        return new  mts.mtech.errorhandling.error.Error(5, e.getMessage());
    }

    @ExceptionHandler(AccessDeniedException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public @ResponseBody mts.mtech.errorhandling.error.Error accessDeniedError(SystemErrorException e) {
        return new  mts.mtech.errorhandling.error.Error(6, e.getMessage());
    }

}

