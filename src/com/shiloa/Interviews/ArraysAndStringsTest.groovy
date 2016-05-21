package com.shiloa.Interviews

class ArraysAndStringsTest extends GroovyTestCase {

    void testIsAllUniqueCharacters() {
        assertTrue(ArraysAndStrings.isAllUniqueCharacters("abcde"));
        assertFalse(ArraysAndStrings.isAllUniqueCharacters("foo"));
        assertTrue(ArraysAndStrings.isAllUniqueCharacters("ab cde."));
    }

    void testIsPermutation() {
        assertTrue(ArraysAndStrings.isPermutation("hello", "ehllo"));
        assertFalse(ArraysAndStrings.isPermutation("hello", "hell"));
        assertFalse(ArraysAndStrings.isPermutation("ofo", "foo "));
    }
}
