public class SwapVariable {
    public static void swapVariableIntUsingTempVar(int a, int b) {
        System.out.println("Variable int1 before:" + a + "| Variable int2 before:" + b);
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("Variable int1 after:" + a + "| Variable int2 after:" + b);
    }

    public static void swapVariableIntUsingTwoVar(int a, int b) {
        System.out.println("Variable int1 before:" + a + "| Variable int2 before:" + b);
        
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Variable int1 after:" + a + "| Variable int2 after:" + b);
    }

    public static void swapVariableIntUsingXor(int a, int b) {
        System.out.println("Variable int1 before:" + a + "| Variable int2 before:" + b);
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("Variable int1 after:" + a + "| Variable int2 after:" + b);
    }

    public static void swapVariableStringUsingTempVar(String a, String b) {        
        System.out.println("Variable str1 before:" + a + "| Variable str2 before:" + b);
        
        String temp = a;
        a = b;
        b = temp;
        
        System.out.println("Variable str1 after:" + a + "| Variable str2 after:" + b);
    }

    public static void swapVariableStringUsingTwoVar(String a, String b) {
        System.out.println("Variable str1 before:" + a + "| Variable str2 before:" + b);
        
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        
        System.out.println("Variable str1 after:" + a + "| Variable str2 after:" + b);
    }

    public static void main(String[] args) {
        int int1 = 10, int2 = 20;
        String str1 = "First", str2 = "Second";

        swapVariableIntUsingTempVar(int1, int2);
        //swapVariableIntUsingTwoVar(int1, int2);
        //swapVariableIntUsingXor(int1, int2);

        swapVariableStringUsingTempVar(str1, str2);
        //swapVariableStringUsingTwoVar(str1, str2);
    }
}