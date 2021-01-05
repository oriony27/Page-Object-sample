package com.formy.sample.exceptions;

public class ValidationExceptions {

    public static class WrongPageOpenedException extends BaseException {
        private static final long serialVersionUID = 3555714415375055302L;

        public WrongPageOpenedException(String message) {
            super(message);
        }
    }

    public static class WrongElementStateException extends BaseException {
        private static final long serialVersionUID = 3555714415375055301L;

        public WrongElementStateException(String message) {
            super(message);
        }
    }
}
