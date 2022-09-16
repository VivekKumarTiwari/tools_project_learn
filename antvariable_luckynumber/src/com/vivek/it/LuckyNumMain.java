
package com.vivek.it;
import java.security.SecureRandom;
public class LuckyNumMain{
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
		int lucky = random.nextInt(9);
		System.out.println("Lucky number : "+lucky);
    }
}