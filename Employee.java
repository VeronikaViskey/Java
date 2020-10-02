public class Employee {

    private String name;
    private String position;
    private String email;
    private String number;
    private int pay;
    private int age;


    public Employee(String name, String position, String email, String number, int pay, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.pay = pay;
        this.age = age;

    }

        public void info() {
            System.out.println("ФИО: " + name + ", Должность: " + position + ", E-mail: " + email + ", Номер телефона: " +
                    number + ", Зарплата: " + pay + ", Возвраст: " + age);
        }

    public static void main (String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Иванов Андрей Александрович", "Курьер", "ivanovandrey@yandex.ru",
                "89643598629", 30000, 21);
        empArray[1] = new Employee("Пушкин Александр Сергеевич", "Менеджер по продажам",
                "pushkinaleksandr@yandex.ru", "86542365945", 40000, 40);
        empArray[2] = new Employee("Лимонов Эдуард Вениаминович", "Директор", "limonovedyard.ru",
                "86549563256", 50000, 50);
        empArray[3] = new Employee("Дроздова Анна Валерьевна", "Секретарь", "drozdovaanna@yandex.ru",
                "85648956325", 35000, 30);
        empArray[4] = new Employee("Попова Мария Сергеевна", "Бухгалтер", "popovamaria@yandex.ru",
                "86543216548", 40000, 55);
        empArray[6] = new Employee("Ромашкова Татьяна Васильевна", "Менеджер по контролю качества",
                "ivanovandrey@yandex.ru", "82365489658", 35000, 25);
        
        for (int i=0; i < empArray.length; i++) {
            if (empArray[i].age > 40){
                empArray[i].info();
            }
        }


    }
}

