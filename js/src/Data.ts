interface Employee {
    name: string;
    age: number;
    salary: number;
}

const employees: Employee[] = [
    {
        name: 'John',
        age: 30,
        salary: 4000
    },
    {
        name: 'Mary',
        age: 25,
        salary: 3500
    },
    {
        name: 'Susan',
        age: 35,
        salary: 5000
    },
    {
        name: 'Greg',
        age: 40,
        salary: 4500
    },
    {
        name: 'Jerry',
        age: 20,
        salary: 3000
    }
]

function findByName(employees: Employee[], name: string): Employee {
    // de discutat aceasta eroare, este foarte importanta
    return employees.find(employee => employee.name === name);
}

/**
 * Finds an employee by their name.
 * @param employees - The array of employees to search through.
 * @param name - The name of the employee to find.
 * @returns The employee object if found, or undefined if not found.
 */
function findByName2(employees: Employee[], name: string): Employee | undefined { // daca selctez toata functia si am si documentatie, atunci fixul este bun
    return employees.find(employee => employee.name === name);
}

function filterEmployeesBySalary(employees: Employee[], salary: number): Employee[] {
    return employees.filter(employee => employee.salary > salary);
}

function filterBySalaryAndAge(employees: Employee[], salary: number, age: number): Employee[] {
    return employees.filter(employee => employee.salary > salary && employee.age > age);
}

function getEmployeesNames(employees: Employee[]): string[] {
    return employees.map(employee => employee.name);
}

function getMaxSalary(employees: Employee[]): number {
    return employees.reduce((acc, curr) => acc > curr.salary ? acc : curr.salary, 0);
}

function getAverageSalary(employees: Employee[]): number {
    return employees.reduce((acc, curr) => acc + curr.salary, 0) / employees.length;
}