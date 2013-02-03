import java.util.ArrayList;
import java.util.List;

public class Factors {
	public static List<Integer> of(int n) {
		List<Integer> primes = new ArrayList<Integer>();
		for (int candidate=2; n > 1; candidate++)
			for (; n % candidate == 0; n /= candidate)
				primes.add(candidate);
		return primes;
	}
}