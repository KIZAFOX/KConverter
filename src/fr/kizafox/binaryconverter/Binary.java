package fr.kizafox.binaryconverter;

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

}
