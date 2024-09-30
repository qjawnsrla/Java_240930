package 싱글톤;

public class Student {
    String name;
    int id;

    // 아래 코드 한줄이면 어디서든지 sinleton에 참조가능
    Singleton singleton = Singleton.getSingleton();     // 이미 만들어진 싱글톤 객체의 주소를 대입

    void setInfo(String name, int id){
        singleton.name = name;      // 싱글톤 객체의 인스턴스 필드 객체 접근
        singleton.id = id;
    }
    void viewInfo(){
        System.out.println("이름 : " + singleton.name);
        System.out.println("아이디 : " + singleton.id);

    }
}
