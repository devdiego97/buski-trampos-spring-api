ALTER TABLE jobs
ADD CONSTRAINT fk_jobs_company
FOREIGN KEY (company_id) REFERENCES companys(id) ON DELETE CASCADE;

ALTER TABLE jobs
ADD CONSTRAINT fk_jobs_model_operating
FOREIGN KEY (model_operating_id) REFERENCES models_operating(id) ON DELETE SET NULL;

ALTER TABLE jobs
ADD CONSTRAINT fk_jobs_level_required
FOREIGN KEY (level_required_id) REFERENCES levels(id) ON DELETE SET NULL;

ALTER TABLE jobs
ADD COLUMN contract_type_id BIGINT NOT NULL;

ALTER TABLE jobs
ADD CONSTRAINT fk_jobs_contract_type
FOREIGN KEY (contract_type_id) REFERENCES contract_types(id);