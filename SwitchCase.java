class SwitchCase{
    public static void main(String[] args){
       System.out.println("This is all about switch case::");
    //    old Method of writing switch statements
    int num=10;
    switch(num){
case 2:System.out.println("This is first case");
break;
case 10:System.out.println("This is best case");
break;
default:System.out.println("last case");
    };

    // if you don't want to use break statements then change column to arrow -> arrow
    String str="Gaurav";
    switch(str){
        case "arrow"->System.out.println("This is not");
        case "vaibhav"->System.out.println("vaibhav hai");
        case "Gaurav"->System.out.println("yup");
    };
    // as a variable
    int age=19;
    String result="";
    switch(age){
        case 20->result="not matched!!";
        case 29->result="matched ~";
        case 45->result="45 is not valid for forms";
        default->result="not make sense";
    };
    System.out.println(result);
    
    // you can use switch as a expresssion

String day="wed";
String ans=" ";
ans =switch(day){
    case "sun"->"sunday hai";
    case "sat"->"saturday";
    case "wed"->"sunday";
    default->"Tuseday hain ";
};
System.out.println(ans);
// if you not use -> then use yeild

    };
}