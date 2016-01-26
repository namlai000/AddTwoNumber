/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import junit.framework.TestCase;

/**
 *
 * @author the_s
 */
public class AddMethodTest extends TestCase {
    
    public AddMethodTest(String testName) {
        super(testName);
    }

    /**
     * Test of add method, of class AddMethod.
     */
    public void testAdd() {
        int a = 4;
        int b = 3;
        AddMethod instance = new AddMethod();
        int expResult = 7;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }
    
}
