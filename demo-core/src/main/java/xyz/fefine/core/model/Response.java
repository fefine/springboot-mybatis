package xyz.fefine.core.model;

public class Response {
    public int code;
    public Object data;
    public String message;
    public Response(int code, int data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }
    public Response(int code, int data) {
        this.code = code;
        this.data = data;
    }
    public Response(int code, String message) {
        this.code = code;
        this.data = null;
        this.message = message;
    }
}
