package main;

public class Day2 {
    private static int[] code1 = {1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,9,19,1,19,5,23,1,13,23,27,1,27,6,31,2,31,6,35,2,6,35,39,1,39,5,43,1,13,43,47,1,6,47,51,2,13,51,55,1,10,55,59,1,59,5,63,1,10,63,67,1,67,5,71,1,71,10,75,1,9,75,79,2,13,79,83,1,9,83,87,2,87,13,91,1,10,91,95,1,95,9,99,1,13,99,103,2,103,13,107,1,107,10,111,2,10,111,115,1,115,9,119,2,119,6,123,1,5,123,127,1,5,127,131,1,10,131,135,1,135,6,139,1,10,139,143,1,143,6,147,2,147,13,151,1,5,151,155,1,155,5,159,1,159,2,163,1,163,9,0,99,2,14,0,0};
    private static int[] code2 = {1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,9,19,1,19,5,23,1,13,23,27,1,27,6,31,2,31,6,35,2,6,35,39,1,39,5,43,1,13,43,47,1,6,47,51,2,13,51,55,1,10,55,59,1,59,5,63,1,10,63,67,1,67,5,71,1,71,10,75,1,9,75,79,2,13,79,83,1,9,83,87,2,87,13,91,1,10,91,95,1,95,9,99,1,13,99,103,2,103,13,107,1,107,10,111,2,10,111,115,1,115,9,119,2,119,6,123,1,5,123,127,1,5,127,131,1,10,131,135,1,135,6,139,1,10,139,143,1,143,6,147,2,147,13,151,1,5,151,155,1,155,5,159,1,159,2,163,1,163,9,0,99,2,14,0,0};

    private static int[] makeOpCode (int[] codeList){
        int[] result = codeList;
        for(int i = 0; i < result.length; i = i+4){
            switch (result[i]){
                case 99: return result;
                case 1: result[result[i+3]] = result[result[i+1]] + result[result[i+2]];
                        break;
                case 2: result[result[i+3]] = result[result[i+1]] * result[result[i+2]];
                        break;
            }
        }
        return result;
    }

    private static void printCode(int[] codeList){
        for(int i=0; i < codeList.length; i++){
            System.out.print(codeList[i] + " ");
        }
        System.out.println();
        int[] correctedCode = makeOpCode(codeList);
        for(int j=0; j < correctedCode.length; j++){
            System.out.print(correctedCode[j] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        //Part1
        int[] testCode1 = {1,0,0,0,99};
        int[] testCode2 = {2,3,0,3,99};
        int[] testCode3 = {2,4,4,5,99,0};
        int[] testCode4 = {1,1,1,4,99,5,6,0,99};
        int[] testCode5 = {1,9,10,3,2,3,11,0,99,30,40,50};


        printCode(testCode1);
        printCode(testCode2);
        printCode(testCode3);
        printCode(testCode4);
        printCode(testCode5);

        printCode(code1);
        printCode(code2);
        //Part2



    }
}
