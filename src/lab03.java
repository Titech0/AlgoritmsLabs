package src;
class lab03 {

  public static void main(String[] args) {
    Factorial factorial = new Factorial();
    int n = 5;
    int factRecur = factorial.recursionExecute(n);
    int factCycle = factorial.cycleExecute(n);

    assert factRecur == factCycle : "different values";
    System.out.println("Factorial of " + n + " using recursion: " + factRecur);
    System.out.println("Factorial of " + n + " using cycle: " + factCycle);

    Fibonacci fibonacci = new Fibonacci();
    n = 6;
    int fibRecur = fibonacci.recursionExecute(n);
    int fibCycle = fibonacci.cycleExecute(n);
	
    assert fibRecur == fibCycle : "different values";
    System.out.println(
      "Fibonacci number " + n + " using recursion: " + fibRecur
    );
    System.out.println("Fibonacci number " + n + " using cycle: " + fibCycle);

    DigitSum digitSum = new DigitSum();
    n = 123456;
    int sum = digitSum.execute(n);
    System.out.println("Sum of digits of " + n + ": " + sum);

    SumWithoutPlus sumWithoutPlus = new SumWithoutPlus();
    int a = 15;
    int b = 27;
    int sumWithoutPlusResult = sumWithoutPlus.execute(a, b);
    System.out.println(
      "Sum of " +
      a +
      " and " +
      b +
      " without + operator: " +
      sumWithoutPlusResult
    );
  }
}
