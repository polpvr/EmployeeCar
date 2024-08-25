public class Employee {

        private String initials;
        private String position;
        private String email;
        private String phone;
        private int age;

        public Employee(String initials, String position, String email, String phone, int age) {
            this.initials = initials;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.age = age;
        }

        public String getInitials() {
            return initials;
        }

        public String getPosition() {
            return position;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }

        public int getAge() {
            return age;
        }

        public void setInitials(String initials) {
            this.initials = initials;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }