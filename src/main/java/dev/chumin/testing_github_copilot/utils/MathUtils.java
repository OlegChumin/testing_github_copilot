package dev.chumin.testing_github_copilot.utils;

public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }

    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    public static int fibonacci(int a) {
        if (a <= 1) {
            return a;
        }
        return fibonacci(a - 1) + fibonacci(a - 2);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, modulo(a, b));
    }

    public static int lcm(int a, int b) {
        return divide(multiply(a, b), gcd(a, b));
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int abs(int a) {
        return a < 0 ? -a : a;
    }

    public static int clamp(int a, int min, int max) {
        return a < min ? min : a > max ? max : a;
    }

    public static int sign(int a) {
        return a < 0 ? -1 : a > 0 ? 1 : 0;
    }

    public static int round(int a) {
        return (int) Math.round(a);
    }

    public static int ceil(int a) {
        return (int) Math.ceil(a);
    }

    public static int floor(int a) {
        return (int) Math.floor(a);
    }

    public static int sqrt(int a) {
        return (int) Math.sqrt(a);
    }

    public static int cbrt(int a) {
        return (int) Math.cbrt(a);
    }

    public static int sin(int a) {
        return (int) Math.sin(a);
    }

    public static int cos(int a) {
        return (int) Math.cos(a);
    }

    public static int tan(int a) {
        return (int) Math.tan(a);
    }

    public static int asin(int a) {
        return (int) Math.asin(a);
    }

    public static int acos(int a) {
        return (int) Math.acos(a);
    }

    public static int atan(int a) {
        return (int) Math.atan(a);
    }

    public static int toRadians(int a) {
        return (int) Math.toRadians(a);
    }

    public static int toDegrees(int a) {
        return (int) Math.toDegrees(a);
    }

    public static int log(int a) {
        return (int) Math.log(a);
    }

    public static int log10(int a) {
        return (int) Math.log10(a);
    }

    public static int log1p(int a) {
        return (int) Math.log1p(a);
    }

    public static int exp(int a) {
        return (int) Math.exp(a);
    }

    public static int expm1(int a) {
        return (int) Math.expm1(a);
    }

    public static int hypot(int a, int b) {
        return (int) Math.hypot(a, b);
    }

    public static int ulp(int a) {
        return (int) Math.ulp(a);
    }

    public static int signum(int a) {
        return (int) Math.signum(a);
    }

    public static int sinh(int a) {
        return (int) Math.sinh(a);
    }

    public static int cosh(int a) {
        return (int) Math.cosh(a);
    }

    public static int tanh(int a) {
        return (int) Math.tanh(a);
    }

    public static int random() {
        return (int) Math.random();
    }

    public static int nextAfter(int a, int b) {
        return (int) Math.nextAfter(a, b);
    }

    public static int nextUp(int a) {
        return (int) Math.nextUp(a);
    }

    public static int scalb(int a, int b) {
        return (int) Math.scalb(a, b);
    }

    public static int copySign(int a, int b) {
        return (int) Math.copySign(a, b);
    }

    public static int getExponent(int a) {
        return (int) Math.getExponent(a);
    }

    public static int nextDown(int a) {
        return (int) Math.nextDown(a);
    }
}
