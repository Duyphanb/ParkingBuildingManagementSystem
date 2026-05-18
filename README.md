# Parking Building Management System (PBMS)

## 1. Thông tin dự án
* **Môn học:** SWP391 - Application Development Project
* **Học kỳ:** Summer 2026
* **Chủ đề:** Hệ thống quản lý tòa nhà gửi xe (Parking Building Management System)
* **Mục tiêu:** Xây dựng hệ thống phần mềm quản lý liên tục xe ra/vào trên nhiều tầng và khu vực. Giải quyết triệt để các bài toán thực tế tại Việt Nam: ùn tắc cổng ra vào, sai lệch dữ liệu vị trí đỗ, thất thoát doanh thu giữa các ca trực và thiếu cơ chế xử lý ngoại lệ nghiệp vụ (mất vé, quá giờ).
* **Mô hình kiến trúc:** **Hybrid Monolithic Architecture** (Kết hợp Server-Side Rendering và RESTful API).
  * Tuân thủ kiến trúc **Multi-layer:** `Controller` -> `Service` -> `Repository (DAO)`.
  * Giao diện render bằng **Thymeleaf**, kết hợp **AJAX/Fetch API** gọi **REST APIs** để xử lý các tác vụ Real-time (Dashboard) và Validation (Check-in/out) mà không cần reload trang.

## 2. Công nghệ và Công cụ sử dụng
* **Back-end Core:** Java, Spring Boot Framework (Spring Web, Spring MVC, Spring Security).
* **Database & ORM:**
  * **Microsoft SQL Server:** Cam kết tuân thủ nghiêm ngặt chuẩn hóa **3NF** và quy mô **≥ 10 bảng dữ liệu**.
  * **Spring Data JPA / Hibernate:** Quản lý Object-Relational Mapping (ORM) và đảm bảo tính toàn vẹn của Transaction (ACID) cho các Business Rules (quy tắc nghiệp vụ).
* **Front-end & UI:** 
  * **Thymeleaf** (Template Engine) phục vụ cơ chế Server-Side Rendering (SSR).
  * **Bootstrap 5 / TailwindCSS** kết hợp Javascript thuần (Fetch API/jQuery) để xử lý DOM, xây dựng Form/Table tương tác động, gọi REST API và tích hợp thư viện Chart.js cho phân hệ báo cáo.
* **Giao tiếp Real-time:** Tích hợp **WebSocket (STOMP Protocol)** để truyền tải dữ liệu thời gian thực, cập nhật Dashboard giám sát bãi xe (số lượng chỗ trống/Capacity) với độ trễ ≤ 5s.
* **Quản lý Task:** * **Jira:** Theo dõi tiến độ công việc (Sprint/Kanban Boards), phân chia Task và quản lý lỗi (Issue/Bug Tracking).
* **Quản lý Source Code:** * **Github:** Quản lý phiên bản mã nguồn (Version Control), lưu trữ Repository tập trung và hỗ trợ cộng tác nhóm hiệu quả thông qua các quy trình Branching, Pull Request và Code Review.
* **Công cụ thiết kế:** * **v0 (bởi Vercel):** Ứng dụng AI để gen Prototype (UI/UX) nhanh chóng, bám sát định hướng AI-Augmented Development.
  * **Draw.io / Visual Paradigm:** Phục vụ vẽ tài liệu SDS (Use Case, Class Diagram, Sequence Diagram, ERD).

## 3. Thành viên nhóm & Phân chia vai trò (Feature-Based)

| MSSV | Họ và Tên | Vai trò chính | Trách nhiệm cốt lõi trong dự án (Dự kiến) |
| :--- | :--- | :--- | :--- |
| **SE192965** | Lê Hoàng Long | **Project Leader / Full-stack** | - Thiết lập kiến trúc Spring Boot, cấu hình JPA/Hibernate.<br>- Hiện thực hóa **Workflow 0 (Security):** Phân hệ Đăng nhập/Phân quyền với **Spring Security**.<br>- Review Code, quản lý Git merge request và đảm bảo tiến độ Milestone. |
| **SE190688** | Trần Văn An | **Back-end Developer** | - Chịu trách nhiệm thiết kế Database (ERD ≥ 8 thực thể, Chuẩn hóa 3NF, ≥ 10 bảng).<br>- Hiện thực hóa **Workflow 2 - Core Transaction:** API + Logic gán slot tự động (Check-in) và hệ thống tính phí phức tạp (Check-out) tuân thủ tính chất Transaction. |
| **SE192984** | Phan Bảo Duy | **Back-end Developer** | - Xây dựng module **Exception Handling** (Mất vé, sai phân khu) cần Manager duyệt.<br>- Cấu hình **Spring Scheduler** quét xe quá hạn (Overstay > 24h).<br>- Phụ trách viết tài liệu **SRS (≥ 12 User Stories)** và thiết kế bộ kịch bản kiểm thử **(≥ 25 Test Cases)**. |
| **SE190630** | Đặng Minh Bình An | **Front-end (Thymeleaf/UI)** | - Sử dụng **v0 AI** để gen UI HTML/CSS và tích hợp vào **Thymeleaf**.<br>- Xây dựng **Real-time Capacity Dashboard**: Dùng JS/Fetch API gọi REST/WebSocket để cập nhật số slot trống từng tầng ngay lập tức. |
| **SE192612** | Nguyễn Văn Linh | **Front-end (Thymeleaf/UI)** | - Tối ưu hóa UI/UX form Check-in/Check-out cho Parking Staff (Yêu cầu thao tác cực nhanh, không reload trang).<br>- Code giao diện Cấu hình bảng giá (Pricing Config) và trang Báo cáo thống kê (Reports) cho Manager. |


