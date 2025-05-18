CREATE TABLE IF NOT EXISTS students (
                                                id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                                name VARCHAR(150) NOT NULL,
                                                date_of_adoption TIMESTAMP,
                                                group_id BIGINT,
                                                FOREIGN KEY (group_id) REFERENCES groups_students(id) ON DELETE SET NULL ON UPDATE CASCADE
);