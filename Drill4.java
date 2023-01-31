class Drill4{
    String phaseOfWater(int num){
        if(num >= 100){
            return "vapor";
        }

        if(num < 100 && num > 0){
            return "liquid";
        }

        else return "solid";
    }

    int maxDifference(int one, int two, int three){
        int[] intArray = new int[3];
        intArray[0] = one;
        intArray[1] = two;
        intArray[2] = three;

        int maxDiff = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 2; j >= 0; j--){
                if(intArray[i] - intArray[j] > maxDiff){
                    maxDiff = intArray[i] - intArray[j];
                }
            }
        }

        return maxDiff;
    }

    double ringArea(double InnerCirc, double OuterCirc){
        double Circ1Area = InnerCirc*InnerCirc*Math.PI;
        double Circ2Area = OuterCirc*OuterCirc*Math.PI;

        return Circ2Area - Circ1Area;
    }

    String POW1 = phaseOfWater(100); //expected vapor
    String POW2 = phaseOfWater(0); //expected solid
    String POW3 = phaseOfWater(50); //expected liquid

    int MD1 = maxDifference(2, 4, 6); //expected 4
    int MD2 = maxDifference(-1, 2, 5); //expected 6
    int MD3 = maxDifference(-2, -3, 4); //expected 7

    double r1 = ringArea(2, 4); //expected 37.699
    double r2 = ringArea(2, 6); //expected 100.53
    double r3 = ringArea(24, 3);// expected -1781.28


}

