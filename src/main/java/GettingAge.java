public class GettingAge {
    public static int getAge(double score){
        int result;
        switch ((int)Math.ceil(score)){
            case 1:
                result=6;
                break;
            case 2:
                result=7;
                break;
            case 3:
                result=9;
                break;
            case 4:
                result=10;
                break;
            case 5:
                result=11;
                break;
            case 6:
                result=12;
                break;
            case 7:
                result=13;
                break;
            case 8:
                result=14;
                break;
            case 9:
                result=15;
                break;
            case 10:
                result=16;
                break;
            case 11:
                result=17;
                break;
            case 12:
                result=18;
                break;
            case 13:
                result=24;
                break;
            default:
                result=0;
                break;
        }
        return result;
    }
}
