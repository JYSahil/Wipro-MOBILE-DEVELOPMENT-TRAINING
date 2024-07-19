fun main() {
    val eMSystem = EmployeeManagementSystem()

    eMSystem.addEmployee(Employee("sahil gautam", "Manager", 50000))
    eMSystem.addEmployee(Employee("Junior", "Developer", 25000))
    eMSystem.addEmployee(Employee("kelly", "Developer", 35000))
    eMSystem.addEmployee(Employee("hyper", "Developer", 15000))
    eMSystem.addEmployee(Employee("CJ", "Developer", 10000))

    eMSystem.displayEmployees()

    eMSystem.deleteEmployee("Junior")
    eMSystem.deleteEmployee("CJ")
    println("After deleting two employees")
    eMSystem.displayEmployees()
}

class Employee(val name: String, val designation: String, val salary: Int) {
    override fun toString(): String {
        return "Employee(name='$name', designation='$designation', salary=$salary)"
    }
}
class EmployeeManagementSystem {
    private val employees = mutableListOf<Employee>()

    fun addEmployee(employee: Employee) {
        employees.add(employee)
        println("Employee ${employee.name} added.")
    }
    fun deleteEmployee(name: String) {
        val iterator = employees.iterator()
        while (iterator.hasNext()) {
            val employee = iterator.next()
            if (employee.name == name) {
                iterator.remove()
                println("Employee $name deleted.")
                return
            }
        }
        println("Employee $name not found.")
    }
    fun displayEmployees() {
        if (employees.isEmpty()) {
            println("No employees to display.")
        } else {
            println("Employee List:")
            employees.forEach { println(it) }
        }
    }
}
