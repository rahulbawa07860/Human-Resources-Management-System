<h1>WorkforceWise (HRMS)</h1>
<p>WorkforceWise is a Human Resources Management System (HRMS) application designed to streamline and automate various HR functions for organizations of all sizes. With WorkforceWise, businesses can manage their employee data such as hire employee, assign department, grant leave and keep track on work status of employee in one centralized platform</p>
<p>WorkforceWise also features employee self-service tools, allowing employees to manage their personal information, request time off, change credentials and as such more. With customizable workflows and integrations with popular third-party applications, WorkforceWise can be tailored to meet the unique needs of any organization.</p>
<h1>features</h1>
<h4>Role of Admin:</h4>
<p> - Admin can add new Departments</p>
<p> - Admin can view and update the Departments</p>
<p> - Admin can register new Employees and give them their password</p>
<p> - Admin can also transfer them to other departments</p>
<p> - Admin can grant or deny employee leave request</p>
<h4>Role of Employee:</h4>
<p> - Employee can view and update his profile</p>
<p> - Employee can also change his password</p>
<p> - Employee can also request for leaves</p>



 




<h1>Tech Stack and Tools Used:-</h1>
<p>- JAVA </p>
<p>- MySQL </p>
<p>- Spring Boot </p>



<h1>The Basic Prerequisites of this Application are as follow </h1>

- [x] Should Have a MySQL Server 
- [x] Should Have a Database Created.
- [x] Should have created following tables into the database 


- [X] TABLE ADMIN


| Field         | Type        | Null | Key | Default | Extra          |
|---------------|-------------|------|-----|---------|----------------|
| adminName    | varchar(26) | NO   |     | NULL    |                |




<hr />

- [x] TABLE EMPLOYEE


| Field       | Type        | Null | Key | Default           | Extra             |
|-------------|-------------|------|-----|-------------------|-------------------|
| empId      | int          | NO   | PRI | NULL              | auto_increment    |
| empName    | varchar(12)  | NO   |     | NULL              |                   |
| empPass    | varchar(8)   | NO   | UNI | NULL              |                   |
| deptId     | int          | YES  | MUL | NULL              |                   |
| emp_login  | datetime     | YES  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |




<hr />

- [X] TABLE DEPARTMENT


| Field     | Type        | Null | Key | Default | Extra          |
|-----------|-------------|------|-----|---------|----------------|
| deptID   | int         | NO   | PRI | NULL    | auto_increment |
| deptName | varchar(20) | NO   | UNI | NULL    |                |



<hr />





- [x] TABLE LEAVE_APPLICATION


| Field     | Type        | Null | Key | Default | Extra |
|-----------|-------------|------|-----|---------|-------|
| empid    | int         | YES  | UNI | NULL    |       |
| leaveDay | varchar(10) | YES  |     | NULL    |       |
| status   | varchar(10) | YES  |     | Pending |       |



<hr />

<h2> Thanks for taking the time to read this project file - your interest and attention are greatly appreciated! &#x1F60A; </h2>

