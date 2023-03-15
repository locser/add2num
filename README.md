Develop a simple function - Add2Num
- Mô tả:
  - Hàm cài đặt thuật toán cộng 2 số lớn (được biểu diễn dưới dạng chuỗi) với thuật toán như học sinh Tiểu học
    đã làm
  - Duyệt đồng thời chuỗi stn1, stn2 từ phải sang trái, lấy ra từng kí tự (character), chuyển thành kí số (digit).
    Cộng từng kí số.
  - Ghi nhận lại lịch sử phép toán vừa thực hiện với LOGGER
  - Chưa thể test Logger
- Điều kiện: Bạn cần cài đặt JDK và Maven (nếu muốn sử dụng các lệnh 'mvn')
- Phiên bản: JDK 11 và Apache Maven 3.6.3
- Cách sử dụng:
  - Để biên dịch chương trình, sử dụng: `mvn clean install`
  - Bạn có thể chạy file 'Main.java' trong src/main/java/org/locser/Main.java, hoặc cũng có thể sử dụng lệnh : `java -jar target/Add2Num.jar` 
  - Run test: Bạn có thể thấy phần 'TESTS' khi sử biên dịch, hoặc tự chạy các test trong MyBigNumberTest trong 'src/test/java/org/locser/Solution/MyBigNumberTest.java' để run test.

- Lí do sử dụng logger trong java: Vì có nhiều lợi ích như: 
  - Gỡ lỗi và tìm ra vấn đề
  - ghi lại hoạt động của chuơng trình
  - tùy chỉnh cấp độ ghi lại, ghi lại vào nhiều nơi
  - dễ dàng sử dụng.