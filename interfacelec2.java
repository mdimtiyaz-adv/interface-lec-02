// 3.but it doesnot guarantee that the will company will provide laptop or desktop . they provide computer and a computer can be laptop or desktop so we make a class computer here
interface Computer {
    public abstract void coding();
}

// 2. but it is not sure that the company will provide laptop they can also
// provide desktop so
class Desktop implements Computer {
    public void coding() {
        System.out.println("in desktop");
    }
}

// 1. lets say i join a company as a developer.so i need to code for that i need
// a laptop.so
class Laptop implements Computer {
    public void coding() {
        System.out.println("started coding...");
    }
}

class Developer {
    public void dev(Computer lap) {
        lap.coding();
    }
}

public class interfacelec2 {
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer obj = new Developer();
        obj.dev(desk);
    }
}
