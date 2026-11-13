# Bài 5: Test Coverage & Quality Enforcement (JaCoCo)

Dự án Java Maven tích hợp **JaCoCo** và **GitHub Actions** để đo lường độ bao phủ mã nguồn (Code Coverage) và tự động chặn build nếu tỷ lệ bao phủ thấp hơn ngưỡng quy định.

## Cấu hình chính
* **Plugin JaCoCo (`pom.xml`):** Sinh báo cáo độ bao phủ tại pha `test` và kiểm tra ngưỡng tối thiểu **80%** (`COVEREDRATIO >= 0.80`) tại pha `verify`.
* **Workflow CI (`.github/workflows/ci.yml`):** Thực thi lệnh `mvn verify` và sử dụng `actions/upload-artifact` để lưu trữ thư mục báo cáo `target/site/jacoco/` (chứa `index.html`).