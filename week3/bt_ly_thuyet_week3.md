### (a) Dữ liệu được in ra màn hình

Theo nguyên tắc, hệ thống sẽ tự động in toàn bộ dữ liệu trong queue sau mỗi chu kỳ 3 thao tác (cụ thể ở đây là các bước số 3, 6, 9 và 12). 

Chi tiết diễn biến như sau:

| Chu kỳ (bước thứ) | Trạng thái Queue | Kết quả in |
| :--- | :--- | :--- |
| 3 | `[1]` | 1 |
| 6 | `[2, 3]` | 2 3 |
| 9 | `[3, 4, 5]` | 3 4 5 |
| 12 | `[4, 5, 6, 7]` | 4 5 6 7 |

=> **Lựa chọn:** `1 2 3 3 4 5 4 5 6 7.`

---

### (b) Trường hợp xấu nhất (Worst-case) của thao tác enqueue

Thao tác đẩy vào hàng đợi (enqueue) trên danh sách liên kết vốn dĩ chỉ mất $O(1)$. Tuy nhiên, nếu thao tác này vô tình kích hoạt điều kiện in (rơi đúng vào bước là bội số của 3), chương trình bắt buộc phải duyệt qua toàn bộ $n$ phần tử đang lưu trữ để in. Do đó, chi phí bị đội lên mức tuyến tính.

=> **Đáp án:** $\Theta(n)$

---

### (c) Chi phí khấu hao (Amortized cost) trung bình

Quá trình in ấn diễn ra với tần suất cố định (chiếm $1/3$ tổng số thao tác) chứ không hề thưa dần đi khi $n$ tăng lên. Tại thao tác thứ $k$, chi phí in sẽ tỷ lệ thuận với kích thước hàng đợi là $\Theta(k)$. 

Nếu ta xem xét một chuỗi $n$ thao tác liên tiếp, tổng chi phí tính toán sẽ là một cấp số cộng xấp xỉ $\Theta(n^2)$. Do đó, khi chia đều (khấu hao) cho $n$ thao tác, trung bình mỗi thao tác tốn chi phí $\Theta(n)$. Mức phí này tương đương với worst-case chứ không được tối ưu hơn.

=> **Đáp án:** $\Theta(n)$