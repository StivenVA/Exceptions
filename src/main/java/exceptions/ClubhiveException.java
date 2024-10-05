package exceptions;

import org.springframework.http.HttpStatus;
public class ClubhiveException extends RuntimeException{

        private HttpStatus httpStatus;

        public ClubhiveException(String message, HttpStatus httpStatus) {
            super(message);
            this.httpStatus = httpStatus;
        }

        public ClubhiveException(String message, Throwable cause) {
            super(message, cause);
        }

        public HttpStatus getHttpStatus() {
            return httpStatus;
        }
}
