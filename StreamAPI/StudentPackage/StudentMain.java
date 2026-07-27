package StreamAPI.StudentPackage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMain
{
    public static void main(String[] args)
    {
        List<Student> students = Arrays.asList(
                new Student("Sriram",22),
                new Student("Anu",20),
                new Student("John",23)
        );

        Map<String,Integer> studentMap = students.stream()
                .collect(Collectors.toMap(
                        Student::getName,
                        Student::getAge,
                        (oldValue,newValue) -> oldValue
                ));

        studentMap.forEach((name,age) ->
                System.out.println(name + " : " + age));
    }
}
