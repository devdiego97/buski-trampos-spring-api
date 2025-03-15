CREATE TABLE jobs (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(30) NOT NULL,
    about VARCHAR(500) NOT NULL,
    requirements VARCHAR(500) NOT NULL,
    level_required VARCHAR(50) NOT NULL,
    status VARCHAR(50) NOT NULL,
    city VARCHAR(30),
    state VARCHAR(2),
    salary DECIMAL(19, 2),
    benefits VARCHAR(500) NOT NULL,
    exclusivePCD BOOLEAN DEFAULT FALSE,
    expire_date DATE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    company_id BIGINT NOT NULL,
    model_operating_id BIGINT,
    level_required_id BIGINT
);