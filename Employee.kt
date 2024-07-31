data class Employee(var id: Int, var name: String, var age: Int, var department: Department) {
    override fun toString(): String {
        return "Employee(id=$id, name=$name, age=$age, Department = ${department.name})"
    }
}
