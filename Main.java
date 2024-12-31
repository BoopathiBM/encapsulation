public class Main{
    public static void main(String[] args){
        Person person = new Person();
        
        // set value using setter mentods
        person.setName("boopathi");
        person.setAge(29);
        person.setCountry("India");

        // get value using getter mentods
        String name = person.getName();
        int age = person.getAge();
        String country = person.getCountry();

        System.out.println("name: "+ name);





    }
}