interface director{
    void giveDirection();
    void setFilmStyle(String filmStyle);
}

interface actor{
    void act();
    void setActorStyle(String actorStyle);
}

 class ActorDirector implements director, actor{
    String name;
    int age;
    int numberOfFilmsDirected;
    String filmStyle;
    int numberOfFilmsActed;
    String actorStyle;

    ActorDirector(String name, int age, int numberOfFilmsDirected, int numberOfFilmsActed){
        this.name = name;
        this.age = age;
        this.numberOfFilmsActed = numberOfFilmsActed;
        this.numberOfFilmsDirected = numberOfFilmsDirected;
        this.filmStyle = "";
        this.actorStyle = "";
    }

    @Override
    public void giveDirection() {
        System.out.println("I am directing!");
    }
    @Override
    public void setFilmStyle(String filmStyle) {
        this.filmStyle = filmStyle;
    }
    @Override
    public void act() {
        System.out.println("I am acting!");
    }
    @Override
    public void setActorStyle(String actorStyle) {
        this.actorStyle = actorStyle;
    }

    public void showInfo(){
        System.out.println("Name: " + name + "\nAge: " + age + "\nNumber of Directions: " + numberOfFilmsDirected + 
        "\nActor Style: " + actorStyle);
    }
}

public class Interface_Demo{
    public static void main(String[] args) {
        ActorDirector jonFavreau = new ActorDirector("Jon Favreau", 45, 15, 30);
        jonFavreau.setActorStyle("Funny");
        jonFavreau.showInfo();
        
    }
}