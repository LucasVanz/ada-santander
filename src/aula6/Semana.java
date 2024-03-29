package aula6;

public enum Semana {
    DOMINGO("domingo", 1),
    SEGUNDA_FEIRA("segunda-feira", 2),
    TERCA_FEIRA("terça-feira", 3),
    QUARTA_FEIRA("quarta-feira", 4),
    QUINTA_FEIRA("quinta-feira", 5),
    SEXTA_FEIRA("sexta-feira", 6),
    SABADO("sábado", 7);

    final String name;
    final int dia;

    Semana(String name, int dia){
        this.name = name;
        this.dia = dia;
    }

    public String getName(){
        return name;
    }

    public int getDia(){
        return dia;
    }

    public static Semana enumDiaSemana(String nome){
        for (Semana dia: Semana.values()) {
            if (dia.getName().equalsIgnoreCase(nome)){
                return dia;
            }
        }
        throw new IllegalArgumentException("Dia inválido " + nome);
    }
        
}
