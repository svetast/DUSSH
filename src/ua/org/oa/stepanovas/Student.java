package ua.org.oa.stepanovas;

public class Student {  // спотрсмены ДЮСШ  
        
    private static final int SPEED_MAX = 40; // максимальная скорость бега спрортсмена
    private static final double SPEED_MIN = 0.1; //  минимальная скорость бега спрортсмена
    private static final int AGE_MAX = 16; // максимальный возраст спортсмена
    private static final int AGE_MIN = 6;  // мимнимальный возраст спортсмена
    private String lName;   //Student's last name
    private String fName;   // Student's first name
    private int age;         //Student's age
    private float speed;     //Student's speed
    
    public String getlName() {
        return this.lName;
    }
    
    
    public String getfName() {
        return this.fName;
    }
        
    public int getAge() {
        return this.age;
    }
    public float getSpeed() {
        return this.speed;
    }
    // Проверки на отсутствие пустых полей в данных
    
    public void setParams(String nfName, String nlName, int nage, float nspeed) {
        if(nfName.isEmpty()) {
        System.out.println("Не задано имя!");
        return;
        }
        if(nlName.isEmpty()) {
        System.out.println("Не задана фамилия !");
        return;
        }       
        if(nage < AGE_MIN || nage > AGE_MAX) {
            System.out.println("Неправильный возраст" + nage +"!");
            return;
            }       
        if(nspeed < SPEED_MIN || nspeed > SPEED_MAX) {
        System.out.println("Неправильная скорость" + nspeed +"!");
        return;
        }   
        
        fName = nfName;
        lName = nlName;
        age =  nage;
        speed = nspeed;
    }
}











/*HW 2 :  Для решения задачи создать java программу, удовлетворяющую следующим требованиям:
1. Спроектировать базовый класс, содержащий в качестве полей объекты других классов.
2. Предусмотреть возможность создания объектов класса с указанием различных параметров инициализации.
3. Каждый класс, поле, метод должны иметь название, отражающее его суть и комментарии, описывающие их предназначение.
4. Продемонстрировать использование перегруженных методов и конструкторов, массивов.
5. При инициализации полей классов проверять корректность введенных данных.
6. Создать класс демонстрирующий корректность работы разработанной java программы
7. На этапе составления программы должны быть использованы соглашения из java code convention.
8. Имя пакета в котором создается класс/классы должно иметь формат ua.org.oa.<Jira Login>.
9. Индивудуальная папка в SVN репозатарии для сохранения выполненных заданий располжена по адресу http://oracle-academy.org.ua/svn/<Имя проекта>/<Jira login>
10. Опционально: организовать ввод данных с консоли
11. Опционально: отсортировать объекты в массиве по возрастанию, на основании одного из значащих полей
Создать классы ДЮСШ и спортсмены. В классе ДЮСШ создать методы для вычисления средней скорости бега легкоатлетов ДЮСШ на дистанции, выводу на экран всех легкоатлетов, чья скорость:
выше средней;
выше определенного значения;
ниже средней;
ниже определенного значения.*/