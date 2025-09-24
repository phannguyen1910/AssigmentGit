/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguyNhuPhanNguyen.module1;

/**
 *
 * @author LENOVO
 */
public class FibonacciLoop implements Fibonacci {
    @Override
    public int fun(int n, boolean flag) {
        if (!flag) {
            if (n <= 1) return n;
            int a = 0, b = 1, c = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
        return -1; // không xử lý nếu flag = true
    }
}
