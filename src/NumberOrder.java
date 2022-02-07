import java.util.ArrayList;
import java.util.List;

/*
1) Write a function that returns true if a string consists of ascending or ascending AND consecutive numbers.

Examples
ascending("232425") --> true
// Consecutive numbers 23, 24, 25

ascending("2324256") --> false
// No matter how this string is divided, the numbers are not consecutive.

ascending("444445") --> true
// Consecutive numbers 444 and 445.
Notes
A number can consist of any number of digits, so long as the numbers are adjacent to each other, and the
string has at least two of them.

2) Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.

Examples
squarePatch(3) --> [
[3, 3, 3],
[3, 3, 3],
[3, 3, 3]
]

squarePatch(5) --> [
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5]
]

squarePatch(1) --> [
[1]
]

squarePatch(0) --> []
Notes
n >= 0.
If n = 0, return an empty array.
 */
public class NumberOrder {
    //1 (only numbers)
    public Boolean ascending(String number) {
        for (int i = 0; i < number.length() / 2; i++) {
            String temp = number.substring(0, i + 1);
            int n = Integer.parseInt(temp);

            while (temp.length() < number.length()) {
                n++;
                temp = temp + n;
            }
            if (temp.equals(number)) return true;
        }
        return false;
    }
    //2 (n >= 0)
    public List<List<Integer>> squarePatch(int n) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(n);
            }
            list.add(temp);
        }
        return list;
    }
}
