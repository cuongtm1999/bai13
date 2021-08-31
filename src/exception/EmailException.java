package exception;

public class EmailException extends Exception{
    public EmailException () {
    }

    public EmailException(String mess) {
        super(mess);
    }

    public String getMessage() {
        return "Nhap sai email, vui long nhap lai dung dinh dang! ";
    }
}
