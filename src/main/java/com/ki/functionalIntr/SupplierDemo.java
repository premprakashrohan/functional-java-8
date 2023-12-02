package com.ki.functionalIntr;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ki.functionalIntr.collections.Employee;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Employee> empSup = ()->new Employee(1, "Krish");
		System.out.println(empSup.get());
//		Arrays.stream(new String[] {}).
//		Supplier<String> otp = ()->{
//			return new StringBuilder().append(Math.random()*10).toString();
//		};
		String random_string = Stream.generate(new Generator())
                .limit(6)
                .collect(Collectors.joining());
        System.out.println(random_string);
	}

}
class Generator implements Supplier<String> {
    Random random = new Random(10);
    char[] letters =
            "0123456789".toCharArray();
    @Override
    public String get() {
        System.out.println(letters[random.nextInt(letters.length)]);
        return "" + letters[random.nextInt(letters.length)];
    }
}