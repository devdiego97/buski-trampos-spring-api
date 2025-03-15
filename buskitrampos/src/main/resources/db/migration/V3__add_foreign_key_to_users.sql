ALTER TABLE users
ADD CONSTRAINT fk_users_company
FOREIGN KEY (company_id) REFERENCES companys(id) ON DELETE SET NULL;