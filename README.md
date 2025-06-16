# 📦 Learn Kafka - Microservices with Spring Boot & Apache Kafka

> Một dự án thực hành xây dựng hệ thống **Microservices** sử dụng **Spring Boot** kết hợp với **Apache Kafka** để truyền thông điệp bất đồng bộ giữa các service như Order, Inventory và Notification.

---

## 🚀 Mục tiêu dự án

- Hiểu và áp dụng **kiến trúc microservices**.
- Làm việc với **Apache Kafka** như một message broker.
- Xây dựng các service tương tác thông qua cơ chế **event-driven**.
- Thực hành **Spring Boot**, **Spring Kafka**, **Lombok**, và **Docker**.

---

## 🧩 Kiến trúc hệ thống

```plaintext
+----------------+      Kafka Topic      +-------------------+
|  Order Service |  ------------------>  |  Inventory Service |
+----------------+                      +-------------------+
         |                                       |
         |         Kafka Topic                  |
         +------------------------------->      |
                                               \|/
                                        +---------------------+
                                        | Notification Service |
                                        +---------------------+
```

---

## 📁 Cấu trúc thư mục

```
learnKafka/
│
├── order-service/          # Gửi event khi có đơn hàng mới
├── inventory-service/      # Lắng nghe order event và xử lý tồn kho
├── notification-service/   # Gửi thông báo khi đơn hàng được xử lý
├── docker-compose.yml      # Kafka, Zookeeper và các service
└── pom.xml                 # POM cha quản lý các module con
```

---

## ⚙️ Công nghệ sử dụng

- ✅ Java 8
- ✅ Spring Boot
- ✅ Apache Kafka
- ✅ Spring Kafka
- ✅ Docker & Docker Compose
- ✅ Maven (multi-module)
- ✅ Lombok
