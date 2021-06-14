package HomeWork7;

public class Main {
    public static void main(String[] args) {

        User user = User.builder()
                .firstName("Marsel")
                .lastName("Sidikov")
                .age(26)
                .isWorker(true)
                .build();

        System.out.println(user.getFirstName() + " " + user.getLastName() +
                " " +user.getAge() + " лет - " + user.getIsWorker() + " worker");


    }


}
