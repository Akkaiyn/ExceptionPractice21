package secondTask;

public class OurException extends Exception{
    private String message;

    public OurException(){
    }

    public OurException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
