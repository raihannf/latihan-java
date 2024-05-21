package InheritanceDanPolymorphism.Nomor2;

public class Main {
        public static void main(String[] args) {

                Person person = new Person("Anisa", "Jl. Elang", "08123456789", "anisa@upi.edu");

                Student student = new Student("Bintang", "Jl. Dahlia", "08987654321", "bintang@upi.edu",
                                Student.tingkatAkhir);

                Employee employee = new Employee("Cantika", "Jl. Cempaka", "08192837465", "cantika@upi.edu", 303,
                                4500000);

                Faculty faculty = new Faculty("Doni", "Jl. Bakung", "08564738291", "doni@upi.edu", 506, 12000000,
                                "07:00 - 16:00", "Guru Besar");

                Staff staff = new Staff("Eni", "Jl. Anggrek", "08981276345", "eni@upi.edu", 102, 6500000,
                                "Lektor");

                System.out.println("\n--- Class Person ---" + person.toString());
                System.out.println("\n--- Class Student ---" + student.toString());
                System.out.println("\n--- Class Employee ---" + employee.toString());
                System.out.println("\n--- Class Faculty ---" + faculty.toString());
                System.out.println("\n--- Class Staff ---" + staff.toString());
        }
}