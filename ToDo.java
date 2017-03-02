import java.io.*;
import java.util.Date;
class ToDo {
  public static void main(String[] args){

  }
}

class TDList{
  int index;
  Date start_date;
  String Description;
  String item;

  TDList(){
  }
}

class Options{
  String option,
         flag;

  public Options(String option){
    this.option = option;
  }
  public Options(String option, String flag){
    this.flag = flag;
    this.option = option;
  }

  public String getFlag(){
    return flag;
  }

  public String getOpt(){
    return option;
  }
}
