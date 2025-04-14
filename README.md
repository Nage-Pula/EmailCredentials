# 📧 EmailCredentials Java Application

A real-world **Java 17 OOP project** that simulates the role of an **IT Support Administrator** responsible for generating and managing employee credentials.

🔐 Generates secure passwords  
📬 Builds professional emails  
🕒 Greets users based on system time  
📦 Fully modular with Maven + packages  
✅ Includes automated tests using JUnit 5

---

## 🚀 Features

- ✅ Collects first and last name from user input (with validation)
- ✅ Validates department code (1 to 4 only)
- ✅ Auto-formats names (capitalizes first letter)
- ✅ Displays time-sensitive greeting: Good Morning / Afternoon / Evening
- ✅ Generates **email address** in the format:
firstnamelastname@department.company.com
- ✅ Generates **secure 8-character password** with:
- 2 lowercase letters
- 2 uppercase letters
- 2 digits
- 2 special characters
- No repeated characters
- ✅ Outputs credentials with proper formatting

---

## 🗂️ Project Structure

```bash
EmailCredentials/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── EmailCredentials/
│                   ├── App/
│                   │   ├── App.java
│                   │   └── package-info.java
│                   ├── CredentialService/
│                   │   ├── CredentialService.java
│                   │   └── package-info.java
│                   ├── DepartmentDetails/
│                   │   ├── DepartmentDetails.java
│                   │   └── package-info.java
│                   ├── EmployeeDetails/
│                   │   └── EmployeeDetails.java
│                   ├── Service/
│                   │   ├── ServiceClass.java
│                   │   └── package-info.java
│
├── src/
│   └── test/
│       └── java/
│           └── com/
│               └── EmailApplicationforDepartments/
│                   └── EmailCredentials/
│                       └── AppTest.java
│
├── pom.xml
└── target/

Good Afternoon...!
Enter First Name: Nage
Enter Last Name: Pula

Helloo Nage Pula....!
Please Enter Department from the following
1. Technical
2. Admin
3. Human Resource
4. Legal

Enter department code (1-4): 2
Department selected: 'Admin'

Good Afternoon Nage Pula..!
Your generated credentials are as follows:
Email     ---> nagepula@admin.company.com
Password  ---> 4c@5g0*U


🧪 Testing (JUnit 5)
Includes unit tests for:

Password length

Password uniqueness

Password composition (uppercase, lowercase, digits, special)

Email format

✅ How to Run Tests in Eclipse:
Right-click on AppTest.java

Click: Run As > JUnit Test

Green bar = ✅ All tests passed

🛠️ Tech Stack
Tool	Purpose
Java 17	Core language
JUnit 5	Unit testing
Eclipse IDE for Enterprise Java	Development
Maven	Dependency and project management
📦 How to Run This Project
Clone the repository:

bash
Copy
Edit
git clone https://github.com/your-username/EmailCredentials.git
Open in Eclipse (File > Open Projects from File System)

Right-click on App.java → Run As > Java Application

/*******************************************************************************/
🙋‍♂️ Author

Nageswara Rao Pula
Java & Backend Developer | Full Stack Enthusiast

📧 Email: pulanageswararao1@gmail.com
🔗 LinkedIn : https://www.linkedin.com/in/nageswara-rao-pula-a9b751144/
🐱 GitHub   : https://github.com/Nage-Pula/

/*******************************************************************************/


---

### ✅ What to Do Now:

- 🔄 Replace:
  - `your-username` with your GitHub
  - `your.email@example.com` with your real email
  - `linkedin.com/in/your-profile` with your actual LinkedIn URL
- 📁 Save as `README.md` in your root directory
- ⬆️ Push it to GitHub with:
  ```bash
  git add README.md
  git commit -m "Add custom README with feature list and usage"
  git push origin main
 





