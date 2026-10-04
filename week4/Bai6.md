# Bài 6: Correctness Invariant - Phân tích và Sửa lỗi

## 1. Vị trí lỗi
Trong đoạn mã nguồn ban đầu của bài toán, lỗi logic nằm ở vòng lặp `while` bên trong hàm `insertionSort`.

Đoạn code bị lỗi:
```c
while(j > 0 && value < arr[j])
```

## 2. Giải thích nguyên nhân
Thuật toán Sắp xếp chèn (Insertion Sort) hoạt động bằng cách so sánh phần tử hiện tại (`value`) với các phần tử đứng trước nó (có chỉ số `j`).

Nếu điều kiện vòng lặp là `j > 0`, thuật toán sẽ dừng so sánh khi `j = 0`. Điều này có nghĩa là phần tử đầu tiên của mảng (tại vị trí `arr[0]`) sẽ **bị bỏ qua** và không bao giờ được dùng để so sánh với `value`. Do đó, mảng sẽ không được sắp xếp chính xác nếu phần tử nhỏ nhất cần được đưa về vị trí đầu tiên này.

## 3. Cách khắc phục
Để mảng được sắp xếp đúng, chúng ta cần cho phép vòng lặp kiểm tra cả phần tử ở vị trí đầu tiên.

Chỉ cần thay đổi toán tử lớn hơn (`>`) thành lớn hơn hoặc bằng (`>=`):
```c
while(j >= 0 && value < arr[j])
```
