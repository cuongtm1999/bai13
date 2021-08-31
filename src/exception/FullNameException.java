package exception;

public class FullNameException extends Exception{
    public FullNameException() {
    }

    public FullNameException(String mess) {
        super(mess);
    }

    public String getMessage() {
        return "Nhap sai ten, vui long nhap lai dung dinh dang! ";
    }
}
