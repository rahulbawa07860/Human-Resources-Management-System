<h1>WorkforceWise (HRMS)</h1>
<p>WorkforceWise is a Human Resources Management System (HRMS) application designed to streamline and automate various HR functions for organizations of all sizes. With WorkforceWise, businesses can manage their employee data such as hire employee, assign department, grant leave and keep track on work status of employee in one centralized platform.</p>
<p>WorkforceWise also features employee self-service tools, allowing employees to manage their personal information, request time off, change credentials and as such more. With customizable workflows and integrations with popular third-party applications, WorkforceWise can be tailored to meet the unique needs of any organization.</p>
<h1>The Basic Prerequisites of this Applications are</h1>
# The Basic Prerequisites of this Applications are.
- [x] Should Have a MySQL Server and a Database Created.
- [x] Should have created following tables into the database WITh   SAME DATA TYPES.


- [X] TABLE DEPARTMENT


| Field     | Type        | Null | Key | Default | Extra          |
|-----------|-------------|------|-----|---------|----------------|
| dept_id   | int         | NO   | PRI | NULL    | auto_increment |
| dept_name | varchar(20) | NO   | UNI | NULL    |                |



<hr />

- [X] TABLE ADMIN


| Field         | Type        | Null | Key | Default | Extra          |
|---------------|-------------|------|-----|---------|----------------|
| admin_name    | varchar(256) | NO   |     | NULL    |                |




<hr />

- [x] TABLE EMPLOYEE


| Field       | Type        | Null | Key | Default           | Extra             |
|-------------|-------------|------|-----|-------------------|-------------------|
| emp_id      | int         | NO   | PRI | NULL              | auto_increment    |
| emp_name    | varchar(30) | NO   |     | NULL              |                   |
| emp_pass    | varchar(8)  | NO   | UNI | NULL              |                   |
| emp_dept_id | int         | YES  | MUL | NULL              |                   |
| emp_login   | datetime    | YES  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |




<hr />

- [x] TABLE LEAVE_APPLICATION


| Field     | Type        | Null | Key | Default | Extra |
|-----------|-------------|------|-----|---------|-------|
| emp_id    | int         | YES  | UNI | NULL    |       |
| leave_day | varchar(10) | YES  |     | NULL    |       |
| status    | varchar(10) | YES  |     | Pending |       |



<hr />


