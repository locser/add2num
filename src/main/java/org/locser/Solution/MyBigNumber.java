package org.locser.Solution;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyBigNumber {
    private static final Logger LOGGER = Logger.getLogger(MyBigNumber.class.getName());

    public MyBigNumber() {
        LOGGER.setLevel(Level.INFO);
    }

    public String sum(String stn1, String stn2){
        String result ="";
        int size1 = stn1.length();
        int size2 = stn2.length();
        int step= 0;
        boolean Remainder = false;

//        LOGGER.info("Thực hiện tính tổng của " + stn1 + " + "  + stn2 + " :");
        while(true) {

//            bắt đầu từ giá trị cuỗi cùng của 2 chuỗi.
//            Với các lần lặp sau để lấy cái kí tự bên trái tiếp theo.
            size1--;
            size2--;

            //nếu size < 0 thì hoàn thành phép tính
            if(size1 < 0 && size2 <0){
                break;
            }

            // thực hiện step thứ bao nhiêu
            step ++;

            //lấy giá trị từ phải qua trái và chuyển đổi thành số
                // nếu stn1 đã hết kí tự thì digit tại size1 sẽ mặc định là 0
            int digit1 = getDigit(size1, stn1);

                //tương tự như stn1
            int digit2 = getDigit(size2, stn2);

            //tính kết quả của cột hiện tại
            int kq = digit1 + digit2;
            //cột trước có nhớ không
            if (Remainder) {
                kq = kq + 1;
            }

            //xử lý logger
            if(kq >= 10){
                LOGGER.info(generateString(step, digit1, digit2, digit1 + digit2, result, Remainder));
                Remainder =true;
                //gán kết quả mới
            }else{
                LOGGER.info(generateString(step, digit1, digit2, digit1 + digit2, result, Remainder));
                Remainder = false;
            }

            // gán kết quả của cột tính vào result cuối cùng
            result = (kq% 10) + result;
        }

        LOGGER.info("Kết quả cuối cùng của phép tính tổng " + stn1 + " + "  + stn2 + " = " + result);

        return result;
    }

    /*
    * Tạo chuỗi cho logger
    * trả về chuỗi miêu tả các bước
    * */
    private String generateString(int step, int digit1, int digit2, int kq, String result, boolean remember){
        //chuỗi thực hiện phép tính
        String s1 = "Bước " + step + " : ";
        s1 = s1 + "Lấy " + digit1 + " cộng với " + digit2 + " được " + kq + ".";

        //cộng nhớ cột trước
        if(remember){
            kq = kq +1;
            s1 += " Cộng tiếp với nhớ 1 được " + kq + ".";

        }
        //kết thúc chuỗi 1
        s1 += "\n";

        // chuỗi ghi đè kết quả
        int du= kq %10;
        String s2= "Lưu "+ du + " vào kết quả";
        String s3="";

        if (kq >= 10) {
            s3 = " và nhớ 1";
        }
        if(result.length() != 0) {
            s2 += " được kết quả mới là \"" + du + result + "\"";
            if(kq >= 10){
                s3= ".\nGhi nhớ 1";
            }
        }
        // nối kết câu chuỗi s3
        s3 += ".";

        return s1 + s2 + s3;
    }

    /*
     * Lấy kí tự thứ index của chuỗi s
     * xử lý ngoại lệ
     * return giá trị số nguyên của kí tự đó
     * */
    int getDigit(int index, String s){
        //xử lý
        if(index <0){
            return 0;
        }
        return Integer.parseInt(String.valueOf(s.charAt(index)));
    }

    public Logger getLOGGER(){
        return LOGGER;
    }
}
