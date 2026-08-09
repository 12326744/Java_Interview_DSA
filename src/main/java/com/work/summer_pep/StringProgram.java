package com.work.summer_pep;

public class StringProgram {
    public static void main(String[] args) {

        // String literal.
        // "Java" is stored in the String Constant Pool (SCP) if it doesn't already exist.
        // The reference variable 'str' is stored in the Stack and points to the SCP object.
        String str = "Java";

        // Prints the String object referenced by 'str'.
        System.out.println(str);

        // concat() DOES NOT modify the existing String because String is immutable.
        // If " programming" is not already in the SCP, it is added there.
        // concat() creates a NEW String object "Java programming".
        // Since we are NOT storing the returned reference,
        // the new String object becomes eligible for Garbage Collection.
        str.concat(" programming");

        // 'str' still points to the original "Java" object.
        System.out.println(str);

        // concat() again creates a NEW String object "Java programming".
        // Now the returned reference is stored in variable 's'.
        // 'str' still points to "Java".
        // 's' points to the new String "Java programming".
        String s = str.concat(" programming");

        // Prints the new String object.
        System.out.println(s);



        // -------------------- new String() Example --------------------

        // Step 1:
        // Java checks whether "Hello" exists in the String Constant Pool.
        // If not, it creates it.

        // Step 2:
        // Because of 'new', Java ALWAYS creates a NEW String object
        // in the normal Heap memory.
        // Variable 'a' points to this Heap object.
        String a = new String("Hello");

        // "Hello" already exists in the String Constant Pool,
        // so Java does NOT create another SCP object.
        // But 'new' forces Java to create another Heap object.
        // Variable 'b' points to this second Heap object.
        String b = new String("Hello");



        // == compares the memory addresses (references).
        // 'a' and 'b' point to different Heap objects.
        // Therefore output is false.
        System.out.println(a == b);



        // equals() compares the content of the Strings.
        // Both contain "Hello".
        // Therefore output is true.
        System.out.println(a.equals(b));



        String s1 = "Python";
        String s2 = "Python";

        System.out.println(s1 == s2);   // true
        // == compares object references (memory addresses).
        // Both s1 and s2 point to the SAME String object in the String Constant Pool (SCP).

//        s1 and s2 are created using String literals. Java stores String literals in the String Constant Pool.
//        When "Python" is created for s1, the JVM stores it in the pool.
//        When s2 is created, the JVM finds that "Python" already exists in the pool,
//        so it reuses the same object instead of creating a new one. Therefore,
//        both s1 and s2 point to the same object, and == returns true.





        String str1 = "programming";      // String literal stored in the String Constant Pool (SCP)
        String str2 = new String("programming");
        // "programming" already exists in the SCP.
        // 'new' creates a separate String object in the normal Heap.
        // str2 points to the Heap object.

        System.out.println(str1 == str2);
        // false
        // == compares object references.
        // str1 points to the SCP object, while str2 points to a different Heap object.

        System.out.println(str1.equals(str2));
        // true
        // equals() compares the contents of the Strings.
        // Both contain "programming".




    }
}