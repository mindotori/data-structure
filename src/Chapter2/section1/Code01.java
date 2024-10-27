package Chapter2.section1;

public class Code01 {

    public static void main(String[] args) {

        Person1 first = new Person1();

        first.name = "John";
        first.number = "01028323123";

        System.out.println("Name: " + first.name + ", Number: " + first.number);

        Person1[] members = new Person1[10]; //Person1 타입의 배열 생성 가능
        members[0] = first;
        members[1] = new Person1();
        members[1].name = "David";
        members[1].number = "23232323";


    }
}
