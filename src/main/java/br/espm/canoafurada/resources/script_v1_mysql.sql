CREATE DATABASE `espm.ms.user`

CREATE TABLE `user` (
                         `id` char(36) NOT NULL,
                         `name` char(36) NOT NULL,
                         `document` char(36) NOT NULL,
                         `cellphone` char(36) NOT NULL,
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;