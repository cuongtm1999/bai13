package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CustomException {
    private static Scanner sc = new Scanner(System.in);
    public static int inputInt(){
        while (true){
            try{
                return Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static String inputString(){
        while (true) {
            String input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("khong duoc de trong");
            } else {
                return input;
            }
        }
    }
    public static String inputName() {
        while (true) {
            String fullName = inputString().trim().replaceAll("\\s+", " ");
            String[] name = fullName.split(" ");
            int count = 0;
            String result = "";
            for (int i = 0; i < name.length; i++) {
                count++;
                result += String.valueOf(name[i].charAt(0)).toUpperCase() + name[i].substring(1) + " ";
            }
            if (count >= 2) {
                return result;
            } else {
                System.out.println("Ten cua ban phai co nhieu hon hai ki tu, moi nhap lai!!");
            }
        }
    }
    public static String inputEmail(){
        while (true) {
            String email = inputString();
            if (email.contains("@") && email.contains(".com") && email.length() >= 5) {
                return email;
            } else {
                try {
                    throw new EmailException();
                } catch (EmailException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static Date inputBirthDay() {
        while (true){
            String birdDay = inputString();
            String date = "^(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-([12][0-9]{3})$";
            if(birdDay.matches(date)){
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                try {
                    return simpleDateFormat.parse(birdDay);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }else {
                try {
                    throw new BirthDayException();
                } catch (BirthDayException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
