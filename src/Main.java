public class Main {

        public static void main(String[] args) {

            Employee employee = new Employee("Свіргун Наталя Сергіївна", "Бухгалтер", "svirgun1986@gmail.com", "+380956789012", 37);

            System.out.println("Співробітник:");
            System.out.println("ПІБ: " + employee.getInitials());
            System.out.println("Посада: " + employee.getPosition());
            System.out.println("Email: " + employee.getEmail());
            System.out.println("Телефон: " + employee.getPhone());
            System.out.println("Вік: " + employee.getAge());

            Car car = new Car();
            car.start();
        }
    }

