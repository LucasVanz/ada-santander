package aula6;

public enum Estado {
    MG("Minas Gerais"),
    RJ("Rio de janeiro"),
    SP("São Paulo");
    final String name;

    Estado(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
