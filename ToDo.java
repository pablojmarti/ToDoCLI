import java.io.*;
class ToDo {
  public static void main(String[] args){

  }
}

class TDList{
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
