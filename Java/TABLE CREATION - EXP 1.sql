CREATE database company;
USE company;

-- 1. regions
CREATE TABLE regions (
    region_id INT PRIMARY KEY,
    region_name VARCHAR(100) NOT NULL
);

-- 2. countries
CREATE TABLE countries (
    country_id CHAR(2) PRIMARY KEY,
    country_name VARCHAR(100) NOT NULL,
    region_id INT,
    CONSTRAINT fk_countries_region
        FOREIGN KEY (region_id)
        REFERENCES regions(region_id)
);

-- 3. locations
CREATE TABLE locations (
    location_id INT PRIMARY KEY,
    street_address VARCHAR(255),
    postal_code VARCHAR(20),
    city VARCHAR(100) NOT NULL,
    state_province VARCHAR(100),
    country_id CHAR(2),
    CONSTRAINT fk_locations_country
        FOREIGN KEY (country_id)
        REFERENCES countries(country_id)
);

-- 4. departments
CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(100) NOT NULL,
    location_id INT,
    CONSTRAINT fk_departments_location
        FOREIGN KEY (location_id)
        REFERENCES locations(location_id)
);

-- 5. jobs
CREATE TABLE jobs (
    job_id VARCHAR(20) PRIMARY KEY,
    job_title VARCHAR(100) NOT NULL,
    min_salary DECIMAL(10,2),
    max_salary DECIMAL(10,2)
);

-- 6. employees
CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(100),
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    phone_number VARCHAR(30),
    hire_date DATE NOT NULL,
    job_id VARCHAR(20),
    salary DECIMAL(10,2),
    manager_id INT,
    department_id INT,
    CONSTRAINT fk_employees_job
        FOREIGN KEY (job_id)
        REFERENCES jobs(job_id),
    CONSTRAINT fk_employees_department
        FOREIGN KEY (department_id)
        REFERENCES departments(department_id),
    CONSTRAINT fk_employees_manager
        FOREIGN KEY (manager_id)
        REFERENCES employees(employee_id)
);

-- 7. dependents
CREATE TABLE dependents (
    dependent_id INT PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    relationship VARCHAR(50),
    employee_id INT,
    CONSTRAINT fk_dependents_employee
        FOREIGN KEY (employee_id)
        REFERENCES employees(employee_id)
);
