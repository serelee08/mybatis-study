CREATE TABLE IF NOT EXISTS member (
    member_id VARCHAR(50) PRIMARY KEY,
    name      VARCHAR(100) NOT NULL,
    email     VARCHAR(100),
    age       INT
);