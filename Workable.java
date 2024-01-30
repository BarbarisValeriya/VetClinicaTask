public interface Workable {
    default void workSurgery(){
        System.out.println("Сотрудник проводит операцию");
    }
    default void workInspection(){
        System.out.println("Сотрудник проводит осмотр животного");
    }
    default void workPaper(){
        System.out.println("Сотрудник работает с документацией");
    }

    default void workAssistance() {
       System.out.println("Сотрудник ассистирует");
   }
    default void eat() {
        System.out.println("Сотрудник на обеде");
    }
    default void vacation() {
        System.out.println("Сотрудник в отпуске");
    }
    default void weekend() {
        System.out.println("У сотрудника выходной");
    }

}
