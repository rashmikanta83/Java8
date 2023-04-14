import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user Name");
        String userNm = sc.next();
        System.out.println("Name is - "+userNm);
        
        System.out.println("Enter user age");
		int age = sc.nextInt();

		try {
			if (age <= 18 || age > 60) {
				throw new AgeIsNotFoundException("Age should be >= 18 and < 60"); 
			}else {
				System.out.println("Age is - "+age);
			}
		} catch (AgeIsNotFoundException ex) {
			System.out.println(ex);
		}catch (Exception ex) {
			System.out.println(ex);
		}

	}
}
