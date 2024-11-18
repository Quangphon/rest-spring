package vn.hoidanit.jobhunter.domain;

public class RestResponse<T> {
    private int statusCode;
    private String error;

    // message có thể là string hoặc arraylist
    private Object message;
    private T data;

    public int getStatusCode() {
        return statusCode;
    }

    public String getError() {
        return error;
    }

    public Object getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

}
