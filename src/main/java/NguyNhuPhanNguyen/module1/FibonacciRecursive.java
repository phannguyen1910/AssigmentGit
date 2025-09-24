/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguyNhuPhanNguyen.module1;

/**
 *
 * @author LENOVO
 */
public class FibonacciRecursive implements Fibonacci {
    @Override
    public int fun(int n, boolean flag) {
        if (flag) {
            if (n <= 1) return n;
            return fun(n - 1, true) + fun(n - 2, true);
        }
        return -1; // không xử lý nếu flag = false
    }
}
