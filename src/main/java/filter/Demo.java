package filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {

    class Person{
        String gender;

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Map<String, List<Person>> groupMap = persons.stream().collect(Collectors.groupingBy(Person::getGender));
        groupMap.forEach((k, v) -> {
            System.out.println(k);
            v.forEach(System.out::println);
        });
    }
}
