import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val employees = mutableListOf<Employee>()
    val departments = listOf(
        Department(1, "HR"),
        Department(2, "Software Engineer"),
        Department(3, "Manager"),
        Department(4, "Project Engineer"),
    )

    var continueRunning = true
    do {
        println(
            """
            |1. Add Employee
            |2. View All Employees
            |3. Update Employee
            |4. Delete Employee
            |5. Exit
            |Enter your choice:
            """.trimMargin()
        )
        when (sc.nextInt()) {
            1 -> addEmployee(sc, employees, departments)
            2 -> viewAllEmployees(employees)
            3 -> updateEmployee(sc, employees)
            4 -> deleteEmployee(sc, employees)
            5 -> {
                println("Exiting...")
                continueRunning = false
            }
            else -> println("Invalid choice, please try again.")
        }
    } while (continueRunning)
}

fun addEmployee(sc: Scanner, employees: MutableList<Employee>, departments: List<Department>) {
    println("Enter Employee ID:")
    val id = sc.nextInt()
    sc.nextLine() // consume newline
    println("Enter Employee Name:")
    val name = sc.nextLine()
    println("Enter Employee Age:")
    val age = sc.nextInt()
    println("Select Department:")
    departments.forEach { println("${it.id}. ${it.name}") }
    val deptId = sc.nextInt()
    val department = departments.find { it.id == deptId }
    if (department != null) {
        employees.add(Employee(id, name, age, department))
        println("Employee added successfully!")
    } else {
        println("Invalid department selected.")
    }
}

fun viewAllEmployees(employees: List<Employee>) {
    if (employees.isEmpty()) {
        println("No employees found.")
    } else {
        employees.forEach { println(it) }
    }
}

fun updateEmployee(sc: Scanner, employees: MutableList<Employee>) {
    println("Enter Employee ID to update:")
    val id = sc.nextInt()
    val emp = employees.find { it.id == id }
    if (emp != null) {
        sc.nextLine()
        println("Enter new Employee Name:")
        emp.name = sc.nextLine()
        println("Enter new Employee Age:")
        emp.age = sc.nextInt()
        println("Employee updated successfully!")
    } else {
        println("Employee not found.")
    }
}

fun deleteEmployee(sc: Scanner, employees: MutableList<Employee>) {
    println("Enter Employee ID to delete:")
    val id = sc.nextInt()
    val employee = employees.find { it.id == id }
    if (employee != null) {
        employees.remove(employee)
        println("Employee deleted")
    } else {
        println("Employee not found.")
    }
}