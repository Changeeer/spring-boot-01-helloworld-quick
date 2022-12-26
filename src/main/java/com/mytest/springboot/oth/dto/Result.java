package com.mytest.springboot.oth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

    private static final long serialVersionUID = 1964465231096418758L;
    public static final Long SUCCESS_CODE = 200L;
    public static final String DEFAULT_SUCCESS_MESSAGE = "success";
    private String domain;
    private long code;
    private String msg;
    private T data;
    private List<Result.Error> errors;

    public static class Error implements Serializable {

        private static final long serialVersionUID = 7227013311811355714L;

        private String name;

        private String message;

        public Error() {
        }

        public Error(String name, String message) {
            this.name = name;
            this.message = message;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Error)) return false;
            Error error = (Error) o;
            return Objects.equals(getName(), error.getName()) &&
                    Objects.equals(getMessage(), error.getMessage());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getMessage());
        }

        @Override
        public String toString() {
            return "Error{" +
                    "name='" + name + '\'' +
                    ", message='" + message + '\'' +
                    '}';
        }
    }
}
