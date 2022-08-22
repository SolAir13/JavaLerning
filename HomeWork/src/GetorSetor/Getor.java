package GetorSetor;

class GetorSetor {
    public static void main(String[] args) {
        Preson pr = new Preson();
        pr.setName(" Алекс ");
        pr.setAge(12);
        System.out.println("Выводим значение маин: " + pr.getAge());
        System.out.println("Выводим значение маин: " + pr.getName());
    }
}

class Preson {
    String name;
    int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Введите корректное значение ");
        } else {
            name = userName;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Вы ввели отрицаловку");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

}


