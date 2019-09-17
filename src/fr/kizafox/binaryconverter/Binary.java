package fr.kizafox.binaryconverter;

import java.util.Objects;

/**
 * --
 * Le projet a été crée par KIZAFOX. (workspace)
 * Dans le package fr.kizafox.binaryconverter.
 * Le lundi 16 septembre 2019 à 22h06.
 * --
 * Copyright © 2019 by KIZAFOX.
 * All rights reserved. This java project or any portion thereof
 * may not be reproduced or used in any manner whatsoever
 * without the express written permission of the publisher
 * except for the use of brief quotations in a project review.
 * --
 */

public class Binary {

    static int getDecimal(int binary){
        int decimal = 0;
        int n = 0;

        while (true){
            if(binary == 0){
                break;
            }else{
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }

    static int getBinary(int decimal){
        StringBuilder stringBuilder = new StringBuilder();
        int base = 2;
        while (decimal != 0){
            int reminder = decimal%base;
            stringBuilder.append(reminder);
            decimal = decimal/base;
        }
        return Integer.parseInt(stringBuilder.reverse().toString());
    }

    static int getHexadecimal(String hexadecimal){
        String digits = "0123456789ABCDEF";
        hexadecimal = hexadecimal.toUpperCase();
        int val = 0;
        for(int i = 0; i < hexadecimal.length(); i++){
            char c = hexadecimal.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val+d;
        }
        return val;
    }

    static String getHexadecimalToDecimal(int decimal){
        int rem;
        StringBuilder hexadecimal = new StringBuilder();
        char[] hexchars ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while (decimal > 0){
            rem = decimal%16;
            hexadecimal.insert(0, hexchars[rem]);
            decimal = decimal/16;
        }
        return hexadecimal.toString();
    }

}
