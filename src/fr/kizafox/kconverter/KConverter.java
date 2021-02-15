package fr.kizafox.kconverter;

/**
 * --
 * Project create by KIZAFOX on 09/16/2019 in {@link KConverter} (Modified on 02/15/2021)
 * Converter class in {@link Converter}
 * --
 * Copyright © 2019 by KIZAFOX.
 * All rights reserved. This java project or any portion thereof
 * may not be reproduced or used in any manner whatsoever
 * without the express written permission of the publisher
 * except for the use of brief quotations in a project review.
 * --
 */
public final class KConverter {

    public static void main(String... args){
        System.out.println("Decimal of 11111111 is: " + Converter.binaryToDecimal(11111111));
        System.out.println("Binary of 255 is: " + Converter.decimalToBinary(255));
        System.out.println("Decimal of \"A\" is: " + Converter.hexadecimalToDecimal("A"));
        System.out.println("Hexadecimal of 10 is: " + Converter.decimalToHexadecimal(10));
    }
}
