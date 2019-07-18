package com.ashokslsk.blockchain;

public class BlockApp {
    public static void main(String[] args) {
        System.out.println(SHA256Helper.hash("Ashok Kumar Srinivas"));

        //Double Hashing
        System.out.println(SHA256Helper.hash(SHA256Helper.hash("Ashok Kumar Srinivas")));
    }
}


// Sample output
// 9a24a805a98d7ed92c9f494954394f9f9c47df6c9fddbd31aa22682a2ed74ad5 - Hashvalue for the string