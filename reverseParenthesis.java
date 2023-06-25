import java.util.Stack;

public class reverseParenthesis  {
public static int reverseParenthesis(String expn, int size) {
Stack<Character> stk = new Stack<Character>();
int openCount = 0;
int closeCount = 0; 
char ch;
if (size % 2 == 1) {
System.out.println("Invalid odd length " + size);
return -1;
}
for (int i = 0; i < size; i++) {
ch = expn.charAt(i);
if (ch == '(')
stk.push(ch);
else if (ch == ')')
if (stk.size() != 0 && stk.peek() == '(')
stk.pop();
else
stk.push(')');
}
while (stk.size() != 0) {
if (stk.pop() == '(')
openCount += 1;
else
closeCount += 1;
}
}