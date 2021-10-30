package pck;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Math {
	
	public int[] GetOddNumbers(int[] arr) {
		List<Integer> numbers = new ArrayList<Integer>();
		for(var n : arr) {
			if(n%2 != 0) numbers.add(n);
		}
		return numbers.stream().mapToInt(i->i).toArray();
	}
	
	public int[] GetEvenNumbers(int[] arr) {
		List<Integer> numbers = new ArrayList<Integer>();
		for(var n : arr) {
			if(n%2 == 0) numbers.add(n);
		}
		return numbers.stream().mapToInt(i->i).toArray();
	}
	
	public int[] GetPrimeNumbers(int[] arr) {
		List<Integer> numbers = new ArrayList<Integer>();
		for(var n : arr) {
			if(isPrime(n)) numbers.add(n);
		}
		return numbers.stream().mapToInt(i->i).toArray();
	}	
	
	public boolean isPrime(int number) {
		if(number < 0) throw new IllegalArgumentException("Negative numbers are excluded.");
		for(int i=2; i<=number/2; i++)
        {
           if(number%i==0) return false;
        }
        return true;
	}
	
	public boolean Game() {
		Random rnd = new Random();
		int value = rnd.nextInt(100);
		if(value < 30) return false; // Lost the game
		return true;
	}
}
