import java.lang.System;

public class TestAuthor {
	public static void main() {
		Author A1 = new Author();
		Author A2 = new Author("Boss", "boss@mail.ru", true);
		A1.setEmail("notABoss@mail.ru");
		System.out.println(A2);
	}
}
