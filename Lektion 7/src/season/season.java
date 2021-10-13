package season;


public class season {
    private int day;
    private int month;
    public season(int day, int month){
        this.day=day;
        this.month=month;
    }
    public String getMonth(){
      String result = "";

        if (month < 3 || month == 12){
            result = "winter";
        }else if(month < 6){
            result = "spring";
        }else if(month < 9){
            result = "summer";
        }else if(month < 12){
            result = "Fall";
        }
        return result;
    }
}
