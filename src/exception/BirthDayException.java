package exception;

public class BirthDayException extends Exception{
    public BirthDayException() {
    }

    public BirthDayException(String mess) {
        super(mess);
    }

    public String getMessage() {
        return "Nhap sai ngay sinh, vui long nhap lai dung dinh dang !";
    }
}
