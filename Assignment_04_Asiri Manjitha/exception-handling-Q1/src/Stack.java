public class Stack {
    static final int lengthOfStack = 3;
    static Contact contact[] = new Contact[lengthOfStack];
    static int lastFilledIndex = 0;

    public static void push(Contact c) throws Exception {
        if (lengthOfStack-1 == lastFilledIndex) {
            throw new Exception();
        } else if (!c.validate()) {
            throw new Exception();
        } else {
            contact[lastFilledIndex] = c;
            lastFilledIndex++;
        }
    }

    public static void pop() throws Exception {
        if (lastFilledIndex==0) {
            throw new Exception();
        } else {
            contact[lastFilledIndex] = null;
            lastFilledIndex--;
        }
    }
}
