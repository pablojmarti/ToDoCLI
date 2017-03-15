import java.io.*;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;


class ToDo {
  public static void main(String[] args){

    System.out.println("test");

    Menu menu = new Menu();
    TDList list = new TDList();
    menu.showMenu(list);
  }
}

class Menu{

  private String menu_items;
  private ArrayList menu = new ArrayList();

  Menu(){
    this.menu_items = "Add Task,Delete Task,Mark Task As Complete,Mark Task as Inprogress,Show Tasks,Quit";
    String[] thing = menu_items.split(",");
    for(int i = 0; i < thing.length; i++){
      menu.add(thing[i]);
    }
  }

  private void getMenu(){
    for(int i = 0; i < menu.size(); i++){
      System.out.println(i+1 + ". " + menu.get(i));
    }
  }

  public void showMenu(TDList list){
    boolean exit = false;
    while(exit != true ){
      System.out.println("What would you like to do?");
      System.out.println("--------------------------");
      getMenu();
      int choice = getChoice();
      exit = runChoice(choice, list);
      System.out.println("--------------------------");
    }
  }

  private int getChoice(){
    Scanner kb = new Scanner(System.in);
    return kb.nextInt();
  }

  private boolean runChoice(int choice, TDList list){
    boolean exit = false;
    switch(choice){
      case 1: 
        list.add();
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
      case 5:
        list.show();
        break;
      case 6:
        exit = true;
        break;
      default:
        System.out.println("Invalid choice");
        System.out.println("Please try again");
        break;
    }
    return exit;
  }

}

class TDList{
  private int index;
  private Date start_date;
  private String description;
  private String task;
  private Scanner kb;

  TDList(){
    this.kb = new Scanner(System.in); 
    this.index = 0;
  }

  public void add(){
    System.out.print("Enter Task name: ");
    this.task = kb.nextLine();
    this.start_date = new Date();
    System.out.print("Enter Task Description: ");
    this.description = kb.nextLine();
    index++;
  }

  public void show(){
    System.out.println("Index: " + this.getIndex() + "\n"
                        + "Task: " + this.getTask() + "\n"
                        + "Description: " + this.getDescription() + "\n" 
                        + "Start Date: " + this.getStartDate()
                       );

  }

  public String getTask(){
    return task;
  }

  public int getIndex(){
    return index;
  }

  public String getDescription(){
    return description;
  }

  public Date getStartDate(){
    return start_date;
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
