package br.com.erudio.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class RequiredObjectIsNull extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public RequiredObjectIsNull(String ex) {
        super(ex);
    }

    public RequiredObjectIsNull() {
        super("It is not allowed to persist a null object!");
    }

}
