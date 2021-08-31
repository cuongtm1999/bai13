package exception;

public class PhoneException extends Exception {
    public PhoneException(String mess) {
        super(mess);
    }
    public PhoneException() {
    }
    public String getMessage() {
        return "Nhap sai so dien thoai, vui long nhap lai dung dinh dang!";
    }
}
